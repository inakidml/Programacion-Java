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
public class Asignatura {

    private String nombre;
    private int horasSemanales;

    private List<Alumno> alumnos = new ArrayList<>();

    public Asignatura() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + this.horasSemanales;
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
        final Asignatura other = (Asignatura) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.horasSemanales != other.horasSemanales) {
            return false;
        }
        return true;
    }

    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", horasSemanales=" + horasSemanales + '}';
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the horasSemanales
     */
    public int getHorasSemanales() {
        return horasSemanales;
    }

    /**
     * @param horasSemanales the horasSemanales to set
     */
    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    /**
     * @return the alumnos
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
