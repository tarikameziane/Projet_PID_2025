package com.example.projet_pid_2025.services;

import com.example.projet_pid_2025.model.Artiste;
import com.example.projet_pid_2025.repositpry.ArtisteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArtisteServices {

    private final ArtisteRepository artisteRepository;

    public ArtisteServices(ArtisteRepository artisteRepository) {
        this.artisteRepository = artisteRepository;
    }

    public List<Artiste> getAllArtistes() {
        List<Artiste> artistes = new ArrayList<>();
        artisteRepository.findAll().forEach(artistes::add);
        return artistes;
    }
    public Optional<Artiste> getArtisteById(Long id) {
       return artisteRepository.findById(id) ;
    }
    public void addArtiste(Artiste artiste) {
        artisteRepository.save(artiste);
    }
    public void updateArtiste(Long  idArtiste,Artiste artiste) {
        Artiste artisteToUpdate = artisteRepository.findById(idArtiste).get();
        artisteToUpdate.setFirstname(artiste.getFirstname());
        artisteToUpdate.setLastname(artiste.getLastname());
        artisteRepository.save(artisteToUpdate);

    }
    public void deleteArtiste(Long id) {
        artisteRepository.deleteById(id);
    }

}
