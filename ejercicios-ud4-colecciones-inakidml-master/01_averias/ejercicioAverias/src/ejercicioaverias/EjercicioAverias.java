/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaverias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 7fprog02
 */
public class EjercicioAverias {

    public static boolean DEBUG = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Tecnico> tecnicos = new LinkedList<>();
        List<Averia> averias = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        if (DEBUG) {
            Tecnico t1 = new Tecnico("Pepe", 3);
            tecnicos.add(t1);
            Tecnico t2 = new Tecnico("Tomas", 1);
            tecnicos.add(t2);

            averias.add(new Averia("Ordenador no arranca", "cuando se le da al boton...", "20160321", 1, t2));
            t2.getAverias().add(new Averia("Ordenador no arranca", "cuando se le da al boton...", "20160321", 1, t2));
            //falta asignar a variable de avería el tecnico
            averias.add(new Averia("Bombilla fundida", "la tercera luz...", "", 2, t2));
            t2.getAverias().add(new Averia("Bombilla fundida", "la tercera luz...", "", 2, t2));
            averias.add(new Averia("Proyector no enciende", "ha explotado la lampara...", "", 3, t1));
        }

        do {
            System.out.println("1.- Alta de técnico.\n"
                    + "2.- Gestión de averías\n"
                    + "     21.- Nueva avería.\n"
                    + "     22.- Asignar avería a técnico.\n"
                    + "     23.- Atender avería.\n"
                    + "3.- Listados\n"
                    + "     31.- Listado de averías sin resolver de un técnico.\n"
                    + "     32.- Listado de todas las averías de un técnico (resueltas y no resueltas).\n"
                    + "     33.- Listado de todas las averías del sistema y técnico asignado.\n"
                    + "4.- Salir");
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
                case 1:
                    //Nuevo Técnico
                    Tecnico t = new Tecnico();
                    try {

                        System.out.print("Nombre: ");
                        t.setNombre(br.readLine());
                        System.out.print("Nivel: ");
                        t.setNivel(Integer.parseInt(br.readLine()));
                        tecnicos.add(t);
                    } catch (IOException e) {
                        System.err.println("Error E/S .");
                    } catch (NumberFormatException e) {
                        System.err.println("Introduce Un número válido");
                    }
                    break;
                case 21:
                    // Nueva avería
                    Averia a = new Averia();
                    try {

                        System.out.print("Titulo: ");
                        a.setTitulo(br.readLine());
                        System.out.print("Descripcion: ");
                        a.setDescripcion(br.readLine());
                        System.out.print("Fecha de apertura: ");
                        a.setFechaApertura(br.readLine());
                        System.out.print("Nivel: ");
                        a.setNivel(Integer.parseInt(br.readLine()));
                        averias.add(a);
                    } catch (IOException e) {
                        System.err.println("Error E/S .");
                    } catch (NumberFormatException e) {
                        System.err.println("Introduce Un número válido");
                    }

                    break;
                case 22:
                    // Asociar avería a técnico
                    int i = 0;
                    for (Tecnico tec : tecnicos) {
                        System.out.println(i + 1 + ". " + tec);
                        i++;
                    }
                    int numTecnico;
                    try {
                        System.out.print("Técnico: ");
                        numTecnico = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numTecnico = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numTecnico = -1;
                    }

                    i = 0;
                    for (Averia av : averias) {
                        System.out.println(i + 1 + ". " + av);
                        i++;
                    }
                    int numAveria;
                    try {
                        System.out.print("Avería: ");
                        numAveria = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("Error E/S");
                        numAveria = -1;
                    } catch (NumberFormatException e) {
                        System.err.println("Un número");
                        numAveria = -1;
                    }
                    //Asociar avería a técnico
                    if (numTecnico >= 0 && numAveria >= 0) {
                        t = tecnicos.get(numTecnico);
                        a = averias.get(numAveria);

                        t.getAverias().add(a);
                        a.setTecnico(t);
                    }

                    break;
                case 23:
                    // Pedir el nº de técnico
                    i = 0;
                    for (Tecnico tec : tecnicos) {
                        System.out.println((i + 1) + ". " + tec);
                        i++;
                    }

                    try {
                        System.out.print("Número: ");
                        numTecnico = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("ERROR: Error de E/S...");
                        numTecnico = -1;
                    } catch (NumberFormatException ex) {
                        System.err.println("ERROR: Introduce un número, por favor...");
                        numTecnico = -2;
                    }

                    // Tratando averias del técnico
                    if (numTecnico >= 0) {

                        // Técnico
                        t = tecnicos.get(numTecnico);

                        // Problema de concurrencia al quitar y añadir mientras recorremos...
                        // http://stackoverflow.com/questions/223918/iterating-through-a-list-avoiding-concurrentmodificationexception-when-removing
                        // Recorrer todas las averias del técnico
                        ListIterator<Averia> it = t.getAverias().listIterator();

                        while (it.hasNext()) {

                            Averia averia = it.next();

                            if (t.getNivel() >= averia.getNivel()) {
                                // Resuelta

                                it.remove();
                                //t.getAverias().remove(averia);
                            } else {
                                // NO resuelta

                                averia.setNivel(averia.getNivel() - 1);
                                //t.getAverias().remove(averia);
                                it.remove();
                                //t.getAverias().add(averia);
                                it.add(averia);
                            }
                        }
                    }

                    break;
                case 31:
                    // Pedir el nº de técnico
                    i = 0;
                    for (Tecnico tec : tecnicos) {
                        System.out.println((i + 1) + ". " + tec);
                        i++;
                    }

                    try {
                        System.out.print("Número: ");
                        numTecnico = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("ERROR: Error de E/S...");
                        numTecnico = -1;
                    } catch (NumberFormatException ex) {
                        System.err.println("ERROR: Introduce un número, por favor...");
                        numTecnico = -2;
                    }

                    // Listado de averías pendientes de un técnico
                    if (numTecnico >= 0) {

                        // Técnico
                        t = tecnicos.get(numTecnico);

                        for (Averia averia : t.getAverias()) {
                            System.out.println(averia);
                        }

                    }

                    break;
                case 32:
                    // Pedir el nº de técnico
                    i = 0;
                    for (Tecnico tec : tecnicos) {
                        System.out.println((i + 1) + ". " + tec);
                        i++;
                    }

                    try {
                        System.out.print("Número: ");
                        numTecnico = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("ERROR: Error de E/S...");
                        numTecnico = -1;
                    } catch (NumberFormatException ex) {
                        System.err.println("ERROR: Introduce un número, por favor...");
                        numTecnico = -2;
                    }

                    // Listado de averías pendientes de un técnico
                    if (numTecnico >= 0) {

                        // Técnico
                        t = tecnicos.get(numTecnico);

                        for (Averia averia : averias) {
                            if (t == averia.getTecnico()) {
                                System.out.println(averia);
                            }
                        }

                    }
                    break;
                case 33:
                    for (Averia averia : averias) {
                        System.out.println(averia);
                        if (averia.getTecnico() != null) {
                            System.out.println("  " + averia.getTecnico());
                        } else {
                            System.out.println("  No hay técnico asociado...");
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.err.println("ERROR: Introduce una opción válida...");
            }

        } while (opcion != 4);

    }

}