package com.example.projet_pid_2025.repositpry;

import com.example.projet_pid_2025.model.Location;
import com.example.projet_pid_2025.model.Representation;
import com.example.projet_pid_2025.model.Show;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RepresentationRepository extends CrudRepository<Representation, Long> {
    List<Representation> findByShow(Show show);
    List<Representation> findByLocation(Location location);
    List<Representation> findByWhen(LocalDateTime when);

}
