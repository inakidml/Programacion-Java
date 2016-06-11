/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomapkv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author widemos
 */
public class EjemploMapKV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Estructura Map<K,V>
        Map<String, String> aeropuertos = new HashMap<>();

        // Insertar datos
        aeropuertos.put("LHR", "Londres");
        aeropuertos.put("CDG", "París");
        aeropuertos.put("MAD", "Madrid");
        aeropuertos.put("BCN", "Barcelona");
        aeropuertos.put("BIO", "Bilbao");

        // Acceso a un elemento por clave
        System.out.println("Uno: ");
        System.out.println("  " + aeropuertos.get("LHR"));

        // Extraer el contenido en a una lista para recorrerlo
        List<String> lista = new ArrayList<>(aeropuertos.values());

        System.out.println("Lista: ");
        for (String nombre : lista) {
            System.out.println("  " + nombre);
        }

    }

}
