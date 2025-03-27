package com.example.reyna_app.controller;

import com.example.reyna_app.entity.Cita;
import com.example.reyna_app.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/citas")
@CrossOrigin(origins = "http://localhost:8082")
public class CitaController {

    private final CitaService service;

    @Autowired
    public CitaController(CitaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cita> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cita> getById(@PathVariable Long id) {
        Cita cita = service.findById(id);
        return cita != null ? ResponseEntity.ok(cita) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Cita create(@RequestBody Cita cita) {
        return service.save(cita);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cita> update(@PathVariable Long id, @RequestBody Cita cita) {
        if (service.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        cita.setNumero(id);
        return ResponseEntity.ok(service.save(cita));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}