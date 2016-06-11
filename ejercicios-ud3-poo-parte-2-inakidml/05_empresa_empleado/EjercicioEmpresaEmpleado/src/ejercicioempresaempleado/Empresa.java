/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempresaempleado;

/**
 *
 * @author 7fprog02
 */
public class Empresa {

    public static final int MAX_EMPLE = 100;
    private String nombre;
    private String anyoFundacion;
    private Empleado[] Empleados = new Empleado[MAX_EMPLE];
    private int indice = 0;

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
     * @return the anyoFundacion
     */
    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    /**
     * @param anyoFundacion the anyoFundacion to set
     */
    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    /**
     * @return the Empleados
     */
    public Empleado[] getEmpleados() {
        return Empleados;
    }

    public void add(Empleado t) {
        getEmpleados()[getIndice()] = t;
        setIndice(getIndice() + 1);
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

}
