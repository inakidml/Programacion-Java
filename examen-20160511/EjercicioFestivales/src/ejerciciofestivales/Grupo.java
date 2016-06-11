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
public class Grupo {

    private String nombre;
    private String genero;
    private double cache;

    private List<Festival> festivales = new ArrayList<>();

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", genero=" + genero + ", cache=" + cache + '}';
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
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the cache
     */
    public double getCache() {
        return cache;
    }

    /**
     * @param cache the cache to set
     */
    public void setCache(double cache) {
        this.cache = cache;
    }

    /**
     * @return the festivales
     */
    public List<Festival> getFestivales() {
        return festivales;
    }

}
