/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumnoasignatura_2_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author 7fprog02
 */
public class EjercicioAlumnoAsignatura_2_0 {

    public static boolean DEBUG = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        List<Asignatura> asignaturas = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        if (DEBUG) {
            Alumno a1 = new Alumno("pepe", "perez", "asf@sdvf.es");
            Alumno a2 = new Alumno("perico", "perezola", "ascvf@sasdcaf.esa");
            Asignatura as1 = new Asignatura("mates", 10);
            Asignatura as2 = new Asignatura("Fisica", 20);
            asignaturas.add(as1);//añadimos asignatura 1 al array main
            asignaturas.add(as2);//añadimos asignatura 2 al array main
            alumnos.add(a1);//Añadimos alumno 1 al rray de alumnos del main
            alumnos.add(a2);//Añadimos alumno 2 al rray de alumnos del main

            a1.getAsignaturas().add(as1); //añadimos asignatura 1 al array de asign del alumno 1
            as1.getAlumnos().add(a1); //añadimos alum1 al array de alumnos de asignatura 1 
            a2.getAsignaturas().add(as1);//añadimos asignatura 1 al array de asign del alumno 2
            as1.getAlumnos().add(a2);//añadimos alum2 al array de alumnos de asignatura 1
            a1.getAsignaturas().add(as2);//añadimos asignatura 2 al array de asign del alumno 1
            as2.getAlumnos().add(a1);//añadimos alum1 al array de alumnos de asignatura 2

        }
        do {

            System.out.println("1. Alumnos\n"
                    + "11. Crear nuevo alumno.\n"
                    + "12. Borrar alumno.\n"
                    + "2. Asignaturas\n"
                    + "21. Crear nueva asignatura.\n"
                    + "22. Borrar asignatura.\n"
                    + "3. Matrícula\n"
                    + "31. Matricular alumno en asignatura.\n"
                    + "32. Listado de alumnos matriculados en una asignatura.\n"
                    + "33. Listado de asignaturas en las que está matriculado un alumno.\n"
                    + "34. Listado de todos los alumnos del centro y total de horas en las que están matriculados.\n"
                    + "4. Salir");

            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.err.println("Error de E/S");
                opcion = -1;
            } catch (NumberFormatException ex) {
                System.err.println("Error: introduce opción válida.");
                opcion = -1;
            }

            switch (opcion) {
                case 11:
                    //Crear nuevo alumno
                    System.out.println("Vamos a introducir un alumno");
                    Alumno al = new Alumno();
                    try {
                        System.out.print("nombre: ");
                        al.setNombre(br.readLine());
                        System.out.print("apellidos: ");
                        al.setApellidos(br.readLine());
                        System.out.print("email: ");
                        al.setEmail(br.readLine());
                    } catch (IOException e) {
                        System.err.println("Error E/S .");
                    } catch (NumberFormatException e) {
                        System.err.println("Introduce un número válido");
                    }
                    if (!alumnos.contains(al)) {
                        alumnos.add(al);
                    } else {
                        System.out.println("Ya existe el alumno");
                    }
                    break;
                case 12:
                    //Borrar alumno

                    int numAlumno;

                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.println(alumnos.get(i));
                    }
                    try {
                        System.out.print("Alumno: ");
                        numAlumno = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numAlumno = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numAlumno = -1;
                    }
                    Alumno a = alumnos.get(numAlumno);//alumnos seleccionado ->a
                    for (Asignatura asignatura : a.getAsignaturas()) { // recorremos el array asignaturas del alumno
                        asignatura.getAlumnos().remove(a);

                        /*
                         ListIterator<Alumno> it = asignatura.getAlumnos().listIterator();

                         while (it.hasNext()) {// vamos a cada asignatura que aparezca en el array del alumno

                         Alumno alumno = it.next();

                         if (alumno == a) {
                         // encontrado y borramos del array alumnos de la asignatura
                         it.remove();
                         }
                         }
                         */
                    }
                    alumnos.remove(a);
                    /*
                     ListIterator<Alumno> it = alumnos.listIterator();

                     while (it.hasNext()) {

                     Alumno alumno = it.next();

                     if (alumno == a) {
                     // encontrado y borramos de array main
                     it.remove();

                     }
                     }
                     */
                    break;
                case 21:
                    //crear asignatura
                    System.out.println("Vamos a introducir una asignatura");
                    Asignatura as = new Asignatura();
                    try {
                        System.out.print("nombre: ");
                        as.setNombre(br.readLine());
                        System.out.print("horas Semanales: ");
                        as.setHorasSemanales(Integer.parseInt(br.readLine()));
                    } catch (IOException e) {
                        System.err.println("Error E/S .");
                    } catch (NumberFormatException e) {
                        System.err.println("Introduce Un número válido");
                    }
                    if (!asignaturas.contains(as)) {
                        asignaturas.add(as);
                    } else {
                        System.out.println("ya existe esta asignatura");
                    }

