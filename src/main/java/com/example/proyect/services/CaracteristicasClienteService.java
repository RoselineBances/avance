package com.example.proyect.services;

import com.example.proyect.entities.Actividad;
import com.example.proyect.entities.CaracteristicasCliente;

import java.util.List;

public interface CaracteristicasClienteService {

     List<CaracteristicasCliente> listAll();

    CaracteristicasCliente findById(int id);

    CaracteristicasCliente save(CaracteristicasCliente caracteristicasCliente);

    void delete(int id);
}
