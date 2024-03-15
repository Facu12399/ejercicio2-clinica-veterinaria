package com.example.Ejercicio2ClinicaVeterinaria.service;

import com.example.Ejercicio2ClinicaVeterinaria.dto.MascotaDto;
import com.example.Ejercicio2ClinicaVeterinaria.model.Duenio;
import com.example.Ejercicio2ClinicaVeterinaria.model.Mascota;
import com.example.Ejercicio2ClinicaVeterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository mascotaRepo;

    @Override
    public void crearMascota(Mascota mascota) {
        mascotaRepo.save(mascota);
    }

    @Override
    public List<Mascota> readMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota mascota = mascotaRepo.findById(id).orElse(null);
        return mascota;
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepo.deleteById(id);
    }

    @Override
    public void updateMascota(Mascota mascota) {
        this.crearMascota(mascota);
    }

    @Override
    public MascotaDto getMascotaDto(Long id) {
        Mascota masco = mascotaRepo.findById(id).orElse(null);

        MascotaDto masc = new MascotaDto();
        masc.setNombre_mascota(masco.getNombre());
        masc.setEspecie(masco.getEspecie());
        masc.setRaza(masco.getRaza());
        masc.setNombre_duenio(masco.getDuenioMascota().getNombre());
        masc.setApellido_duenio(masco.getDuenioMascota().getApellido());

        return masc;
    }

    @Override
    public List<Mascota> getPerroCaniche() {
        List<Mascota> listaPerrosCaniches = new ArrayList<>();
        String especie = "perro";
        String raza = "caniche";


        for (Mascota mas: mascotaRepo.findAll()) {
            if (mas.getEspecie().equalsIgnoreCase(especie) && mas.getRaza().equalsIgnoreCase(raza)){
                listaPerrosCaniches.add(mas);
            }
        }

        return listaPerrosCaniches;
    }
}
