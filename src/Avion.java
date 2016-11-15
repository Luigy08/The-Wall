
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
public class Avion implements Serializable {
    
    private Pila personas;
    private boolean lleno;
   

    public Avion() {
    }

    public Avion(Pila personas, boolean lleno) {
        this.personas = personas;
        this.lleno = lleno;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }


    public Pila getPersonas() {
        return personas;
    }

    public void setPersonas(Pila personas) {
        this.personas = personas;
    }
    
    
     
    
}
