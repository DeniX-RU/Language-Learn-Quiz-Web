package com.languagelearnquiz.webquiz.game.setup;

import com.languagelearnquiz.webquiz.game.difficulty.Difficulty;
import com.languagelearnquiz.webquiz.game.languages.Languages;
import com.languagelearnquiz.webquiz.game.options.Options;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("game/setup")
public class SetupController {
    @PostMapping()
    public Options lg(@ModelAttribute Options options) {
//// If any of nodes have been highlighted (something isnt selected yet), then program will not start the game
//        if (!highlight(objectsToHighlight)) {
//            Setup.launchGame();
//        }
        System.out.println(options);
        return options;
    }
}
