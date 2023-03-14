package org.example.hibernate.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Averia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_coche")
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.MERGE})
    private Coche coche;

    @Override
    public String toString() {
        String cocheMatricula = coche != null ? coche.getMatricula() : "null";
        return "Averia{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", coche=" + cocheMatricula +
                '}';
    }
}
