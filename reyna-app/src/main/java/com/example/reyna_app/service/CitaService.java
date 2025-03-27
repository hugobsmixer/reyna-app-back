package com.example.reyna_app.service;

import com.example.reyna_app.entity.Cita;
import com.example.reyna_app.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    private final CitaRepository repository;

    @Autowired
    public CitaService(CitaRepository repository) {
        this.repository = repository;
    }

    public List<Cita> findAll() {
        return repository.findAll();
    }

    public Cita findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Cita save(Cita cita) {
        return repository.save(cita);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
