/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionbase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class ConversionBase {

    public static String convHexadecimal(int n) {
        int previo;
        String conversion = "";
        String resultado = "0x";
        while (n > 0) {                      //bucle para conseguir los restos
            //System.out.println(n);
            previo = n % 16;
            switch (previo) {               //conversion a letras
                case 10:
                    conversion += "A";
                    break;
                case 11:
                    conversion += "B";
                    break;
                case 12:
                    conversion += "C";
                    break;
                case 13:
                    conversion += "D";
                    break;
                case 14:
                    conversion += "E";
                    break;
                case 15:
                    conversion += "F";
                    break;
                default:
                    conversion += n % 16;
            }

            n /= 16;                       // siguiente div

        }
        for (int i = conversion.length(); i > 0; i--) { // bucle para invertir el String
            resultado += conversion.charAt(i - 1);      //-1 ya que el indice parte de 0 y la longitud de 1
        }
        return resultado;
    }

    public static String convOctal(int n) {
        String conversion = "";
        String resultado = "0o";
        while (n > 0) {                      //bucle para conseguir los restos
            //System.out.println(n);
            conversion += n % 8;             // restos
            n /= 8;                       // siguiente div

        }
        for (int i = conversion.length(); i > 0; i--) { // bucle para invertir el String
            resultado += conversion.charAt(i - 1);      //-1 ya que el indice parte de 0 y la longitud de 1
        }
        return resultado;
    }

    public static String convBinario(int n) {
        String conversion = "";
        String resultado = "0b";
        while (n > 0) {                      //bucle para conseguir los restos
            //System.out.println(n);
            conversion += n % 2;             // restos
            n /= 2;                       // siguiente div
        }
        for (int i = conversion.length(); i > 0; i--) { // bucle para invertir el String
            resultado += conversion.charAt(i - 1);      //-1 ya que el indice parte de 0 y la longitud de 1
        }
        return resultado;
    }

    public static String conversion(int n, String base) {
        String conversion;
        switch (base.toLowerCase()) {
            case "bin":
                conversion = convBinario(n); //llamamos a función convbinario
                //System.out.println(Integer.toBinaryString(n));
                //conversion = "0b" + Integer.toBinaryString(n);
                break;
            case "oct":
                conversion = convOctal(n);
                //System.out.println(Integer.toOctalString(n));
                //conversion = "0o" + Integer.toOctalString(n);
                break;
            case "hex":
                conversion = convHexadecimal(n);
                //System.out.println(Integer.toHexString(n));
                //conversion = "0x" + Integer.toHexString(n);
                break;
            default:
                conversion = "ERROR";
        }
        return conversion;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Que conversión quieres hacer (BIN, OCT, HEX)?: ");
        String base = br.readLine();
        System.out.print("Numero en base decimal: ");
        int numero = Integer.parseInt(br.readLine());
        System.out.println("Conversion a " + base + " = " + conversion(numero, base));

    }

}

/*

Resuelto en clase Recursivo

public static String cambioBase( int n, int b ) {
    
        String r = "";

        String prefijo = "";

        switch (b) {
            case 2:
                prefijo = "0b";
                break;
            case 8:
                prefijo = "0o";
                break;
            case 16:
                prefijo = "0x";
                break;
            default:
                prefijo = "0?";
                break;
        }
        
        String resultado;
        
        switch (n%b) {
            case 10:
                resultado = "A";
                break;
            case 11:
                resultado = "B";
                break;
            case 12:
                resultado = "C";
                break;
            case 13:
                resultado = "D";
                break;
            case 14:
                resultado = "E";
                break;
            case 15:
                resultado = "F";
                break;
            default:
                resultado = ""+(n%b);
        }
        
        if( n/b == 0 ) {            
            r = prefijo + r + resultado; // Caso base
        } else
        {
            r = r + cambioBase(n/b,b) + resultado; // Caso recursivo
        }
        
        return r;
    }
    
   
    public static void main(String[] args) {

        System.out.println("El número 35 en binario es: "+cambioBase(1457,16));
        
        
    }
    


*/