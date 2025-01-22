package com.example.projet_pid_2025.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String login ;
    private String password ;
    private String firstname ;
    private String lasyname ;
    private String email ;
    private String langue ;

    @ManyToMany
    List<Role> roles ;

}
