package com.example.proyect.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tours")

public class Tours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Date date_start;
    private Date date_finish;
    private int money;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Destino destino;
    @JsonIgnore
    @OneToMany(mappedBy = "tour")
    private List<EventoProgramado> eventoProgramados;

    @Override
    public String toString() {
        return "Tours{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date_start='" + date_start + '\'' +
                ", date_finish='" + date_finish + '\'' +
                ", cost=" + money +
                '}';
    }
}
