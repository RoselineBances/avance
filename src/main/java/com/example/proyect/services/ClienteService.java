package com.example.proyect.services;

import com.example.proyect.entities.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> listAll();
    public List<Cliente> listByNome(String nome);

    public Cliente findById(long id);


}
