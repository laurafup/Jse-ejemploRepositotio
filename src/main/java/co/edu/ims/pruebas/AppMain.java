/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.pruebas;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author 1061760000
 */
public class AppMain {
    
    public static void main (String [] args){
        
        Pelicula insideOut = new Pelicula("Inside Out");
        Pelicula terminator = new Pelicula("Terminator");
        Pelicula titanic = new Pelicula();
        
        insideOut.setAnio(2015);
        
        titanic.setTitulo("Titanic");
        
  
  
    
        EntityManagerFactory emf;
        EntityManager em;

        emf = Persistence.createEntityManagerFactory("ejemploPU");
        em = emf.createEntityManager();

        Genero accion = new Genero (2 , "peliculas de accion");

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(accion);
        tx.commit();
    }
}
