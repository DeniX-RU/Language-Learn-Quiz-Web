package com.languagelearnquiz.webquiz.game.difficulty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Difficulty {
    public int index = -1;
    public String title = null;

    public void setIndex(int index) {
        this.index = index;
        this.title = getDifficultyByIndex(this.index);
    }

    public static List<String> difficulties() {
        return Arrays.asList(
                getDifficultyByIndex(0),
                getDifficultyByIndex(1),
                getDifficultyByIndex(2)
        );
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

    public static int getIndexByTitle(String title) { return getWords().indexOf(Integer.parseInt(title.replaceAll("[^0-9]","")));
    }
}
