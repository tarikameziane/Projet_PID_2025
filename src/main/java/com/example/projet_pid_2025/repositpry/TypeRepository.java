package com.example.projet_pid_2025.repositpry;

import com.example.projet_pid_2025.model.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TypeRepository extends CrudRepository<Type, Long> {

    Type findByType(String type);
    Optional<Type> findById(Long id);
}
