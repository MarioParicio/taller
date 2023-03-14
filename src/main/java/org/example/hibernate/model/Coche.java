package org.example.hibernate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coche {

    @Id
    private String matricula;

    private String marca;

    private String modelo;

    private String color;

    @ManyToOne
    @JoinColumn(name = "id_cliente")

    private Cliente cliente;

    @OneToMany(mappedBy = "coche")
    @Cascade({CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Averia> averias;

    @Override
    public String toString() {
        String clienteDni = cliente != null ? String.valueOf(cliente.getDni()) : "null";
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cliente=" + clienteDni +
                ", averias=" + averias +
                '}';
    }
}
