package com.example.proyect.services;

import com.example.proyect.entities.Actividad;
import com.example.proyect.entities.Cliente;
import com.example.proyect.entities.ClientexEventoP;

import java.util.List;

public interface ClientexEventoPService {

    List<ClientexEventoP> listAll();

    ClientexEventoP findById(int id);

    ClientexEventoP save(ClientexEventoP clientexEventoP);

    void delete (int id);
}
