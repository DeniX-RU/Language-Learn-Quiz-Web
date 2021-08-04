package com.languagelearnquiz.webquiz.game.setup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/game")
public class SetupController {
    @GetMapping
    public String lobbyHTML(){
        return "lobby/Lobby";
    }

//    @GetMapping("/hello")
//    public String greeting(){
//
//    }
}
