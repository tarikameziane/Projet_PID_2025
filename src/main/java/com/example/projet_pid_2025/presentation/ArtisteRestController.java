package com.example.projet_pid_2025.presentation;

import com.example.projet_pid_2025.model.Artiste;
import com.example.projet_pid_2025.repositpry.ArtisteRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artises")
public class ArtisteRestController {

    @Autowired
    ArtisteRepositpry artisteRepositpry;

    @GetMapping("/")
    public List<Artiste> toutLesArtises(){

        return artisteRepositpry.findAll();
    };

    @GetMapping("/{id}")
    public Optional<Artiste> chercherParId(@PathVariable("id") Long id ){
        return artisteRepositpry.findById(id);
    }
}
