/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiendabicicletas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioTiendaBicicletas {

    public static final int MAX_CLIENTES = 10;
    public static final int MAX_REPARACIONES = 100;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        Cliente[] clientes = new Cliente[EjercicioTiendaBicicletas.MAX_CLIENTES];
        int numClientes = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        do {

            System.out.println("BICI-REPAIR");
            System.out.println("-----------");
            System.out.println("  1. Nuevo cliente\n"
                    + "  2. Nueva reparación\n"
                    + "  3. Mis reparaciones\n"
                    + "  4. Todas las reparaciones\n"
                    + "  5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    // Nuevo cliente
                    if (numClientes < MAX_CLIENTES) {
                        Cliente c = new Cliente();

                        System.out.print("Nombre: ");
                        c.setNombre(br.readLine());
                        System.out.print("Apellidos: ");
                        c.setApellidos(br.readLine());
                        System.out.print("DNI: ");
                        c.setDni(br.readLine());
                        System.out.print("Email: ");
                        c.setEmail(br.readLine());

                        clientes[numClientes] = c;
                        numClientes++;
                    } else {
                        System.out.println("ERROR: No caben más clientes...");
                    }
                    break;
                case 2:
                    // Nueva reparación (asociada a un cliente)

                    if (numClientes > 0) {

                        // Mostrar la lista de clientes
                        for (int i = 0; i < numClientes; i++) {
                            System.out.println(i + ". " + clientes[i].getNombre());
                        }

                        // Pedir un nº de cliente
                        System.out.println("Elige el cliente: ");
                        int n = Integer.parseInt(br.readLine());

                        if (n < numClientes) {
                            Reparacion r = new Reparacion();

                            System.out.print("Descripción: ");
                            r.setDescripcion(br.readLine());
                            System.out.print("Fecha inicio: ");
                            r.setFechaInicio(br.readLine());
                            System.out.print("Fecha fin: ");
                            r.setFechaFin(br.readLine());
                            System.out.print("Coste: ");
                            r.setCoste(Double.parseDouble(br.readLine()));

                            System.out.print("Pagado (s|n): ");
                            String respuesta = br.readLine();
                            if (respuesta.equalsIgnoreCase("s")) {
                                r.setPagado(true);
                            }

                            clientes[n].anyadirReparacion(r);
                        } else {
                            System.out.println("ERROR: El número de cliente no es válido...");
                        }
                    } else {
                        System.out.println("ERROR: No hay ningun cliente...");
                    }

                    break;
                case 3:
                    // Listado de misReparaciones()
                    if (numClientes > 0) {

                        // Mostrar la lista de clientes
                        for (int i = 0; i < numClientes; i++) {
                            System.out.println(i + ". " + clientes[i].getNombre());
                        }

                        // Pedir un nº de cliente
                        System.out.println("Elige el cliente: ");
                        int n = Integer.parseInt(br.readLine());
                        
                        System.out.println("Reparaciones de: "+clientes[n].getNombre());
                        clientes[n].misReparaciones();
                    }
                    break;
                case 4:
                    // Todas las reparaciones

                    for (int i = 0; i < numClientes; i++) {
                        System.out.println("Nombre: "+clientes[i].getNombre());
                        System.out.println("DNI: "+clientes[i].getDni());

                        clientes[i].misReparaciones();
                    }
                    break;
                case 5:
                    System.out.println("INFO: Saliendo...");
                    break;
                default:
                    System.out.println("ERROR: Opción equivocada...");
            }

        } while (opcion != 5);

    }

}
