package com.languagelearnquiz.webquiz.game.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/data/usernames")
public class UserController {
    @GetMapping(path="/isAvailable/{username}")
    public Map<String, Boolean> isAvailable(@PathVariable String username) {
        return Collections.singletonMap("success",User.checkAvailability(username));
//        return  true;
    }
}
