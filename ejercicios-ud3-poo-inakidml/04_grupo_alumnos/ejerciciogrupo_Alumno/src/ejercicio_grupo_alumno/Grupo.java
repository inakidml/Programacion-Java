/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_grupo_alumno;

/**
 *
 * @author 7fprog02
 */
public class Grupo {

    private String codigo;
    private Alumno[] alumnos = new Alumno[5];

    public Grupo() {
        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Alumno();
        }

    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the alumnos
     */
    public Alumno[] getAlumnos() {
        return alumnos;
    }

}
