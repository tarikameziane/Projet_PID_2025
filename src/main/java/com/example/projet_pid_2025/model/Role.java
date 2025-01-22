package com.example.projet_pid_2025.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String role ;

    @ManyToMany
    List<User> users ;
}
