/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaverias;

/**
 *
 * @author 7fprog02
 */
public class Averia {

    private String titulo;
    private String descripcion;
    private String fechaApertura;
    private int nivel;
    private Tecnico tecnico;

    public Averia(String titulo, String descripcion, String fechaApertura, int nivel, Tecnico tecnico) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.nivel = nivel;
        this.tecnico = tecnico;
    }
 public Averia(String titulo, String descripcion, String fechaApertura, int nivel) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.nivel = nivel;
    }

    public Averia() {
    }


    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Averia{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", fechaApertura=" + fechaApertura + ", nivel=" + nivel + '}';
    }

   

  

 

 

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the tecnico
     */
    public Tecnico getTecnico() {
        return tecnico;
    }

    /**
     * @param tecnico the tecnico to set
     */
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
