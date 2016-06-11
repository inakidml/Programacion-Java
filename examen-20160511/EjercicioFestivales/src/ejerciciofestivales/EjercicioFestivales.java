/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofestivales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author widemos
 */
public class EjercicioFestivales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Festival> festivales = new ArrayList<>();

        Map<String, Festival> google = new HashMap<>();

        int opcion;

        do {

            System.out.println("Festivales MM");
            System.out.println("-------------");
            System.out.println("1. Nuevo festival\n"
                    + "2. Nuevo grupo\n"
                    + "3. Cartel de festival\n"
                    + "4. Reservas\n"
                    + "5. Listado de todos los asistentes\n"
                    + "6. Salir");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    // Nuevo festival

                    // Nuevo objeto
                    Festival f = new Festival();

                    // Rellenarlo de datos
                    System.out.print("Nombre: ");
                    f.setNombre(br.readLine());
                    System.out.print("Fechas: ");
                    f.setFechas(br.readLine());
                    System.out.print("Género: ");
                    f.setGenero(br.readLine());
                    System.out.print("Ciudad: ");
                    f.setCiudad(br.readLine());
                    System.out.print("País: ");
                    f.setPais(br.readLine());

                    // Añadir a la colección
                    festivales.add(f);

                    // Añadir al buscador
                    google.put(f.getNombre().toLowerCase(), f);

                    break;
                case 2:
                    // Nuevo grupo

                    // Mirar si hay festivales
                    if (festivales.size() > 0) {

                        // Nuevo grupo
                        Grupo g = new Grupo();

                        System.out.print("Nombre: ");
                        g.setNombre(br.readLine());
                        System.out.print("Género: ");
                        g.setGenero(br.readLine());
                        System.out.print("Caché: ");
                        g.setCache(Double.parseDouble(br.readLine()));

                        // Localizar un festival
                        for (int i = 0; i < festivales.size(); i++) {
                            System.out.println((i + 1) + ". " + festivales.get(i));
                        }

                        System.out.print("Elige uno: ");
                        int fSeleccionado = Integer.parseInt(br.readLine()) - 1;

                        // Guardar el grupo
                        festivales.get(fSeleccionado).getGrupos().add(g);
                        g.getFestivales().add(festivales.get(fSeleccionado));

                    } else {
                        System.out.println("ERROR: Tienes que crear un festival primero...");
                    }
                    break;
                case 3:
                    // Cartel de festival

                    // Nombre a buscar
                    System.out.print("Nombre de festival: ");
                    String nombre = br.readLine();

                    /*                    
                    // Búsqueda
                    int i = 0;
                    while( i < festivales.size() && !festivales.get(i).getNombre().equals(nombre)) {
                        i++;
                    }

                    if( i < festivales.size() ) {
                        // Encontrado!!!
                        
                        // Mostrar el festival
                        System.out.println(festivales.get(i));
                        
                        // Mostrar el cartel
                        for (Grupo grupo : festivales.get(i).getGrupos()) {
                            System.out.println(grupo);
                        }
                    } else {
                        // No encontrado :(
                        System.out.println("ERROR: No encontrado...");
                    }
                     */
                    // Para contentar a Joseba
                    nombre = nombre.toLowerCase();

                    // Map<K,V>
                    if (google.containsKey(nombre)) {

                        // Mostrar el festival
                        System.out.println(google.get(nombre));

                        // Mostrar el cartel
                        for (Grupo grupo : google.get(nombre).getGrupos()) {
                            System.out.println(grupo);
                        }
                    } else {
                        System.out.println("ERROR: No encontrado...");
                    }

                    break;
                case 4:
                    // Reservas

                    if (festivales.size() > 0) {

                        // Mostrar la ventana
                        VReservas ventana = new VReservas();
                        ventana.setFestivales(festivales);
                        ventana.cargarFestival(0);
                        ventana.setVisible(true);
                    } else {
                        System.out.println("ERROR: Tienes que crear un festival primero...");
                    }

                    break;
                case 5:
                    // Listado de todos los asistentes

                    // Mirar si hay festivales
                    if (festivales.size() > 0) {

                        // Localizar un festival
                        for (int i = 0; i < festivales.size(); i++) {
                            System.out.println((i + 1) + ". " + festivales.get(i));
                        }

                        System.out.print("Elige uno: ");
                        int fSeleccionado = Integer.parseInt(br.readLine()) - 1;

                        // Mostrar el festival
                        System.out.println(festivales.get(fSeleccionado));

                        // Mostrar sus asistentes
                        Iterator<Asistente> it = festivales.get(fSeleccionado).getAsistentes().iterator();

                        while (it.hasNext()) {
                            Asistente a = it.next();
                            System.out.println(a);
                        }

                    } else {
                        System.out.println("ERROR: Tienes que crear un festival primero...");
                    }

                    break;
                case 6:
                    System.out.println("INFO: Saliendo...");
                    break;
                default:
                    System.out.println("ERROR: Opción equivocada...");
            }

        } while (opcion != 6);

    }

}