                    break;
                case 22:
                    //borrar asignatura
                    //TODO
                    int numAsignatura;
                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.println(asignaturas.get(i));
                    }
                    try {
                        System.out.print("Asignatura: ");
                        numAsignatura = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numAsignatura = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numAsignatura = -1;
                    }

                    as = asignaturas.get(numAsignatura);//asignatura seleccionada ->as
                    for (Alumno alumno : as.getAlumnos()) { // recorremos el array alumnos de asignatura

                        /*  ListIterator<Asignatura> it2 = alumno.getAsignaturas().listIterator();

                         while (it2.hasNext()) {// vamos a cada asignatura que aparezca en el array del alumno

                         Asignatura asignatura = it2.next();

                         if (asignatura == as) {
                         // encontrado y borramos del array asignaturas del alumno
                         it2.remove();
                         }
                         }
                         */
                        alumno.getAsignaturas().remove(as);
                    }
                    asignaturas.remove(as);
                    /*  ListIterator<Asignatura> it2 = asignaturas.listIterator();

                     while (it2.hasNext()) {

                     Asignatura asignatura = it2.next();

                     if (asignatura == as) {
                     // encontrado y borramos de array main
                     it2.remove();

                     }
                     }
                     */

                    break;
                case 31:
                    //Matricular alumno en asignatura
                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.println(alumnos.get(i));
                    }
                    try {
                        System.out.print("Alumno: ");
                        numAlumno = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numAlumno = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numAlumno = -1;
                    }

                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.println(asignaturas.get(i));
                    }
                    try {
                        System.out.print("Asignatura: ");
                        numAsignatura = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numAsignatura = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numAsignatura = -1;
                    }

                    al = alumnos.get(numAlumno);
                    as = asignaturas.get(numAsignatura);
                    if (!al.getAsignaturas().contains(as) && !as.getAlumnos().contains(al)) {
                        al.getAsignaturas().add(as);
                        as.getAlumnos().add(al);

                    } else {
                        System.out.println("Ya esta matriculado");
                    }

                    break;
                case 32:
                    //Listado de alumnos matriculados en una asignatura
                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.println(asignaturas.get(i));
                    }
                    try {
                        System.out.print("Asignatura: ");
                        numAsignatura = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numAsignatura = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numAsignatura = -1;
                    }
                    for (Alumno alumno : asignaturas.get(numAsignatura).getAlumnos()) {
                        System.out.println(alumno);
                    }
                    break;
                case 33:
                    //Listado de asignaturas en las que está matriculado un alumno
                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.println(alumnos.get(i));
                    }
                    try {
                        System.out.print("Alumno: ");
                        numAlumno = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numAlumno = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numAlumno = -1;
                    }
                    for (Asignatura asignatura : alumnos.get(numAlumno).getAsignaturas()) {
                        System.out.println(asignatura);
                    }

                    break;
                case 34:
                    //Listado de todos los alumnos del centro y total de horas en las que están matriculados

                    for (Alumno alumno : alumnos) {
                        int horas = 0;
                        System.out.println(alumno);
                        for (Asignatura asignatura : alumno.getAsignaturas()) {
                            horas += asignatura.getHorasSemanales();

                        }
                        System.out.println("Horas semanales totales = " + horas);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);

    }

}
