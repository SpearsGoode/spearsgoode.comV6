package com.spearsgoode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtController {

    @GetMapping("/art")
    public String art(Model model) {
        // Add model attributes
        model.addAttribute("message", "Welcome to the Art page!");  //FIXME

        // Return the view name
        return "art";

    }
}
