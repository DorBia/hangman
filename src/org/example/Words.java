package org.example;
import java.util.Random;

public class Words {
    private static final Random RANDOM = new Random();
    private static final String[] words = {"different", "discussion", "grammatical", "framework", "circular",
            "introduction", "difficult", "question", "slippery", "electrician", "scissors", "suggestion", "scientist",
            "advertise", "moonlight", "confident", "punctual", "favorite", "opposite", "confession", "extension",
            "prejudice", "overcome", "straighten", "immediate", "daylight", "although", "efficiency", "translator",
            "composition", "shilling", "industry", "adoption", "inventor", "invention", "straight", "telephone",
            "peculiar", "comparison", "violence", "pretense", "destructive", "disappear", "excessive", "exercise",
            "procession", "continue", "homemade", "electrician", "elephant"};

    // get a random word from the array
    public static String getWord() {
        return words[RANDOM.nextInt(words.length)].toUpperCase();
    }

}