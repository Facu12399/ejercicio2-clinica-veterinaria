package com.example.Ejercicio2ClinicaVeterinaria.service;

import com.example.Ejercicio2ClinicaVeterinaria.dto.MascotaDto;
import com.example.Ejercicio2ClinicaVeterinaria.model.Mascota;

import java.util.List;

public interface IMascotaService {

    //crear mascota
    public void crearMascota(Mascota mascota);

    //Traer mascota o mascotas
    public List<Mascota> readMascotas();

    //encontrar mascota
    public Mascota findMascota(Long id);

    //eliminar mascota
    public void deleteMascota(Long id);

    //actualizar mascota
    public void updateMascota(Mascota mascota);

    //Traer datos de mascota con su dueño
    public MascotaDto getMascotaDto(Long id);

    //Traer solo mascotas de especie "perro" y de raza "caniche"
    public List<Mascota> getPerroCaniche();
}
