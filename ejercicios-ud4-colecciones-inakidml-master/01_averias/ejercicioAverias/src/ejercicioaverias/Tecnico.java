/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaverias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 7fprog02
 */
public class Tecnico {

    private String nombre;
    private int nivel;

    private List<Averia> averias = new ArrayList<>();

    public Tecnico(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public Tecnico() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nombre=" + nombre + ", nivel=" + nivel + '}';
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the averias
     */
    public List<Averia> getAverias() {
        return averias;
    }
}
