/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.List;

/**
 *
 * @author canow
 */
public interface Calificacion {
    
    //double promedio;
    
    double MediaAritmentica(nota){
        double promedio;
        int i;
        for(i = 0; i<notas.size(); i++){
           promedio += notas[i];
        }
        promedio = promedio / promedio.size();
        
        return promedio;
    }
    
    
    
    
}
