/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumnoasignatura;

/**
 *
 * @author 7fprog02
 */
public class Asignatura {

    private String nombre;
    private int horasSemanales;
    private Alumno[] matriculados = new Alumno[EjercicioAlumnoAsignatura.MAX_ALUMNOS];
    private int indiceMatriculados = 0;

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", horasSemanales=" + horasSemanales + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    public boolean matricular(Alumno a) {
        if (indiceMatriculados > EjercicioAlumnoAsignatura.MAX_ALUMNOS) {
            matriculados[getIndiceMatriculados()] = a;
            indiceMatriculados++;
            return true;
        } else {
            return false;
        }
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
     * @return the matriculados
     */
    public Alumno[] getMatriculados() {
        return matriculados;
    }

    /**
     * @return the indiceMatriculados
     */
    public int getIndiceMatriculados() {
        return indiceMatriculados;
    }
}
