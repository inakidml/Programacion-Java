/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofestivales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author widemos
 */
public class Asistente {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String email;

    private List<Festival> festivales = new ArrayList<>();

    @Override
    public String toString() {
        return "Asistente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", email=" + email + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the festivales
     */
    public List<Festival> getFestivales() {
        return festivales;
    }

}
