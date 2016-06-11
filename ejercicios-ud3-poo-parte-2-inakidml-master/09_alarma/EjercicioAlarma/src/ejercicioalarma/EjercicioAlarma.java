/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalarma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author 7fprog02
 */
public class EjercicioAlarma {

    public static final int MAX_SENSORES = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        Alarma alarma = new Alarma();
        Random r = new Random();
        int pin;
        System.out.print("Introduzca el Telefono de aviso: ");
        alarma.setTelefonoAviso(Integer.parseInt(br.readLine()));
        System.out.println("---------");
        alarma.setPin(r.nextInt(10000));
        System.out.print("PIN: ");
        System.out.format("%04d", alarma.getPin());
        System.out.println("");
        System.out.println("---------");
        do {
            System.out.println("1. Activar alarma\n"
                    + "2. Desactivar alarma (necesario PIN)\n"
                    + "3. Consultar sensores\n"
                    + "4. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    //activar alarma
                    alarma.setActivada(true);
                    System.out.println("Alarma Activada.....");
                    break;
                case 2:
                    //Desactivar alarma
                    if (alarma.isActivada()) {
                        System.out.print("Introduzca el PIN: ");
                        pin = Integer.parseInt(br.readLine());
                        alarma.desactivar(pin);
                    } else {
                        System.out.println("La alarma esta desactivada!");
                    }
                    break;
                case 3:
                    //consultar sensores
                    if (alarma.isActivada()) {
                        alarma.consultarSensores();
                    } else {
                        System.out.println("Alarma desactivada");
                    }

                    break;
                case 4:
                    System.out.println("Saliendo!!");
                    break;
                default:
                    System.out.println("Error, opción incorrecta...");
            }

        } while (opcion != 4);

    }

}
