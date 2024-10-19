package com.example.projet_pid_2025.repositpry;

import com.example.projet_pid_2025.model.Artiste;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ArtisteRepositpry extends CrudRepository<Artiste,Long> {

    List<Artiste> findAll();

    @Override
    Optional<Artiste> findById(Long id);
}
