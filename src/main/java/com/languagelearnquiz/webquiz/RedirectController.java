package com.languagelearnquiz.webquiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(path="/")
public class RedirectController {
    @GetMapping
    public RedirectView redirecting() {
        return new RedirectView("game/lobby");
    }
}
