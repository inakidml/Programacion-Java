/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 7fprog02
 */
public class Alumno {
    private String nommbre;
    private String apellidos;
    private String telefono;
    private String email;

    /**
     * @return the nommbre
     */
    public String getNommbre() {
        return nommbre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nommbre=" + nommbre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + '}';
    }

    /**
     * @param nommbre the nommbre to set
     */
    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
