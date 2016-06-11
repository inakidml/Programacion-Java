/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumnoasignatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioAlumnoAsignatura {

    public static final int MAX_ASIGNATURAS = 100;
    public static final int MAX_ALUMNOS = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
        Asignatura[] asignaturas = new Asignatura[MAX_ASIGNATURAS];
        int indiceAlumnos = 0;
        int indiceAsignatura = 0;
        int contadorList = 0;
        do {
            System.out.println("  1.  Crear nuevo alumno.\n"
                    + "  2.  Crear nueva asignatura.\n"
                    + "  3.  Matricular alumno en asignatura.\n"
                    + "  4.  Listado de alumnos matriculados en una asignatura.\n"
                    + "  5.  Listado de asignaturas en las que está matriculado un alumno y total de horas.\n"
                    + "  6.  Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Vamos a crear un alumno");
                    Alumno a = new Alumno();
                    System.out.print("Introduce el nombre: ");
                    a.setNombre(br.readLine());
                    System.out.print("Apellido: ");
                    a.setApellidos(br.readLine());
                    System.out.print("email: ");
                    a.setEmail(br.readLine());
                    alumnos[indiceAlumnos] = a;
                    indiceAlumnos++;
                    break;
                case 2:
                    System.out.println("Vamos a crear un asignatura");
                    Asignatura asig = new Asignatura();
                    System.out.print("Introduce el nombre: ");
                    asig.setNombre(br.readLine());
                    System.out.print("número de horas: ");
                    asig.setHorasSemanales(Integer.parseInt(br.readLine()));
                    asignaturas[indiceAsignatura] = asig;
                    indiceAsignatura++;
                    break;
                case 3:
                    contadorList = 0;
                    while (contadorList < indiceAlumnos) {
                        System.out.println(contadorList + " . " + alumnos[contadorList].getNombre());
                        contadorList++;
                    }

                    System.out.print("Alumno a matricular: ");
                    int alumno = Integer.parseInt(br.readLine());

                    contadorList = 0;
                    while (contadorList < indiceAsignatura) {
                        System.out.println(contadorList + " . " + asignaturas[contadorList].getNombre());
                        contadorList++;
                    }
                    System.out.print("En que asignatura quieres matricularlo?: ");
                    int matricula = Integer.parseInt(br.readLine());

                    alumnos[alumno].matricularEn(asignaturas[matricula]);
                    asignaturas[matricula].matricular(alumnos[alumno]);
                    break;
                case 4:
                    while (contadorList < indiceAsignatura) {
                        System.out.println(contadorList + " . " + asignaturas[contadorList].getNombre());

                        contadorList++;

                    }
                    System.out.print("Que asignatura: ");
                    int opcionAsig = Integer.parseInt(br.readLine());

                    for (int i = 0; i < asignaturas[indiceAsignatura-1].getIndiceMatriculados(); i++) {
                        System.out.println(asignaturas[opcionAsig].getMatriculados()[i]);
                    }// mejor como Ion, hace el listado con un metodo en asignatura
                    break;
                case 5:

                    break;
                default:
                    System.out.println("ERROR: opción incorrecta!");;
            }
        } while (opcion != 6);

    }

}
