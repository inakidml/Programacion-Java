/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempresaempleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioEmpresaEmpleado {

    public static final int MAX_EMPRESAS = 10;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;//opcion elegída por usuario
        Empresa[] e = new Empresa[MAX_EMPRESAS];
        int indiceEmpresas = 0;//contador empresas creadas
        do {
            System.out.println("   1. Crear nueva empresa.\n"
                    + "   2. Añadir empleado a empresa ya existente.\n"
                    + "   3. Listado de empresas.\n"
                    + "   4. Listado detallado de empresas y empleados.\n"
                    + "   5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());
            int i = 0;//contador para listado empresas
            int otrai = 0;//contador para listado de empleados
            int indiceListados = 0; // empresa selecionada por el usuario para añadir currelas
            switch (opcion) {

                case 1:
                    Empresa empresa = new Empresa();
                    System.out.print("Nombre: ");
                    empresa.setNombre(br.readLine());
                    System.out.print("año fundacion: ");
                    empresa.setAnyoFundacion(br.readLine());
                    e[indiceEmpresas] = empresa;
                    indiceEmpresas++;

                    break;
                case 2:
                    while (e[i] != null && i < MAX_EMPRESAS) {
                        System.out.print(i + " - ");
                        System.out.println(e[i].getNombre());
                        i++;
                    }
                    System.out.print("A que empresa quieres añadir un empleado?: ");
                    indiceListados = Integer.parseInt(br.readLine());
                    Empleado t = new Empleado();
                    System.out.print("Nombre: ");
                    t.setNombre(br.readLine());
                    System.out.print("Apellidos: ");
                    t.setApellidos(br.readLine());
                    System.out.print("fecha Nacimiento: ");
                    t.setFechaNacimiento(br.readLine());
                    System.out.print("fecha Contrato: ");
                    t.setFechaContrato(br.readLine());
                    e[indiceListados].add(t);

                    break;

                case 3:
                    while (e[i] != null && i < MAX_EMPRESAS) {
                        System.out.println(e[i].getNombre());
                        System.out.println(e[i].getAnyoFundacion());
                        i++;
                    }

                    break;
                case 4:

                    while (e[i] != null && i < MAX_EMPRESAS) {
                        System.out.println("Empresa " + i);
                        System.out.println(e[i].getNombre());
                        System.out.println("-------------");
                        System.out.println("Empleados");
                        otrai = 0;

                        while (e[i].getEmpleados()[otrai] != null && otrai < Empresa.MAX_EMPLE) {
                            System.out.print(e[i].getEmpleados()[otrai].getNombre() + " ");
                            System.out.print(e[i].getEmpleados()[otrai].getApellidos() + " ");
                            System.out.print(e[i].getEmpleados()[otrai].getFechaNacimiento() + " ");
                            System.out.println(e[i].getEmpleados()[otrai].getFechaContrato());
                            otrai++;
                        }
                        i++;
                        System.out.println("***************");
                    }
                    break;

            }
        } while (opcion != 5);

    }

}
