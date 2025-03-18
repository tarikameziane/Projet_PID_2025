package com.example.projet_pid_2025.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="artists")
public class Artiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String firstname ;
    private String lastname ;

    @ManyToMany(mappedBy = "artists")
    private List<Type> types ;
}
