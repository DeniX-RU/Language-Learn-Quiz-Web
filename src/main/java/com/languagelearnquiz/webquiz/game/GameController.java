package com.languagelearnquiz.webquiz.game;

import com.languagelearnquiz.webquiz.game.setup.Setup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/game") //TODO remade this thing. No need in game controller. Each page will have its own as in GUI
public class GameController {
    @GetMapping(path="/setup")
    public String gameSetupHTML(Model model) {
        Setup.setup(model); // Make it @Postconstruct
        return "game/setup/Setup";
    }
    @GetMapping(path="/lobby")
    public String gameLobbyHTML() {
        return "game/lobby/Lobby";
    }

}
