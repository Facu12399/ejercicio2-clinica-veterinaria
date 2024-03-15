package com.example.Ejercicio2ClinicaVeterinaria.repository;

import com.example.Ejercicio2ClinicaVeterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
}
