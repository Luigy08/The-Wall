
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luigy
 */
public class persona implements Serializable{
    private String nombre;
    private String nacionalidad;
    private Date FNacimiento;
    private String raza;
    private String PaisOrigen;
    private boolean deportado;

    public persona() {
    }

    public persona(String nombre, String nacionalidad, Date FNacimiento, String raza, String PaisOrigen, boolean deportado) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.FNacimiento = FNacimiento;
        this.raza = raza;
        this.PaisOrigen = PaisOrigen;
        this.deportado = deportado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFNacimiento() {
        return FNacimiento;
    }

    public void setFNacimiento(Date FNacimiento) {
        this.FNacimiento = FNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public boolean isDeportado() {
        return deportado;
    }

    public void setDeportado(boolean deportado) {
        this.deportado = deportado;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + '}';
    }
    
}
