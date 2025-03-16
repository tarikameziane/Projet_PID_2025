package com.example.projet_pid_2025.services;

import com.example.projet_pid_2025.model.Role;
import com.example.projet_pid_2025.repositpry.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
     public List<Role> getAllRoles() {
        List<Role> roles = new ArrayList<>();
         roleRepository.findAll().forEach(roles::add);
         return roles;
     }

     public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
     }

     public Role getRoleByRole(String role) {
        return roleRepository.findByRole(role);
     }
    public void add(Role role) {
        roleRepository.save(role);
    }

    public void update(String id, Role role) {
        roleRepository.save(role);
    }

    public void delete(String id) {
        Long indice = (long) Integer.parseInt(id);
        roleRepository.deleteById(indice);
    }



}
