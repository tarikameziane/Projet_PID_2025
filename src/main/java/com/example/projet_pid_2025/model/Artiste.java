package com.example.projet_pid_2025.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
@Table(name="artistes")
public class Artiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Nom ;
    private String Prenom ;
    private Date DateDeNaissance ;
}
