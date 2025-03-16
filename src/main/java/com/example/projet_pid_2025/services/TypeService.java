package com.example.projet_pid_2025.services;

import com.example.projet_pid_2025.model.Type;
import com.example.projet_pid_2025.repositpry.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeService {

    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }
    public List<Type> getAllTypes() {
        List<Type> types = new ArrayList<>();
        typeRepository.findAll().forEach(types::add);
        return types ;
    }
    public Type getTypeById(Long id) {
        return typeRepository.findById(id).orElse(null);
    }
    public Type getTypeByType(String type) {
        return typeRepository.findByType(type);
    }
    public void addType(Type type) {
        typeRepository.save(type);
    }
    public void updateType(Long id ,Type type) {
        typeRepository.save(type);
    }
    public void deleteType(Long id) {
        typeRepository.deleteById(id);
    }


}
