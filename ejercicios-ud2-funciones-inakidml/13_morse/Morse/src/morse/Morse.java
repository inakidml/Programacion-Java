/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class Morse {

    public static String morse(String frase) {
        String morse = "";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.toLowerCase().charAt(i);
            switch (caracter) {
                case 'a':
                    morse +=  ".- ";
                    break;
                case 'b':
                    morse +=  "-... ";
                    break;
                case 'c':
                    morse +=  "-.-. ";
                    break;
                case 'd':
                    morse +=  ".-- ";
                    break;
                case 'e':
                    morse +=  ". ";
                    break;
                case 'f':
                    morse +=  "..-. ";
                    break;
                case 'g':
                    morse +=  "--. ";
                    break;
                case 'h':
                    morse +=  ".... ";
                    break;
                case 'i':
                    morse +=  ".. ";
                    break;
                case 'j':
                    morse +=  ".--- ";
                    break;
                case 'k':
                    morse +=  "-.- ";
                    break;
                case 'l':
                    morse +=  ".-.. ";
                    break;
                case 'm':
                    morse +=  "-- ";
                    break;
                case 'n':
                    morse +=  "-. ";
                    break;
                case 'ñ':
                    morse +=  "--.-- ";
                    break;
                case 'o':
                    morse +=  "--- ";
                    break;
                case 'p':
                    morse +=  ".--. ";
                    break;
                case 'q':
                    morse +=  "--.- ";
                    break;
                case 'r':
                    morse +=  ".-. ";
                    break;
                case 's':
                    morse +=  "... ";
                    break;
                case 't':
                    morse +=  "- ";
                    break;
                case 'u':
                    morse +=  "..- ";
                    break;
                case 'v':
                    morse +=  "...- ";
                    break;
                case 'w':
                    morse +=  ".-- ";
                    break;
                case 'x':
                    morse +=  "-..- ";
                    break;
                case 'y':
                    morse +=  "-.-- ";
                    break;
                case 'z':
                    morse +=  "--.. ";
                    break;
                case '.':
                    morse +=  ".-.-.- ";
                    break;
                case ',':
                    morse +=  "--..-- ";
                    break;
                case '?':
                    morse +=  "..--.. ";
                    break;
                case '!':
                    morse +=  "-.-.-- ";
                    break;
                case ' ':
                    morse +=  "  ";
                    break;

                default:
                    morse +=  " ? ";
                    break;
            }
        }

        return morse;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase;
        do {

            System.out.print("Escribe una frase, (STOP) para terminar: ");
            frase = br.readLine();
            System.out.println("En morse: " + morse(frase));

        } while (!frase.equals("STOP"));

    }

}
