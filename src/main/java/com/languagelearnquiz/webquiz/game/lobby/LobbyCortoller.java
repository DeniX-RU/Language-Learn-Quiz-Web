package com.languagelearnquiz.webquiz.game.lobby;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/game")
public class LobbyCortoller {
    @GetMapping(path="/lobby")
    public String lobbyHTML(){
        return "game/lobby/Lobby";
    }

//    @GetMapping("/hello")
//    public String greeting(){
//
//    }
}
