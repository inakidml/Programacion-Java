/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocodigosbarras;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author widemos
 */
public class LectorCodigosBarras {

    private long codigo = -1;

    private Random r = new Random();

    public void conectar() throws IOException {

        double error = r.nextDouble();

        if (error > 0.5) {
            System.out.println("INFO: Conectado...");
        } else {
            throw new IOException("No se ha podido establecer la conexión...");
        }
    }

    public void desconectar() {
        System.out.println("INFO: Desconectado...");
    }

    public void lectura() throws IOException {

        double error = r.nextDouble();

        if (error > 0.5) {
            System.out.println("INFO: Léido nuevo código...");
            codigo = r.nextLong();
        } else {
            throw new IOException("Error al leer el código...");
        }
    }

    public long verCodigo() throws CodigoNoValido {
        if (codigo > 0) {
            return codigo;
        } else {
            throw new CodigoNoValido();
        }
    }
}
