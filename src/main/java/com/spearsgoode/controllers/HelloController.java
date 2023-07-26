package com.spearsgoode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping(path="hello")
    public String HelloPage(Model model) {
        return "hello";
    }
}