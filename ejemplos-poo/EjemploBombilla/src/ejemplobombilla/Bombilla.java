package ejemplobombilla;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author widemos
 */
public class Bombilla {

    private boolean estado; // Propiedad

    // Constructor sin parámetros
    public Bombilla() {
        this.estado = false;    
    }    
    
    // Constructor con un parámetro
    public Bombilla( boolean estado ) {
        this.estado = estado; // this -> referencia al propio objeto
    }

    // Métodos del objeto
    public void encender() {
        estado = true;
    }

    public void apagar() {
        estado = false;
    }
}