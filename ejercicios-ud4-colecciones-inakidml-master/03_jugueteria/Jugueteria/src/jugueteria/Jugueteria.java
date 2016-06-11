    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rubenbaltasar
 */
public class Jugueteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        List<Tienda> tiendas = new LinkedList<>();
        List<Juguete> juguetes = new LinkedList<>();
        List<Comprador> compradores = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        do {
            System.out.println("Selecciona una opcion:\n"
                    + "1.Gestión de tiendas\n"
                    + "     11. Nueva tienda\n"
                    + "     12. Baja de tienda\n"
                    + "2.Gestión de juguetes\n"
                    + "     21.Nuevo juguete (asociado a una tienda)\n"
                    + "     22.Modificar stock de un juguete\n"
                    + "3.Gestión de compras\n"
                    + "     31.Nuevo comprador\n"
                    + "     32.Baja de comprador\n"
                    + "     33.Realizar compra (asociar comprador y juguete)\n"
                    + "4.Consultas\n"
                    + "     41.Mostrar todas las compras de un comprador concreto\n"
                    + "     42.Mostrar los productos de una tienda con stock menor que 5 unidades\n"
                    + "     43.Mostrar los juguetes comprados en una tienda, incluyendo datos del comprador\n"
                    + "5.Salir");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 11:
                    // Nueva tienda
                    // Instanciar objeto
                    Tienda t = new Tienda();

                    // Pedir datos
                    System.out.print("Nombre: ");
                    t.setNombre(br.readLine());
                    System.out.print("Ciudad: ");
                    t.setCiudad(br.readLine());

                    // Guardar datos en coleccion principal
                    tiendas.add(t);
                    System.out.println("INFO: Tienda añadida...");

                    break;
                case 12:
                    // Baja tienda
                    // Seleccionar tienda
                    System.out.println("Selecciona una tienda: ");
                    int i = 0;
                    for (Tienda tiendass : tiendas) {
                        System.out.println((i + 1) + "." + tiendass);
                        i++;
                    }
                    int numTienda = Integer.parseInt(br.readLine()) - 1;

                    // Localizar tienda
                    Tienda ti = tiendas.get(numTienda);

                    // Desasociar juguetes de esa tienda
                    for (Juguete juguete : ti.getJuguetes()) {
                        juguete.getTiendas().remove(ti);
                    }

                    // Borrar tienda
                    tiendas.remove(ti);
                    break;

                case 21:
                    // Nuevo juguete
                    // Instanciar objeto
                    Juguete j = new Juguete();

                    // Seleccionar una tienda
                    System.out.println("Selecciona una tienda: ");
                    i = 0;
                    for (Tienda tiendass : tiendas) {
                        System.out.println((i + 1) + "." + tiendass);
                        i++;
                    }
                    numTienda = Integer.parseInt(br.readLine()) - 1;

                    //Pedir datos
                    System.out.print("Nombre: ");
                    j.setNombre(br.readLine());
                    System.out.print("Descripcion: ");
                    j.setDescripcion(br.readLine());
                    System.out.print("Precio: ");
                    j.setPrecio(Double.parseDouble(br.readLine()));
                    System.out.print("Stock: ");
                    j.setStock(Integer.parseInt(br.readLine()));

                    //Guardar datos en coleccion principal
                    juguetes.add(j);
                    System.out.println("INFO: Juguete añadido...");

                    //Localizar tienda y juguete.
                    ti = tiendas.get(numTienda);
                    //Asociar Juguetes y tienda.
                    ti.getJuguetes().add(j);
                    j.getTiendas().add(ti);

                    break;
                case 22:
                    // Modificar stock juguete

                    // Elegir el juguete
                    System.out.print("Selecciona un juguete: ");
                    i = 0;
                    for (Juguete juguetess : juguetes) {
                        System.out.println((i + 1) + "." + juguetess);
                        i++;
                    }
                    int numJuguete = Integer.parseInt(br.readLine()) - 1;

                    //Localizar el juguete
                    Juguete ju = juguetes.get(numJuguete);

                    // Actualizar stock del juguete
                    System.out.println("El stock actual es" + ju.getStock());
                    System.out.println("Introduzca el nuevo stock");
                    ju.setStock(Integer.parseInt(br.readLine()));

                    break;
                case 31:
                    // Nuevo comprador
                    // Instanciar objeto
                    Comprador c = new Comprador();

                    //Pedir datos
                    System.out.print("Nombre: ");
                    c.setNombre(br.readLine());
                    System.out.print("Apellidos: ");
                    c.setApellidos(br.readLine());
                    System.out.print("Email: ");
                    c.setEmail(br.readLine());

                    //Guardar datos en coleccion principal
                    compradores.add(c);

                    break;
                case 32:
                    // Baja comprador
                    // Seleccionar un comprador
                    System.out.print("Selecciona un comprador: ");
                    i = 0;
                    for (Comprador compradore : compradores) {
                        System.out.println((i + 1) + "." + compradore);
                        i++;
                    }
                    int numComprador = Integer.parseInt(br.readLine()) - 1;

                    // Localizar comprador
                    Comprador co = compradores.get(numComprador);

                    // Desasociar comprador y juguetes
                    for (Juguete juguete : co.getJuguetes()) {
                        juguete.getCompradores().remove(co);
                    }

                    // Eliminar comprador
                    compradores.remove(co);

                    break;
                case 33:
                    // Realizar compra (asociar comprador y juguete)
                    // Mostrar juguete y seleccionar
                    System.out.print("Selecciona un juguete: ");
                    i = 0;
                    for (Juguete juguetess : juguetes) {
                        System.out.println((i + 1) + "." + juguetess);
                        i++;
                    }
                    numJuguete = Integer.parseInt(br.readLine()) - 1;

                    // Mostrar comprador y seleccionar
                    System.out.print("Selecciona un comprador: ");
                    i = 0;
                    for (Comprador compradore : compradores) {
                        System.out.println((i + 1) + "." + compradore);
                        i++;
                    }
                    numComprador = Integer.parseInt(br.readLine()) - 1;

                    // Localizar Juguete y comprador
                    ju = juguetes.get(numJuguete);
                    co = compradores.get(numComprador);

                    // Asociar juguete y comprador
                    if (ju.getStock() > 0) {
                        ju.getCompradores().add(co);
                        co.getJuguetes().add(ju);
                        ju.setStock(ju.getStock() - 1);
                    } else {
                        System.out.println("ERROR: Stock insuficiente. ");
                    }

                    break;
                case 41:
                    // Mostrar todas las compras de un comprador concreto
                    // Mostrar compradores y seleccionar
                    System.out.print("Selecciona un comprador: ");
                    i = 0;
                    for (Comprador compradore : compradores) {
                        System.out.println((i + 1) + "." + compradore);
                        i++;
                    }
                    numComprador = Integer.parseInt(br.readLine()) - 1;

                    // Localizar comprador
                    co = compradores.get(numComprador);

                    // Mostrar las compras
                    System.out.println(co.getJuguetes());

                    break;
                case 42:
                    //Mostrar los productos de una tienda con stock menor que 5 unidades
                    // Seleccionar una tienda
                    System.out.println("Selecciona una tienda: ");
                    i = 0;
                    for (Tienda tiendass : tiendas) {
                        System.out.println((i + 1) + "." + tiendass);
                        i++;
                    }
                    numTienda = Integer.parseInt(br.readLine()) - 1;

                    // Localizar tienda
                    ti = tiendas.get(numTienda);

                    // Mostrar resultados
                    for (Juguete juguete : ti.getJuguetes()) {
                        if (juguete.getStock() < 5) {
                            System.out.println(juguete.getNombre() + juguete.getStock());
                        }
                    }

                    break;
                case 43:
                    // Mostrar los juguetes comprados en una tienda, incluyendo datos del comprador
                    // Selecciona la tienda
                    System.out.print("Selecciona una tienda: ");
                    i = 0;
                    for (Tienda tiendass : tiendas) {
                        System.out.println((i + 1) + "." + tiendass);
                        i++;
                    }
                    numTienda = Integer.parseInt(br.readLine()) - 1;

                    // Localizar tienda
                    ti = tiendas.get(numTienda);

                    // Mostrar resultados
                    for (Juguete juguete : ti.getJuguetes()) {
                        if (juguete.getCompradores().size() > 0) {
                            System.out.println("Juguete: " + juguete.getNombre());
                        }
                        for (Comprador compradore : juguete.getCompradores()) {
                            System.out.println("Comprador: " + compradore.getNombre());
                        }
                    }

                    break;
                case 5:
                    System.out.println("INFO: Saliendo..");
                    break;
                default:
                    System.err.println("ERROR: Opcion incorrecta...");
            }

        } while (opcion != 5);

    }

}
