package com.example.projet_pid_2025.controller;

import com.example.projet_pid_2025.model.Role;
import com.example.projet_pid_2025.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    RoleService service;

    @GetMapping("/roles")
    public String index2(Model model) {
        List<Role> roles = service.getAllRoles();

        model.addAttribute("roles", roles);
        model.addAttribute("title", "Liste des roles");

        return "role/index";
    }

    @GetMapping("/roles/{id}")
    public String show(Model model, @PathVariable("id")Long id) {
        Role role = service.getRoleById(id);

        model.addAttribute("role", role);
        model.addAttribute("title", "Fiche d'un role");

        return "role/show";
    }

}
