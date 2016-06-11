/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioagendaclase;

/**
 *
 * @author 7fprog02
 */
public class Agenda {

    private DatosAlumno[] alumnos = new DatosAlumno[EjercicioAgendaClase.MAX_LINEAS];
    private int indice = 0;

    /**
     * @return the lineas
     */
    public DatosAlumno[] getalumnos() {
        return alumnos;
    }

    public void add(DatosAlumno alumno) {
        getalumnos()[getIndice()] = alumno;
        indice++;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

}
