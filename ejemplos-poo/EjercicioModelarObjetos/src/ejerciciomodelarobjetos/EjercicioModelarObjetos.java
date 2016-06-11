/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomodelarobjetos;

/**
 *
 * @author widemos
 */
public class EjercicioModelarObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Instanciar Alumno
        Alumno josu = new Alumno();

        josu.setNombre("Josu");
        
        System.out.println(josu.getNombre());
        
        
        // Instanciar Libro
        Libro libro1 = new Libro();
        
        // Llamar a los métodos públicos
        libro1.abrir();
        libro1.cerrar();

        
        libro1.setTitulo("El señor de los anillos");
        libro1.setNumPaginas(45454);
        
    }
    
}
