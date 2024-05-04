package com.example.proyect.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="ClientesxEventops")

public class ClientexEventoP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cliente_id")
    private int cliente_id;

    @Column(name = "evento_programado")
    private String eventoProgramado;

    @Column(name = "asientos_disponibles")
    private int AsientosDisponibles;

    @Column(name = "asistencia")
    private boolean Asistencia;

    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "evento_programado", insertable = false, updatable = false)
    private EventoProgramado EventoProgramado;
}
