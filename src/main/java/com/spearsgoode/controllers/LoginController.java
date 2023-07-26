package com.spearsgoode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(path="/login")
    public String loginPage(Model model) {
        return "login";
    }
}
