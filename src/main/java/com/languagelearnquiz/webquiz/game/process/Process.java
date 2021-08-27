package com.languagelearnquiz.webquiz.game.process;

import com.languagelearnquiz.webquiz.game.difficulty.Difficulty;
import com.languagelearnquiz.webquiz.game.options.Options;
import com.languagelearnquiz.webquiz.game.state.State;
import com.languagelearnquiz.webquiz.game.word.Word;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@Getter
@Setter
public class Process {
    public static Process process;
    public State state;
    public int wordInTheCount;
    public int points;
    public String userTranslation;
    public String userType;
    public Word word;


    public static void setup(Options options, Model model) {
        createState(options);
        model.addAttribute("process",process);
//        removeUnneededNodes(); // No need, because the js file will do it
    }

    public static void createState(Options options) {
        process = new Process();
        process.state = new State();
        process.state.points = 0;
        process.state.numberOfWords = Difficulty.getWords().get(options.difficulty.index);
        process.state.typeOfGame = options.languages.index; //TODO rename var typeOfGame to 'languages'
        process.state.usingPartsOfSpeech = options.partsOfSpeech;
        process.state.name = options.username;

//        process.word = new Word();

        process.wordInTheCount = 0;
        process.points = 0;
        process.userTranslation = "";
        process.userType = "";
    }
}
