package com.languagelearnquiz.webquiz.lobby;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class LobbyCortoller {
    @GetMapping
    public String greeting(){
        return "lobby/lobby";
    }

//    @GetMapping("/hello")
//    public String greeting(){
//
//    }
}
