/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaor
 */
public class Tramites {
     private String idTramite;
    private String descripcion;
    private String docAdjunto;

    public Tramites() {
    }

    public Tramites(String idTramite, String descripcion, String docAdjunto) {
        this.idTramite = idTramite;
        this.descripcion = descripcion;
        this.docAdjunto = docAdjunto;
    }

    public String getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(String idTramite) {
        this.idTramite = idTramite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDocAdjunto() {
        return docAdjunto;
    }

    public void setDocAdjunto(String docAdjunto) {
        this.docAdjunto = docAdjunto;
    }

   
}
