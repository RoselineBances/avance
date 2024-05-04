package com.example.proyect.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CaracteristicasClientes")

public class CaracteristicasCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Cliente_id")
    private int clienteId;

    @Column(name = "actividades_Actividad_Fav")
    private int actividadesFav;

    @Column(name = "Asientos Disponibles")
    private int asientosDisponibles;

    @ManyToOne
    @JoinColumn(name = "Cliente_id", insertable = false, updatable = false)
    private Cliente cliente;
}
