package com.example.proyect.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EventoProgramado")

public class EventoProgramado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date Fecha;
    private int CantPasajeros;
    private double CostoTotal;

        @JsonIgnore
    @OneToMany(mappedBy = "eventoprogramado")
    private List<ClientexEventoP> clienteXEventoPs;

    @ManyToOne
    @JoinColumn(name = "Tours_Id")
    private Tours tour;

    @Override
    public String toString() {
        return "Actividad{" +
                "id=" + id+
                ", Fecha='" + Fecha + '\'' +
                ", CantPasajeros='" + CantPasajeros + '\'' +
                ", CostoTotal='" + CostoTotal + '\'' +
                '}';
    }
}
