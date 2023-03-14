package org.example.Gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.example.Gson.model.Averia;
import org.example.Gson.model.Cliente;
import org.example.Gson.model.Coche;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class GSon {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\mpari\\IdeaProjects\\taller\\data\\";
        String averiaFile = "Averia.json";
        String clienteFile = "Cliente.json";
        String cocheFile = "Coche.json";



//        Gson gson = new Gson();
//        JsonReader reader = new JsonReader(new FileReader(filename));
//        Review data = gson.fromJson(reader, Review.class);
//        data.toScreen(); // prints to screen some values

        List<Averia> averias;
        List<Cliente> clientes;
        List<Coche> coches;

        Gson gson = new Gson();
        try {
            JsonReader readerAveria = new JsonReader(new FileReader(ruta + averiaFile));
            JsonReader readerCliente = new JsonReader(new FileReader(ruta + clienteFile));
            JsonReader readerCoche = new JsonReader(new FileReader(ruta + cocheFile));

//            averias = gson.fromJson(reader, ArrayList.class);
            averias = gson.fromJson(readerAveria, new TypeToken<List<Averia>>(){}.getType());
            clientes = gson.fromJson(readerCliente, new TypeToken<List<Cliente>>(){}.getType());
            coches = gson.fromJson(readerCoche, new TypeToken<List<Coche>>(){}.getType());




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println(averias);
        averias.forEach(System.out::println);
        clientes.forEach(System.out::println);
        coches.forEach(System.out::println);

    }

}
