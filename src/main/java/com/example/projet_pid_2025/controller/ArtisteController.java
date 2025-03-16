package com.example.projet_pid_2025.controller;

import com.example.projet_pid_2025.model.Artiste;
import com.example.projet_pid_2025.services.ArtisteServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;



@Controller
public class ArtisteController {
    private final ArtisteServices artisteServices ;

    public ArtisteController(ArtisteServices artisteServices) {
        this.artisteServices = artisteServices;
    }

    @GetMapping("/artists")
    public String index(Model model) {
        List<Artiste> artists = artisteServices.getAllArtistes();

        model.addAttribute("artists", artists);
        model.addAttribute("title", "Liste des artistes");

        return "artist/index";
    }
    @GetMapping("/artists/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        Artiste artist =artisteServices.getArtisteById(id).get();

        model.addAttribute("artist", artist);
        model.addAttribute("title", "Fiche d'un artiste");

        return "artist/show";
    }




}

