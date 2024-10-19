package com.example.projet_pid_2025.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;



@Data
@Entity
@Table(name="artistes")
public class Artiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Nom ;
    private String Prenom ;
    private Date DateDeNaissance ;
}
