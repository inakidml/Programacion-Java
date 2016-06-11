/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_grupo_alumno;

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
        Grupo primero = new Grupo();
        System.out.println("Código del grupo: ");
        primero.setCodigo(br.readLine());

        for (int i = 0; i < 5; i++) {

            System.out.print("Introduzca el nombre del Alumno nº " + i + ": ");
            primero.getAlumnos()[i].setNombre(br.readLine());
            System.out.print("Introduzca los apellidos del Alumno nº " + i + ": ");
            primero.getAlumnos()[i].setApellidos(br.readLine());
            System.out.print("Introduzca el dni del Alumno nº " + i + ": ");
            primero.getAlumnos()[i].setDni(br.readLine());
            System.out.print("Introduzca el teléfono del Alumno nº " + i + ": ");
            primero.getAlumnos()[i].setTelefono(br.readLine());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("En el grupo: " + primero.getCodigo());
            System.out.println("El Alumno numero " + i + " se llama :" + primero.getAlumnos()[i].getNombre() + " " + primero.getAlumnos()[i].getApellidos());
            System.out.println("Su DNI es: " + primero.getAlumnos()[i].getDni());
            System.out.println("Y el telefono el: " + primero.getAlumnos()[i].getTelefono());
        }
    }

}
