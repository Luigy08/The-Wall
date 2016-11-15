
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
public class Hangar implements Serializable{
    
    private Pila Aviones;
    private boolean lleno;

    public Hangar() {
    }

    public Hangar(Pila Aviones, boolean lleno) {
        this.Aviones = Aviones;
        this.lleno = lleno;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    

    public Pila getAviones() {
        return Aviones;
    }

    public void setAviones(Pila Aviones) {
        this.Aviones = Aviones;
    }
    
    
    
}
