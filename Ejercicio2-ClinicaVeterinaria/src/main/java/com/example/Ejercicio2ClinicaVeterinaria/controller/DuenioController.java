package com.example.Ejercicio2ClinicaVeterinaria.controller;

import com.example.Ejercicio2ClinicaVeterinaria.dto.MascotaDto;
import com.example.Ejercicio2ClinicaVeterinaria.model.Duenio;
import com.example.Ejercicio2ClinicaVeterinaria.model.Mascota;
import com.example.Ejercicio2ClinicaVeterinaria.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class DuenioController {

    @Autowired
    IDuenioService duenioServ;

    @GetMapping("/duenio/leer")
    public List<Duenio> leerDuenios(){
        return duenioServ.readDuenios();
    }

    @PostMapping("/duenio/crear")
    public String crearDuenio(@RequestBody Duenio duenio){
        duenioServ.createDuenio(duenio);
        return "El dueño se ha creado correctamente";
    }

    //Ojo con este, necesita dos metodos uno para encontrar el id y el otro para actualizar los datos
    @PutMapping("/duenio/actualizar")
    public Duenio actualizarDuenio(@RequestBody Duenio duenio){
        duenioServ.updateDuenio(duenio);

        return duenioServ.findDuenio(duenio.getId_duenio());
    }

    @DeleteMapping("/duenio/eliminar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        duenioServ.deleteDuenio(id);

        return "El dueño fue eliminado correctamente";
    }

}
