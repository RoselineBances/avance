package com.example.proyect.controllers;

import com.example.proyect.entities.Cliente;
import com.example.proyect.entities.Tours;
import com.example.proyect.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> getAllTours() {
        List<Cliente> cliente = clienteService.listAll();
        return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.OK);
    }
    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> getAClienteById(@PathVariable("id") Long id) {
        Cliente cliente = clienteService.findById(id);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }
    @PostMapping("/clientes")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente newCliente = ClienteService.save(cliente);
        return new ResponseEntity<Cliente>(newCliente, HttpStatus.CREATED);
    }
    @DeleteMapping("/cliente/{id}")
    public ResponseEntity<HttpStatus> deleteTours(@PathVariable("id") Long id) {
        clienteService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<Cliente> updateEmployee(@RequestBody Cliente cliente, @PathVariable("id") Long id) {
        Cliente foundCliente = clienteService.findById(id);
        if (cliente.getNombre()!=null) foundCliente.setNombre(cliente.getNombre());

        Cliente newCliente = clienteService.save(foundCliente);
        return new ResponseEntity<Cliente>(newCliente, HttpStatus.OK);
    }

    @PutMapping("/clientes/")
    public ResponseEntity<Tours> updateEmployeeBody(@RequestBody Cliente cliente) {
        Cliente foundCliente = clienteService.findById(cliente.getId());
        if (cliente.getNombre()!=null) {
            foundCliente.setNombre(cliente.getNombre());
        }

        return null;
    }
}
