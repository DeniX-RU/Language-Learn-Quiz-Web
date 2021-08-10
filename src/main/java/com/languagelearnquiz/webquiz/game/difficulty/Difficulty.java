package com.languagelearnquiz.webquiz.game.difficulty;

import java.util.ArrayList;
import java.util.List;

public class Difficulty {
    public int index;
    public String title;

    public Difficulty(int index) {
        this.index = index;
        this.title = getDifficultyByIndex(index);
    }

    public static List<Integer> getWords() {
        List<Integer> words = new ArrayList<>();
        words.add(10);
        words.add(15);
        words.add(20);
        return words;
    }

    public static String getDifficultyByIndex(int parseInt) {
        return "%d words".formatted(getWords().get(parseInt));
    }
}
