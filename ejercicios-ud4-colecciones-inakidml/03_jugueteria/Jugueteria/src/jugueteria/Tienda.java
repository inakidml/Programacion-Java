/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rubenbaltasar
 */
public class Tienda {
    
    private List<Juguete> juguetes = new LinkedList<>();
    
    private String nombre;
    private String ciudad;

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
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }

    /**
     * @return the juguetes
     */
    public List<Juguete> getJuguetes() {
        return juguetes;
    }
    
}
