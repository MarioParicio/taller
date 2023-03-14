package org.example.Gson.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hibernate.model.Coche;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Averia {

    private int id;

    private String descripcion;


}
