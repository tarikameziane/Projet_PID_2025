package com.example.projet_pid_2025.repositpry;

import com.example.projet_pid_2025.model.Location;
import com.example.projet_pid_2025.model.Show;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShowRepository extends CrudRepository<Show, Long> {
    Show findBySlug(String slug);
    Show findByTitle(String title);
    List<Show> findByLocation(Location location);

}
