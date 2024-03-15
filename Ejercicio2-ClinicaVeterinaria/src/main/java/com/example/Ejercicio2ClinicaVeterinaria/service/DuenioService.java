package com.example.Ejercicio2ClinicaVeterinaria.service;

import com.example.Ejercicio2ClinicaVeterinaria.dto.MascotaDto;
import com.example.Ejercicio2ClinicaVeterinaria.model.Duenio;
import com.example.Ejercicio2ClinicaVeterinaria.model.Mascota;
import com.example.Ejercicio2ClinicaVeterinaria.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    IDuenioRepository duenioRepo;

    @Override
    public void createDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public List<Duenio> readDuenios() {
        List<Duenio> listaDuenio = duenioRepo.findAll();
        return listaDuenio;
    }

    @Override
    public Duenio findDuenio(Long id) {
        Duenio duenio = duenioRepo.findById(id).orElse(null);
        return duenio;
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepo.deleteById(id);
    }

    @Override
    public void updateDuenio(Duenio duenio) {
        this.createDuenio(duenio);
    }

}
