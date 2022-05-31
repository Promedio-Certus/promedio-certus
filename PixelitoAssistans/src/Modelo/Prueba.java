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
}
