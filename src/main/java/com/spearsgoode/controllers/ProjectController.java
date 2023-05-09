package com.spearsgoode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @GetMapping("/projects")
    public String home(Model model) {

        // Return the view name
        return "projects";
    }
}
