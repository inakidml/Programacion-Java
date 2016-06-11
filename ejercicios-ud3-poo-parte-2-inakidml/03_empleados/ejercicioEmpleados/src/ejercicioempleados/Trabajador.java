/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempleados;

/**
 *
 * @author 7fprog02
 */
public class Trabajador {

    private String nombre;
    private String nSS;
    private int numDias;

    public Trabajador[] listado() {
        Trabajador[] listado = new Trabajador[4];

        return listado;
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
     * @return the nSS
     */
    public String getnSS() {
        return nSS;
    }

    /**
     * @param nSS the nSS to set
     */
    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    /**
     * @return the numDias
     */
    public int getNumDias() {
        return numDias;
    }

    /**
     * @param numDias the numDias to set
     */
    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "NumDias=" + numDias + ", nombre=" + nombre + ", nSS=" + nSS + '}';
    }

}
