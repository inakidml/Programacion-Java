/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechatexto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class FechaTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String[] numeros = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
            "diez", "once", "doce", "trece", "catorce", "qunice", "dieciseis", "Diecisiete", "Dieciocho", "Diecinueve",
            "Veinte", "Veintiuno", "Veintidos", "Veintitres", "Veinticuatro", "Veinticinco", "Veintiseis", "Veintisiete", "Veintiocho", "Veintinueve",
            "Treinta", "Treinta y uno"};
        String[] meses = {null, "enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] anos = {"Dos mil Quince"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca una fecha(DD/MM/AAAA): ");
        String cadena = br.readLine();

        String[] date = cadena.split("/");
        //System.out.println(date.length);
        int dia = Integer.parseInt(date[0]);
        int mes = Integer.parseInt(date[1]);
        int ano = Integer.parseInt(date[2]);

        System.out.println("La fecha es: " + numeros[dia] + " de " + meses[mes] + " de " + anos[0]);

    }

}
