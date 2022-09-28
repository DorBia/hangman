package org.example;

import static org.example.Game.floorArr;
import static org.example.Game.guessedLetters;

public class Display {

    // display word and already guessed letters
    public static void displayWordAndLetters() {
        System.out.println(String.join(" ", floorArr));
        System.out.println("Already guessed letters: " + guessedLetters);
    }

    // display a drawing of a hangman
    public static void displayDrawing(int lives) {
        switch (lives) {
            case 7:
                System.out.println();
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
                System.out.println();
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
                System.out.println("  __________");
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
                System.out.println("  __________");
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
                System.out.println("  __________");
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
                System.out.println("  __________");
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
                System.out.println("  __________");
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
                System.out.println("  __________");
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
