package com.example.projet_pid_2025.controller;

import java.util.List;

import com.example.projet_pid_2025.model.Type;
import com.example.projet_pid_2025.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class TypeController {
    @Autowired
    TypeService service;

    @GetMapping("/types")
    public String index2(Model model) {
        List<Type> types = service.getAllTypes();

        model.addAttribute("types", types);
        model.addAttribute("title", "Liste des types");

        return "type/index";
    }

    @GetMapping("/types/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        Type type = service.getTypeById(id);

        model.addAttribute("type", type);
        model.addAttribute("title", "Fiche d'un type");

        return "type/show";
    }

}
