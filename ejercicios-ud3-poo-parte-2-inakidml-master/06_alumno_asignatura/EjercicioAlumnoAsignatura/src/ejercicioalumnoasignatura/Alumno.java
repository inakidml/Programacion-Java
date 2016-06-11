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
public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;
    private Asignatura[] matriculaciones = new Asignatura[EjercicioAlumnoAsignatura.MAX_ASIGNATURAS];
    private int indiceMatriculaciones = 0;

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", indiceMatriculaciones=" + indiceMatriculaciones + '}';
    }

    public boolean matricularEn(Asignatura a) {
        if (indiceMatriculaciones > EjercicioAlumnoAsignatura.MAX_ASIGNATURAS) {
            matriculaciones[getIndiceMatriculaciones()] = a;
            indiceMatriculaciones++;
            return true;
        } else {
            return false;
        }
    }
    public void listadoAsignaturas(){
    int horas=0;
        for (int i = 0; i < indiceMatriculaciones; i++) {
            System.out.println(matriculaciones[i]);
        }
    
    
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the matriculaciones
     */
    public Asignatura[] getMatriculaciones() {
        return matriculaciones;
    }

    /**
     * @return the indiceAsignatura
     */
    public int getIndiceMatriculaciones() {
        return indiceMatriculaciones;
    }
}
