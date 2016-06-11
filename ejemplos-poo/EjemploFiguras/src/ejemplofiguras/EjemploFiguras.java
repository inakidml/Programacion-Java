/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofiguras;

/**
 *
 * @author widemos
 */
public class EjemploFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Figura f = new Figura();

        Circulo c = new Circulo();
        Triangulo t = new Triangulo();
        Rectangulo r = new Rectangulo();
        
        f.dibujar();
        
        c.dibujar();
        t.dibujar();
        r.dibujar();
        
    }
    
}
