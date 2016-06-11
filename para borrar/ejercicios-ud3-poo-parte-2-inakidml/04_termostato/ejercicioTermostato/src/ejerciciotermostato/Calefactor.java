/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotermostato;

/**
 *
 * @author 7fprog02
 */
public class Calefactor {

    private boolean encendido = false;

    public  void encender() {
        System.out.println("Calefactor encendido");
        setEncendido(true);
    }

    public void apagar() {
        System.out.println("Calefactor Apagado");
        setEncendido(false);
    }

    /**
     * @return the encendido
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * @param encendido the encendido to set
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
