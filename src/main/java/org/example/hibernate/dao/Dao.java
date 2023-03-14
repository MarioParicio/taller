package org.example.hibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.hibernate.model.Cliente;
import org.example.hibernate.model.Coche;

import java.lang.reflect.Field;
import java.util.List;

public class Dao {
    private static EntityManager entityManager;
    private static EntityTransaction transaction;



    static {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
    }






    public  void insertar(Object o) {
        try {
            transaction.begin();
            entityManager.persist(o);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }

    }

    public  void actualizar(Object o) {
        try {
            transaction.begin();
            entityManager.merge(o);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public  void borrar(Object o) {
        try {
            transaction.begin();
            Field primerCampo = o.getClass().getDeclaredFields()[0];
            primerCampo.setAccessible(true);
            Object valor = primerCampo.get(o);
            //Entity manager buscar todos
            Object objeto = entityManager.find(o.getClass(), valor);
            entityManager.remove(objeto);
            transaction.commit();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }
    public  Object buscar(Object o, Object id) {
        //Merge


        Object objeto = entityManager.find(o.getClass(), id);
        return objeto;
    }

    public boolean validar(Object entidad, Object id) {
        System.out.println(id);
        Object objeto = entityManager.find(entidad.getClass(), id);
        return objeto == null;
    }

    public List buscarTodos(Object o) {
        String nombreClase = o.getClass().getSimpleName();
        String consulta = "SELECT e FROM " + nombreClase + " e";
        return entityManager.createQuery(consulta).getResultList();
    }




}
