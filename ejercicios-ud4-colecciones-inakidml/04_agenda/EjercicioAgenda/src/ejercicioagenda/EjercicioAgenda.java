/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioagenda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sheila
 */
public class EjercicioAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Map<String, Contacto> contactos = new LinkedHashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {

            System.out.println("1. Gestión de contactos.\n"
                    + "11. Nuevo contacto.\n"
                    + "12. Eliminar contacto.\n"
                    + "2. Búsqueda.\n"
                    + "21.Buscar contacto por número de teléfono.\n"
                    + "22. Buscar contacto por nombre.\n"
                    + "3. Listados.\n"
                    + "31. Listado de todos los contactos, tal como se han añadido.\n"
                    + "32. Listado de todos los contactos, ordenados por número de teléfono.\n"
                    + "4. Salir");

            System.out.println("Opción: ");

            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
                System.err.println("ERROR: Error de E/S...");
                opcion = -1;
            } catch (NumberFormatException ex) {
                System.err.println("ERROR: Introduce un número, por favor...");
                opcion = -2;
            }

            switch (opcion) {
                case 11:
                    // Nuevo contacto

                    //Nuevo objeto
                    Contacto c = new Contacto();

                    // Datos
                    try {

                        System.out.print("Teléfono: ");
                        String telefono = br.readLine();

                        System.out.print("Nombre: ");
                        c.setNombre(br.readLine());
                        System.out.print("Apellidos: ");
                        c.setApellidos(br.readLine());
                        System.out.print("Email: ");
                        c.setEmail(br.readLine());

                        if (!contactos.containsKey(telefono)) {
                            contactos.put(telefono, c);
                        } else {
                            System.out.println("ERROR: El contacto ya existe...");
                        }

                        System.out.println("INFO: Contacto añadido...");

                    } catch (IOException ex) {
                        System.err.println("ERROR: Error de E/S...");
                    } catch (NumberFormatException ex) {
                        System.err.println("ERROR: Introduce un número, por favor...");
                    }

                    break;

                case 12:
                    // Eliminar contacto
                    //List<Contacto> listaContactos = new ArrayList<>(contactos.values());

                    List<String> listaClaves = new ArrayList<>(contactos.keySet());

                    // Mostrar todos los contactos
                    for (int i = 0; i < listaClaves.size(); i++) {
                        System.out.println((i + 1) + ". " + listaClaves.get(i));
                    }

                    int numContacto;
                    try {
                        System.out.print("Elige un contacto: ");
                        numContacto = Integer.parseInt(br.readLine()) - 1;
                    } catch (IOException ex) {
                        System.err.println("ERROR: Error de E/S...");
                        numContacto = -1;
                    } catch (NumberFormatException ex) {
                        System.err.println("ERROR: Introduce un número, por favor...");
                        numContacto = -2;
                    }

                    // Borrar al alumno de sus asignaturas
                    contactos.remove(listaClaves.get(numContacto));

                    break;
                case 21:
                    // Buscar contacto por número de teléfono
                    System.out.print("Escribe el nº: ");
                    System.out.println(contactos.get(br.readLine()));

                    break;

                case 22:
                    // Buscar contacto por nombre
                    
                    
                    break;

                case 31:
                    // Listado de todos los contactos, tal como se han añadido

                    break;

                case 32:
                    //  Listado de todos los contactos, ordenados por número de teléfono

                    break;

                case 4:

                    System.out.println("Saliendo......");

                    break;
                default:
                    System.err.println("ERROR: Introduce una opción válida...");
            }
        } while (opcion != 4);

    }

}
