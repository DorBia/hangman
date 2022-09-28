package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Game {
    static int lives = 8;
    private static final Pattern pattern = Pattern.compile("[a-zA-Z]");

    static String word = Words.getWord();
    static String[] floorArr = new String[word.length()];
    static Scanner scanner = new Scanner(System.in);
    static boolean isGameOn = true;
    static ArrayList<String> guessedLetters = new ArrayList<>();

    public static void setLevel() {
        System.out.println("What level do you want to play? easy = 8 lives/hard = 5 lives/extreme = 3 lives");
        Scanner newScanner = new Scanner(System.in);
        String level = newScanner.nextLine();
        switch (level) {
            case "hard":
                lives = 5;
                break;
            case "extreme":
                lives = 3;
                break;
            default:
                lives = 8;
                break;
        }
    }

    // reset everything to start game
    public static void startGame() {
        setLevel();
        word = Words.getWord();
        floorArr = new String[word.length()];
        isGameOn = true;
        guessedLetters.clear();
        for (int i = 0; i < word.length(); i++) {
            floorArr[i] = "_";
        }
        System.out.println(String.join(" ", floorArr));
    }

    public static void playGame() {
        startGame();

        while(isGameOn) {
            // reset boolean to false, print guess a letter, take input, check if letter in a word, if yes add it to the
            // display, if not take away a life. Add letter to guessed array.
            boolean inAWord = false;
            System.out.println("Guess the letter");
            String letter = "" + scanner.next().toUpperCase().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if(letter.equals(""+word.charAt(i))) {
                    floorArr[i] = letter;
                    inAWord = true;
                }
            }
            if(!inAWord && checkLetter(letter)) lives--;
            if(checkLetter(letter)) guessedLetters.add(letter);

            // display drawing, word and guessed letters
            Display.displayDrawing(lives);
            Display.displayWordAndLetters();

            // check for endgame
            if(lives == 0) {
                System.out.println("The word was: " + word);
                playAgain();
            }
            if(!Arrays.toString(floorArr).contains("_")) {
                System.out.println("You won!");
                playAgain();
            }
        }
    }

    // check if user wants to play again, and if yes, start game
    public static void playAgain() {
        isGameOn = false;
        System.out.println("Again? yes/no");
        Scanner scan = new Scanner(System.in);
        if(scan.nextLine().toLowerCase().startsWith("y")) startGame();
    }

    // check if input is a letter and if it's not in the guessed letters arraylist
    public static boolean checkLetter(String letter) {
        return (!guessedLetters.contains(letter) && pattern.matcher(letter).matches());
    }
}
