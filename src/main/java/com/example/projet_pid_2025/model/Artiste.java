package com.example.projet_pid_2025.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;



@Data
@Entity
@Table(name="artiste")
public class Artiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Firstname ;
    private String Lastname ;

}
