package com.example.Ejercicio2ClinicaVeterinaria.controller;

import com.example.Ejercicio2ClinicaVeterinaria.dto.MascotaDto;
import com.example.Ejercicio2ClinicaVeterinaria.model.Mascota;
import com.example.Ejercicio2ClinicaVeterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class MascotaController {

    @Autowired
    IMascotaService mascotaServ;

    @GetMapping("/mascota/leer")
    public List<Mascota> leerMascotas(){
        return mascotaServ.readMascotas();
    }

    @PostMapping("/mascota/crear")
    public String crearMascota(@RequestBody Mascota mascota){
        mascotaServ.crearMascota(mascota);
        return "La mascota se ha creado correctamente";
    }

    @PutMapping("/mascota/actualizar")
    public Mascota actualizarMascota(@RequestBody Mascota mascota){
        mascotaServ.updateMascota(mascota);
        return mascotaServ.findMascota(mascota.getId_mascota());
    }

    @DeleteMapping ("/mascota/eliminar/{id}")
    public String eliminarMascota(@PathVariable Long id){
        mascotaServ.deleteMascota(id);
        return "La mascota se ha eliminado correctamente";
    }

    @GetMapping ("/mascota/{id}")
    public MascotaDto buscarDto(@PathVariable Long id){
        return mascotaServ.getMascotaDto(id);
    }

    @GetMapping ("/mascota/perro/caniche")
    public List<Mascota> buscarPerroCaniche(){
        return mascotaServ.getPerroCaniche();
    }

}
