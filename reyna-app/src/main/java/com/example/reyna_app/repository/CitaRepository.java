package com.example.reyna_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reyna_app.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long> {
}