/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempleados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Empresa empresa = new Empresa();

        String respuesta = null;

        do {

            // Crear el objeto Trabajador
            Trabajador t = new Trabajador();

            // Rellenar el objeto Trabajador
            System.out.print("Nombre: ");
            t.setNombre(br.readLine());
            System.out.print("NumSS: ");
            t.setnSS(br.readLine());
            System.out.print("Días: ");
            t.setNumDias(Integer.parseInt(br.readLine()));

            // Guardar el objeto en el Ticket
            empresa.add(t);

            // ¿Continuar?
            System.out.print("¿Quiere añadir otro empleado? (s|n): ");
            respuesta = br.readLine();

        } while (empresa.totalTrabajadors() < Empresa.MAX_EMPLE && respuesta.equalsIgnoreCase("s"));
       //imprimir los mas antiguos y los mas nuevos

        Trabajador[] antiguedad= empresa.listadoAntiguedad();
        for (int i = 0; i < antiguedad.length; i++) {
            System.out.println(antiguedad[i]);
        }
        //array ordenado
        /*
         Trabajador[] ordenado = new Trabajador[empresa.totalTrabajadors()];
         ordenado = empresa.ordenarTrabajadors(empresa.getTrabajadors());
         for (int i = 0; i < empresa.totalTrabajadors(); i++) {
         System.out.println(ordenado[i]);
         
    }
*/
}

}
