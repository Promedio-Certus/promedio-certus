/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vista.Promedio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author canow
 */
public class ControllerPromedio implements ActionListener {
    
    private Promedio ViewPromedio;
    private Usuario ModelUsuario;
    
    public ControllerPromedio(Promedio vista, Usuario usuario){
        this.ViewPromedio = vista;
        this.ModelUsuario = usuario;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
