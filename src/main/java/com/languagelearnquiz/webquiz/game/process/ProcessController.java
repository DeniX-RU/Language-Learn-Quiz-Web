package com.languagelearnquiz.webquiz.game.process;

import com.languagelearnquiz.webquiz.game.options.Options;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("game/process")
public class ProcessController {
    @PostMapping(path="wait")
    public String gameProcessWaitHTML(@ModelAttribute Options options, Model model) {
        Process.setup(options, model);
        return "game/process/ProcessWait";
    }
//    @PostMapping()
//    public String gameProcessHTML(@ModelAttribute Options options, Model model) {
//        Process.nextWord(model);
//        return "game/process/Process";
//    }
    @PostMapping
    public String nextWord(@ModelAttribute Options options, Model model) {
//        Process.nextWord();
        Process.setup(options, model);
        return "game/process/Process";
    }
}
