package com.example.projet_pid_2025.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "artist_type")
public class ArtistType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="artist_id", nullable=false)
    private Artiste artist;

    @ManyToOne
    @JoinColumn(name="type_id", nullable=false)
    private Type type;

    @ManyToMany(targetEntity=Show.class)
    @JoinTable(
            name = "artist_type_show",
            joinColumns = @JoinColumn(name = "artist_type_id"),
            inverseJoinColumns = @JoinColumn(name = "show_id"))
    private List<Show> shows;

}
