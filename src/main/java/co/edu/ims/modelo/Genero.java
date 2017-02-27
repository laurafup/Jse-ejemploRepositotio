/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author 1061760000
 */
@Entity
public class Genero {
    
   @Id private int codigog;
    private String descripciong;
    
  
    public Genero(){
}
    public Genero( int codigo ,String descripcion){
        
        this.codigog= codigo;
        this.descripciong=descripcion;
        
    }

    public int getCodigog() {
        return codigog;
    }

    public void setCodigog(int codigog) {
        this.codigog = codigog;
    }

    public String getDescripciong() {
        return descripciong;
    }

    public void setDescripciong(String descripciong) {
        this.descripciong = descripciong;
    }
    
    
    
    

}

