package com.languagelearnquiz.webquiz.game.setup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("game/setup")
public class SetupController {
    @PostMapping("launchGame")
    public String lg() {
        System.out.println("hello!");
        return "";
    }
}
