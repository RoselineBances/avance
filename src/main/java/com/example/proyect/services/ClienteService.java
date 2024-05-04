package com.example.proyect.services;

import com.example.proyect.entities.Actividad;
import com.example.proyect.entities.Cliente;

import java.util.List;

public interface ClienteService { List<Cliente> listAll();
   List<Cliente> listByNome(String nome);

   Cliente findById(long id);

   Cliente save(Cliente cliente);
   void delete(Long id);

}
