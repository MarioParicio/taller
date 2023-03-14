package org.example.Gson.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hibernate.model.Averia;
import org.example.hibernate.model.Cliente;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coche {


    private String matricula;

    private String marca;

    private String modelo;

    private String color;


}
