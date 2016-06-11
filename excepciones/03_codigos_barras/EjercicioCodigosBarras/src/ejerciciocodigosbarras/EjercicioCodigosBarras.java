/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocodigosbarras;

import java.io.IOException;

/**
 *
 * @author widemos
 */
public class EjercicioCodigosBarras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("INFO: Iniciando...");

        LectorCodigosBarras l = new LectorCodigosBarras();
        boolean bucle = true;
        do {
            try {
                l.conectar();
                l.lectura();
                System.out.println(l.verCodigo());
                bucle = false;
            } catch (IOException e) {
                System.out.println("Volvemos a intentarlo...");
                System.out.println(e.getMessage());

            } catch (CodigoNoValido e) {
                System.out.println("Codigo no valido...");
                System.out.println(e.getMessage());
            } finally {
                l.desconectar();
            }
        } while (bucle);
        System.out.println("INFO: Terminando...");
    }

}
