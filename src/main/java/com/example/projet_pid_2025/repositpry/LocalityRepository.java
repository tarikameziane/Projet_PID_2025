package com.example.projet_pid_2025.repositpry;

import com.example.projet_pid_2025.model.Locality;
import org.springframework.data.repository.CrudRepository;

public interface LocalityRepository extends CrudRepository<Locality, Long> {
    Locality findByPostalCode(String postalCode);

    Locality findByLocality(String locality);

}
