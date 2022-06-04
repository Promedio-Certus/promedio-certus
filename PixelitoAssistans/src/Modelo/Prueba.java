/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author canow
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Promedio prom1 = new Promedio("Mate",14.56);
        Promedio prom2 = new Promedio("Log",13.56);
        Promedio prom3 = new Promedio("Bio",12.56);           
        
        List<Promedio> listasNotas = new ArrayList<>();
        listasNotas.add(prom1);
        listasNotas.add(prom2);
        listasNotas.add(prom3);
        
        PromedioRegistrado promReg = new PromedioRegistrado();
        promReg.setListaNotas(listasNotas);
        promReg.EliminarPromedio(1);
        try {
            if (listasNotas != null) {
                for (int i = 0; i <= (listasNotas.size() - 1); i++) {

                    System.out.println(""+listasNotas.get(i).getNota());
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error en listaNotas " +e);

        }
        System.out.println("Quedan: ");
        
    }
    
    /*public static void main(String[] args) {
        List<Integer> notas = new ArrayList();
        notas.add(16);
        notas.add(14);
        notas.add(13);
        notas.add(10);
        
        CalcularPromedio pruebaProm = new CalcularPromedio();
        pruebaProm.setListaNotas(notas);  
        pruebaProm.calculadora();
        
        System.out.println(" " +pruebaProm.getMedidaAritmetica());
        
    }*/
    
/*
    public static String generatorId(String nombre, String correo) {
        String res;
        
        if (nombre == null || nombre.length() == 0) {
            return null;
        } else {
            char[] charArrNombre = nombre.toCharArray();
            char[] charArrCorreo = correo.toCharArray();
            res = charArrCorreo[0]+""+charArrCorreo[1]+""+charArrNombre[0]+""+charArrNombre[1];
            return res.toUpperCase();
        }
    }


    public static void main(String[] args) {
        String s = "demonstration";
        System.out.println("The string is: " + s);
        System.out.print("The first character of string is: " + generatorId("Brishman", "canowolf@hotmail.com"));
    }
*/
     
    
}
