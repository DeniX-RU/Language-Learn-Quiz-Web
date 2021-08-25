package com.languagelearnquiz.webquiz.game.setup;

import com.languagelearnquiz.webquiz.game.difficulty.Difficulty;
import com.languagelearnquiz.webquiz.game.languages.Languages;
import com.languagelearnquiz.webquiz.game.options.Options;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("game/setup")
public class SetupController {
    // TODO make this variable to be across all the controllers

    @PostMapping()
//    @ResponseStatus(value = HttpStatus.OK)
//    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    //TODO change method name
    public Options lg(@ModelAttribute Options options, HttpServletResponse response, Model model) {
        return options;
//        if (!highlight(options)) {
//            response.setStatus(HttpServletResponse.SC_OK);
//            return "game/lobby/Lobby";
//        }
//        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
//        return null;
    }

    private boolean highlight(Options options) {
        return options.difficulty == null;
    }
}
