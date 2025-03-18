package com.example.projet_pid_2025.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "representations")
public class Representation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="show_id", nullable=false)
    private Show show;


    private LocalDateTime when;

    @ManyToOne
    @JoinColumn(name="location_id", nullable=true)
    private Location location;

}
