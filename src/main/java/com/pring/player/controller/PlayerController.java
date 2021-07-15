package com.pring.player.controller;

import com.pring.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    //http://localhost:8080/players
    @GetMapping("/players")
    public String getPlayers(Model model) {
        model.addAttribute("players", playerService.getPlayers());

        return "home";
    }

    @GetMapping("/addFormPlayer")
    public String addFormPlayer(){
        return "form-player";
    }
}
