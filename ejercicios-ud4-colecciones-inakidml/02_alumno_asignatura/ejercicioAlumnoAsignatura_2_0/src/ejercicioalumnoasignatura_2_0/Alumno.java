/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumnoasignatura_2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 7fprog02
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;
    private List<Asignatura> asignaturas = new ArrayList<>();

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
    }

    public Alumno() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        return true;
    }

    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
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
     * @return the asignaturas
     */
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

}
