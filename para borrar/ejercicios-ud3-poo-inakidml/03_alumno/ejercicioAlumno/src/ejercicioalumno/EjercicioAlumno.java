/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre;
        String apellidos;
        String dni;
        String telefono;
        grupo primero=new grupo();
        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Alumno();
            System.out.print("Introduzca el nombre del Alumno nº " + i + ": ");
            alumnos[i].setNombre(br.readLine());
            System.out.print("Introduzca los apellidos del Alumno nº " + i + ": ");
            alumnos[i].setApellidos(br.readLine());
            System.out.print("Introduzca el dni del Alumno nº " + i + ": ");
            alumnos[i].setDni(br.readLine());
            System.out.print("Introduzca el teléfono del Alumno nº " + i + ": ");
            alumnos[i].setTelefono(br.readLine());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("El Alumno numero " + i + " se llama :" + alumnos[i].getNombre() + " " + alumnos[i].getApellidos());
            System.out.println("Su DNI es: " + alumnos[i].getDni());
            System.out.println("Y el telefono el: " + alumnos[i].getTelefono());
        }
    }

}
