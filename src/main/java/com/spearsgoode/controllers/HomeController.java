package com.spearsgoode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Add model attributes
        model.addAttribute("message", "Welcome to the homepage!");

        // Return the view name
        return "home";
    }
}
