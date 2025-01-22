package com.example.projet_pid_2025.presentation.controller;

import com.example.projet_pid_2025.model.Artiste;
import com.example.projet_pid_2025.repositpry.ArtisteRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ArtisteController {
    @Autowired
    ArtisteRepositpry artisteRepositpry;

    @GetMapping("/artists")
    public String index(Model model) {
        List<Artiste> artists = artisteRepositpry.findAll();

        model.addAttribute("artists", artists);
        model.addAttribute("title", "Liste des artistes");

        return "artist/index";
    }

}
