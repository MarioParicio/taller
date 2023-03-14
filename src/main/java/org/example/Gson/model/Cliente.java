package org.example.Gson.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hibernate.model.Coche;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    private int dni;


    private String nombre;








}
