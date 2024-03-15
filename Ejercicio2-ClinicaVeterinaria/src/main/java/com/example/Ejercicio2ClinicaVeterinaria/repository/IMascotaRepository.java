package com.example.Ejercicio2ClinicaVeterinaria.repository;

import com.example.Ejercicio2ClinicaVeterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
