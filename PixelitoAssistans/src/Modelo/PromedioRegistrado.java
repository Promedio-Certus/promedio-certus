/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JeanPool
 */
public class PromedioRegistrado {
    
    private List<Promedio> listaNotas = new ArrayList();

    public PromedioRegistrado() {
    }

    public void setListaNotas(List<Promedio> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public List<Promedio> getListaNotas() {
        return listaNotas;
    }
    
    
    
    
    public void EliminarPromedio(int i){
        i--;
        
        try {

            if (this.listaNotas != null) {
                listaNotas.remove(i);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error en listaNotas " +e);

        }
    }
    
}
