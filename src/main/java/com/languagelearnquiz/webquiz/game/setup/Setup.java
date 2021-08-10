package com.languagelearnquiz.webquiz.game.setup;

import com.languagelearnquiz.webquiz.game.difficulty.Difficulty;
import com.languagelearnquiz.webquiz.game.languages.Languages;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Setup {
    private static Model attributes;
    public static void setup(Model model) {
        attributes = model;
        setupLabels();
    }

    private static void setupLabels() {
        setDifficultiesText();
        setTypeOfGameText();
    }

    private static void setDifficultiesText() {
        // When page gets loaded, the text of the buttons needs to be replaced to an appropriate difficulty
        attributes.addAllAttributes(new HashMap<String, String>(){{
            put("dif0",Difficulty.getDifficultyByIndex(0));
            put("dif1",Difficulty.getDifficultyByIndex(1));
            put("dif2",Difficulty.getDifficultyByIndex(2));
        }});

//        List<Difficulty> difficulties = Arrays.asList(
//                new Difficulty(0),
//                new Difficulty(1),
//                new Difficulty(2)
//        );
    }
    private static void setTypeOfGameText() {
        // When page gets loaded, the text of the buttons needs to be replaced to an appropriate type of the game
        attributes.addAllAttributes(new HashMap<String, String>(){{
            put("type0",Languages.getTypeOfGameAsTitle(0));
            put("type1",Languages.getTypeOfGameAsTitle(1));
            put("type2",Languages.getTypeOfGameAsTitle(2));
        }});
    }

}
