package com.languagelearnquiz.webquiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/")
public class RedirectController {
    @GetMapping
    public ModelAndView redirecting() {
        return new ModelAndView("redirect:/game/lobby");
    }
    @GetMapping(path="game")
    public ModelAndView redirectingFromGame() {
        return new ModelAndView("redirect:/game/lobby");
    }
}
