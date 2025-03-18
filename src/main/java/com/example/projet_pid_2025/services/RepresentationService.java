package com.example.projet_pid_2025.services;

import com.example.projet_pid_2025.model.Location;
import com.example.projet_pid_2025.model.Representation;
import com.example.projet_pid_2025.model.Show;
import com.example.projet_pid_2025.repositpry.RepresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RepresentationService {
    @Autowired
    private RepresentationRepository repository;


    public List<Representation> getAll() {
        List<Representation> representations = new ArrayList<>();

        repository.findAll().forEach(representations::add);

        return representations;
    }

    public Representation get(String id) {
        Long indice = (long) Integer.parseInt(id);
        Optional<Representation> representation = repository.findById(indice);

        return representation.isPresent() ? representation.get() : null;
    }

    public void add(Representation representation) {
        repository.save(representation);
    }

    public void update(String id, Representation representation) {
        repository.save(representation);
    }

    public void delete(String id) {
        Long indice = (long) Integer.parseInt(id);

        repository.deleteById(indice);
    }

    public List<Representation> getFromLocation(Location location) {
        return repository.findByLocation(location);
    }

    public List<Representation> getFromShow(Show show) {
        return repository.findByShow(show);
    }

}
