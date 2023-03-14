package org.example.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.hibernate.dao.Dao;
import org.example.hibernate.model.Averia;
import org.example.hibernate.model.Cliente;
import org.example.hibernate.model.Coche;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dao dao = new Dao();

        //3 coches 3 clientes y 3 averias y conectarlos

/*        Coche coche1 = Coche.builder()
                .matricula("1234")
                .marca("Audi")
                .modelo("A3")
                .build();

        Coche coche2 = Coche.builder()
                .matricula("5678")
                .marca("Audi")
                .modelo("A4")
                .build();

        Coche coche3 = Coche.builder()
                .matricula("9012")
                .marca("Audi")
                .modelo("A5")
                .build();
        Coche coche4 = Coche.builder()
                .matricula("3456")
                .marca("Audi")
                .modelo("A6")
                .build();
        Coche coche5 = Coche.builder()
                .matricula("7890")
                .marca("Audi")
                .modelo("A7")
                .build();

        Averia averia1 = Averia.builder()
                .descripcion("Rueda pinchada")
                .build();

        Averia averia2 = Averia.builder()
                .descripcion("Rueda pinchada")
                .build();

        Averia averia3 = Averia.builder()
                .descripcion("Rueda pinchada")
                .build();
        Averia averia4 = Averia.builder()
                .descripcion("Rueda pinchada")
                .build();

        Cliente cliente1 = Cliente.builder()
                .dni(123458)
                .nombre("Juan")

                .build();

        Cliente cliente2 = Cliente.builder()
                .dni(123478)
                .nombre("Juan")

                .build();

        Cliente cliente3 = Cliente.builder()
                .dni(145678)
                .nombre("Juan")

                .build();

        coche1.setCliente(cliente3);
        coche2.setCliente(cliente2);
        coche3.setCliente(cliente1);
        coche4.setCliente(cliente1);
        coche5.setCliente(cliente1);

        coche1.setAverias(List.of(averia1));
        coche2.setAverias(List.of(averia2));
        coche3.setAverias(List.of(averia3,averia4));

        cliente1.setCoches(List.of(coche3,coche4));
        cliente2.setCoches(List.of(coche2,coche5));
        cliente3.setCoches(List.of(coche1));

        averia1.setCoche(coche1);
        averia2.setCoche(coche2);
        averia3.setCoche(coche3);
        averia4.setCoche(coche3);

        dao.insertar(cliente1);
        dao.insertar(cliente2);
        dao.insertar(cliente3);

        List<Cliente> clientes = new ArrayList<>(   List.of(cliente1,cliente2,cliente3));
        List<Coche> coches = new ArrayList<>(   List.of(coche1,coche2,coche3,coche4,coche5));
             List<Averia> averias = new ArrayList<>(   List.of(averia1,averia2,averia3,averia4));*/

/*        //guardar la lista
        clientes.forEach(dao::insertar);
        coches.forEach(dao::insertar);
        averias.forEach(dao::insertar);*/

//        Cliente cliente1 = Cliente.builder()
//                .dni(123458)
//                .nombre("Juan")
//
//
//                .build();
//
//
//        dao.borrar(cliente1);

        List<Cliente> clientes = dao.clientePorNombre("Juan");
        clientes.forEach(System.out::println);












    }

}
