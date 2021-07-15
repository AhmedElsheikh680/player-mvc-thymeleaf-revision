package com.pring.player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/players")
public class PlayerController {

    @GetMapping("/profile")
    public String getPlayers(Model model) {
        model.addAttribute("name" ,"AHmed");

        return "home";
    }
}
