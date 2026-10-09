package com.aakash.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class welcomeController {

    @GetMapping({"/","/welcome"})

    public String getWelcomeMessage() {
        return "welcomeMessage";
    }
}
