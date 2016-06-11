/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioagendaclase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioAgendaClase {

    public static final int MAX_LINEAS = 24;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Agenda agenda = new Agenda();
        DatosAlumno alumno;
        String continuar = "S";
        boolean encontrado = false;
        System.out.println("Vamos a introducir datos:");
        do {

            alumno = new DatosAlumno();
            System.out.print("Nombre: ");
            alumno.setNombre(br.readLine());
            System.out.print("teléfono: ");
            alumno.setTel(br.readLine());
            System.out.print("Domicilio: ");
            alumno.setDomicilio(br.readLine());
            System.out.print("Fecha Nacimiento: ");
            alumno.setCumple(br.readLine());
            System.out.print("¿Desea añadir otro alumno?(S/N):");
            String p = br.readLine();
            agenda.add(alumno);
            if (p.equalsIgnoreCase("N")) {
                continuar = "N";

            }

        } while (continuar.equalsIgnoreCase("S") && agenda.getIndice() < MAX_LINEAS);
        do {

            System.out.print("¿Que nombre quiere buscar?: ");
            String busqueda = br.readLine().toUpperCase();
            for (int i = 0; i < agenda.getIndice(); i++) {
                if (agenda.getalumnos()[i].getNombre().toUpperCase().equals(busqueda)) {
                    System.out.print("Nombre: ");
                    System.out.println(agenda.getalumnos()[i].getNombre());
                    System.out.print("Telefono: ");
                    System.out.println(agenda.getalumnos()[i].getTel());
                    System.out.print("Domicilio: ");
                    System.out.println(agenda.getalumnos()[i].getDomicilio());
                    System.out.print("FechaNacimiento: ");
                    System.out.println(agenda.getalumnos()[i].getCumple());
                    encontrado = true;

                }
            }
            if (!encontrado) {
                System.out.println("No existe!, prueba otra vez.");
            }
        } while (!encontrado);
    }

}
