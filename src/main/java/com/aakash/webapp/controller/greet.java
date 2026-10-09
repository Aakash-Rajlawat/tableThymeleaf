package com.aakash.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greet {

    @GetMapping("/greet")
    public String getGreetingMsg(Model model) {
        model.addAttribute("greeting", "Hello, World!");
        return "greet";
    }
}
