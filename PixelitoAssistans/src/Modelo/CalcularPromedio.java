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
public class CalcularPromedio {
    List<Integer> listaNotas = new ArrayList<>();
    
    double medidaAritmetica;
    
    String rendimiento;

    public double getMedidaAritmetica() {
        return medidaAritmetica;
    }

    public List<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public CalcularPromedio() {
    }
    
    
    
    
    public void calculadora(){
        
        double resultado = 0;
        double x;
        
      try {

            if (this.listaNotas != null) {
                for (int i = 0; i <= (listaNotas.size() - 1); i++) {

                    x = listaNotas.get(i);
                    resultado += x;
                }
                medidaAritmetica = resultado / this.listaNotas.size();
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error en listaNotas " +e);

        }
        
        
    }
    
}
