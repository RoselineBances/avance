package com.example.proyect.services;

import com.example.proyect.entities.Actividad;

import java.util.List;

public interface ActividadService {
    List<Actividad> listAll();

    Actividad findById(int id);

    Actividad save(Actividad actividad);

    void delete(int id);
}
