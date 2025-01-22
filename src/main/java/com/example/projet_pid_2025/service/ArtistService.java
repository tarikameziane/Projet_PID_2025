package com.example.projet_pid_2025.service;

import com.example.projet_pid_2025.model.Artiste;
import com.example.projet_pid_2025.repositpry.ArtisteRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    ArtisteRepositpry artistRepository ;

    public List<Artiste> getALlArtiste(){

        return artistRepository.findAll() ;
    }
    public Artiste getArtist(long id) {
        return artistRepository.findById(id).orElseThrow();
    }

    public void addArtist(Artiste artiste) {
        artistRepository.save(artiste);
    }

    public void updateArtist(long id, Artiste artist) {
        artistRepository.save(artist);
    }

    public void deleteArtist(long id) {
        artistRepository.deleteById(id);
    }

}
