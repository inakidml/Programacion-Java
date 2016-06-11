/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiendabicicletas;

/**
 *
 * @author widemos
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String dni;
    private String email;

    
    private Reparacion[] reparaciones = new Reparacion[EjercicioTiendaBicicletas.MAX_REPARACIONES];
    private int numReparaciones = 0;

    /**
     * Añadir una nueva reparación al array
     * @param r La reparación a añadir
     */
    public void anyadirReparacion( Reparacion r ) {
        reparaciones[numReparaciones] = r;
        numReparaciones++;
    }
    
    public void misReparaciones() {
        
        for (int i = 0; i < numReparaciones; i++) {
            System.out.println("Descripción: "+reparaciones[i].getDescripcion());
            System.out.println("Fecha inicio: "+reparaciones[i].getFechaInicio());
            System.out.println("Fecha de fin: "+reparaciones[i].getFechaFin());
            System.out.println("Coste: "+reparaciones[i].getCoste());
            if( reparaciones[i].isPagado() ) {
                System.out.println("Pagado.");
            } else {
                System.out.println("¡¡Moroso!!");
            }
        }
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
