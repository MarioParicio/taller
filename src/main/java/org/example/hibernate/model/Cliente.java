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
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    private int dni;


    private String nombre;



    @OneToMany(mappedBy = "cliente")
    //CascadeType.PERSIST y MERGE
    @Cascade({CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Coche> coches;

    //Modificar AllArgsConstructor para que coches este inicializado





}
