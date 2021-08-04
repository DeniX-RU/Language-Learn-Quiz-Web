package com.languagelearnquiz.webquiz.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/game")
public class gameController {
    @GetMapping(path="/setup")
    public String gameSetupHTML() {
        return "game/setup/Setup";
    }
}
