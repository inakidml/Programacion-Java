/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobombilla;

/**
 *
 * @author widemos
 */
public class EjemploBombilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // new crea una instancia y guardamos su dirección en la referencia b
        Bombilla b = new Bombilla(true);    

        b.encender(); // Usamos la referencia b para mandar un mensaje al objeto

        Bombilla c = new Bombilla(); // Llamada al constructor sin parámetros
        
        c.encender();
        
    }
    
}
