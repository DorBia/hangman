package org.example;

import static org.example.Game.floorArr;
import static org.example.Game.guessedLetters;

public class Display {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // display word and already guessed letters
    public static void displayWordAndLetters() {
        System.out.println(CYAN + String.join(" ", floorArr));
        System.out.println(PURPLE + "Already guessed letters: " + guessedLetters + RESET);
    }

    // display a drawing of a hangman
    public static void displayDrawing(int lives) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        switch (lives) {
            case 7:
                System.out.println(GREEN);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("____");
                System.out.println("      7 LIVES LEFT");
                System.out.println();
            break;
            case 6:
                System.out.println(GREEN);
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
                System.out.println("      6 LIVES LEFT");
                System.out.println();
                break;
            case 5:
                System.out.println(GREEN + "  __________");
                System.out.println("  |/  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
                System.out.println("       5 LIVES LEFT");
                System.out.println();
                break;

            case 4:
                System.out.println(YELLOW + "  __________");
                System.out.println("  |/       |");
                System.out.println("  |        |");
                System.out.println("  |       (_)");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
                System.out.println("       4 LIVES LEFT");
                System.out.println();
                break;
            case 3:
                System.out.println(YELLOW + "  __________");
                System.out.println("  |/       |");
                System.out.println("  |        |");
                System.out.println("  |       (_)");
                System.out.println("  |        |/");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
                System.out.println("       3 LIVES LEFT");
                System.out.println();
                break;
            case 2:
                System.out.println(RED + "  __________");
                System.out.println("  |/       |");
                System.out.println("  |        |");
                System.out.println("  |       (_)");
                System.out.println("  |       \\|/");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("__|__");
                System.out.println("       2 LIVES LEFT");
                System.out.println();
                break;
            case 1:
                System.out.println(RED + "  __________");
                System.out.println("  |/       |");
                System.out.println("  |        |");
                System.out.println("  |       (_)");
                System.out.println("  |       \\|/");
                System.out.println("  |        |");
                System.out.println("  |       /");
                System.out.println("  |  ");
                System.out.println("__|__");
                System.out.println("       1 LIFE LEFT");
                System.out.println();
                break;
            case 0:
                System.out.println(RED + "  __________");
                System.out.println("  |/       |");
                System.out.println("  |        |");
                System.out.println("  |       (_)");
                System.out.println("  |       \\|/");
                System.out.println("  |        |");
                System.out.println("  |       / \\");
                System.out.println("  |  ");
                System.out.println("__|__");
                System.out.println("        YOU LOSE");
                System.out.println();
                break;

        }
    }
}
