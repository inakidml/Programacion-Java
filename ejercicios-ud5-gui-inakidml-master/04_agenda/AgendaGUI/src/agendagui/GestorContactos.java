/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 7fprog02
 */
public class GestorContactos {

    private List<Contacto> contactos = new ArrayList<Contacto>();
    private Map<String, String> bTelefono = new HashMap<>();
    private Map<String, String> bEmail = new HashMap<>();
    private VPrincipal vPrincipal = null;

    public void nuevoContacto(Contacto c) {
        getContactos().add(c);
        System.out.println("Contacto añadido");
        System.out.println(getContactos().size());
    }

    public Contacto getContactoNumero(int n) {
        if (n < contactos.size()) {
            return contactos.get(n);
        } else {
            return null;
        }
    }

    /**
     * @param vPrincipal the vPrincipal to set
     */
    public void setvPrincipal(VPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    /**
     * @return the vPrincipal
     */
    public VPrincipal getvPrincipal() {
        return vPrincipal;
    }

    /**
     * @return the contactos
     */
    public List<Contacto> getContactos() {
        return contactos;
    }

    /**
     * @return the bTelefono
     */
    public Map<String, String> getbTelefono() {
        return bTelefono;
    }

    /**
     * @param bTelefono the bTelefono to set
     */
    public void setbTelefono(Map<String, String> bTelefono) {
        this.bTelefono = bTelefono;
    }

    /**
     * @return the bEmail
     */
    public Map<String, String> getbEmail() {
        return bEmail;
    }

    /**
     * @param bEmail the bEmail to set
     */
    public void setbEmail(Map<String, String> bEmail) {
        this.bEmail = bEmail;
    }
}
