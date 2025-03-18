package com.example.projet_pid_2025.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "localities")
public class Locality {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String postalCode;
    private String locality;

    @OneToMany( targetEntity=Location.class, mappedBy="locality" )
    private List<Location> locations = new ArrayList<>();


}
