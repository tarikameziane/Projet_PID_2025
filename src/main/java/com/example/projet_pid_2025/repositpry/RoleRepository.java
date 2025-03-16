package com.example.projet_pid_2025.repositpry;

import com.example.projet_pid_2025.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
