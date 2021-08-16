package com.languagelearnquiz.webquiz.game.setup;

import com.languagelearnquiz.webquiz.game.difficulty.Difficulty;
import com.languagelearnquiz.webquiz.game.languages.Languages;
import com.languagelearnquiz.webquiz.game.options.Options;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;

public class Setup {
    private static Model attributes;
    public static void setup(Model model) {
        attributes = model;
        setupLabels();
    }

    private static void setupLabels() {
        attributes.addAttribute("options", new Options());
        attributes.addAttribute("difficulties",Difficulty.difficulties());
        attributes.addAttribute("languages", List.of(Languages.types));
//        setDifficultiesText();
//        setTypeOfGameText();
    }

    private static void setDifficultiesText() {
        attributes.addAttribute("difficulties",Difficulty.difficulties());
        attributes.addAttribute("difficulty",new Difficulty());
    }
    private static void setTypeOfGameText() {
        attributes.addAttribute("languages", List.of(Languages.types));
        attributes.addAttribute("language",new Languages());
    }

}
