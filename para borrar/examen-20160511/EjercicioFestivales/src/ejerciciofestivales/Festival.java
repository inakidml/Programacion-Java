/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofestivales;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author widemos
 */
public class Festival {

    private String nombre;
    private String fechas;
    private String genero;
    private String ciudad;
    private String pais;

    private List<Asistente> asistentes = new ArrayList<>();
    private List<Grupo> grupos = new ArrayList<>();

    @Override
    public String toString() {
        return "Festival{" + "nombre=" + nombre + ", fechas=" + fechas + ", genero=" + genero + ", ciudad=" + ciudad + ", pais=" + pais + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.fechas);
        hash = 29 * hash + Objects.hashCode(this.genero);
        hash = 29 * hash + Objects.hashCode(this.ciudad);
        hash = 29 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Festival other = (Festival) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
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
     * @return the fechas
     */
    public String getFechas() {
        return fechas;
    }

    /**
     * @param fechas the fechas to set
     */
    public void setFechas(String fechas) {
        this.fechas = fechas;
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

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the asistentes
     */
    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    /**
     * @return the grupos
     */
    public List<Grupo> getGrupos() {
        return grupos;
    }

}
