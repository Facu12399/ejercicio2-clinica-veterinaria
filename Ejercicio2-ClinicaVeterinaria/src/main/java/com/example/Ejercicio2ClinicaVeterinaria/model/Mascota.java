package com.example.Ejercicio2ClinicaVeterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn(name = "idDuenio", referencedColumnName = "id_duenio")
    private Duenio duenioMascota;

    public Mascota(){}

    public Mascota(Long id_mascota, String nombre, String especie, String raza,
                   String color, Duenio duenioMascota){
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.duenioMascota = duenioMascota;
    }
}
