/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioHibrido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 7fprog02
 */
public class EjercicioHibrido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numPuertas;
        System.out.println("Vamos a crear un coche: ");
        System.out.print("¿Cuantos motores tiene?: ");
        int numMotores = Integer.parseInt(br.readLine());
        do {
            System.out.print("¿Cuantas puertas tiene?(2-5):");
            numPuertas = Integer.parseInt(br.readLine());
        } while (!(numPuertas >= 2 && numPuertas <= 5));

        Coche nuevoCoche = new Coche(numMotores, numPuertas);

        System.out.print("Marca: ");
        nuevoCoche.setMarca(br.readLine());
        System.out.print("Modelo: ");
        nuevoCoche.setModelo(br.readLine());
        System.out.print("Color(código): ");
        nuevoCoche.setColor(Integer.parseInt(br.readLine()));
        System.out.println("Vamos con los motores: ");
        for (int i = 0; i < nuevoCoche.getNumeroMotores(); i++) {
            System.out.print("Cilindrada del motor " + i + " : ");
            nuevoCoche.getMotor()[i].setCilindrada(Integer.parseInt(br.readLine()));
            System.out.print("Combustible del motor " + i + " : ");
            nuevoCoche.getMotor()[i].setCombustible(br.readLine());
            System.out.print("Potencia: ");
            nuevoCoche.getMotor()[i].setPotencia(Integer.parseInt(br.readLine()));
        }
        System.out.println("Vamos con las Ruedas: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Diametro de la rueda " + i + " : ");
            nuevoCoche.getRuedas()[i].setDiametro(br.readLine());

        }
        System.out.println("Ahora con las puertas: ");
        for (int i = 0; i < numPuertas; i++) {
            System.out.println("Tiene elevalunas la puerta " + i + " (true o false) :");
            nuevoCoche.getPuertas()[i].setElevalunasElectrico(Boolean.parseBoolean(br.readLine()));
        }

        System.out.println("El coche que has introducido es un: " + nuevoCoche.getMarca() + " " + nuevoCoche.getModelo() + " color: " + nuevoCoche.getColor());
        System.out.println("Tiene " + nuevoCoche.getNumeroMotores() + " motores ");
        for (int i = 0; i < nuevoCoche.getNumeroMotores(); i++) {
            System.out.println("El motor" + i + " :");
            System.out.println("Cilindrada: " + nuevoCoche.getMotor()[i].getCilindrada());
            System.out.println("Combustible: " + nuevoCoche.getMotor()[i].getCombustible());
            System.out.println("Potencia: " + nuevoCoche.getMotor()[i].getPotencia());

        }
        for (int i = 0; i < 4; i++) {
            System.out.println("La rueda " + i + " tiene un diametro de :" + nuevoCoche.getRuedas()[i].getDiametro());
        }
        for (int i = 0; i < nuevoCoche.getNumeroPuertas(); i++) {
            System.out.println("La puerta " + i + " tiene elevalunas electrico?: " + nuevoCoche.getPuertas()[i].isElevalunasElectrico());
        }
    }
}
