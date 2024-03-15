package com.example.Ejercicio2ClinicaVeterinaria.service;

import com.example.Ejercicio2ClinicaVeterinaria.dto.MascotaDto;
import com.example.Ejercicio2ClinicaVeterinaria.model.Duenio;

import java.util.List;

public interface IDuenioService {

    //crear dueño
    public void createDuenio(Duenio duenio);

    //leer dueño o dueños
    public List<Duenio> readDuenios();

    //encontrar dueño
    public Duenio findDuenio(Long id);

    //borrar dueño
    public void deleteDuenio(Long id);

    //actualizar dueño
    public void updateDuenio(Duenio duenio);

}
