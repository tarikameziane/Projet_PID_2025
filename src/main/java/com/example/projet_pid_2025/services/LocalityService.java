package com.example.projet_pid_2025.services;

import com.example.projet_pid_2025.model.Locality;
import com.example.projet_pid_2025.repositpry.LocalityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocalityService {
    private final LocalityRepository localityRepository;

    public LocalityService(LocalityRepository localityRepository) {
        this.localityRepository = localityRepository;
    }

    public List<Locality> getAllLocalities(){
        List<Locality> localities = new ArrayList<>();
        localityRepository.findAll().forEach(localities::add);
        return localities;
    }
    public Locality getLocalityById(Long id){
        return localityRepository.findById(id).orElse(null);
    }
    public void add(Locality locality) {
        localityRepository.save(locality);
    }

    public void update(String id, Locality locality) {
        localityRepository.save(locality);
    }

    public void delete(String id) {
        Long indice = (long) Integer.parseInt(id);
        localityRepository.deleteById(indice);
    }

}

