
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Avion implements Serializable{
    private String nombre;
    private Pila pasajeros;
    private boolean disponible;
    
    public Avion(String nombre,boolean disponible) {
       this.nombre=nombre;
       this.disponible=disponible;
       pasajeros=new Pila();
    }

    public Avion(String nombre, Pila pasajeros, boolean disponible) {
        this.nombre = nombre;
        this.pasajeros = pasajeros;
        this.disponible = disponible;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pila getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pila pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Avion{" + "nombre=" + nombre + ", pasajeros=" + pasajeros + ", disponible=" + disponible + '}';
    }
    
    
}