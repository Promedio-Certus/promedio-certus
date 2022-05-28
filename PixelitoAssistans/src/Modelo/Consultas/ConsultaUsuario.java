/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Consultas;

import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author canow
 */
public class ConsultaUsuario extends Conexion implements ConsultasBD {
    

    @Override
    public boolean registrar(Object objeto) {
        Usuario user = (Usuario)objeto;
        
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuario (id_usuario,nombre,apellidos,dni,correo,contrasena) VALUES (?, ?, ?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, user.getId());//Atributos de la clase usuario - get seters
            ps.setString(2, user.getNombre());//Atributos de la clase usuario - get seters
            ps.setString(3, user.getApellidos());//Atributos de la clase usuario - get seters
            ps.setInt(4, user.getDni());//Atributos de la clase usuario - get seters
            ps.setString(5, user.getCorreo());//Atributos de la clase usuario - get seters
            ps.setString(6, user.getContraseña());//Atributos de la clase usuario - get seters
            

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("No se realizo el registro del usuario");
            System.err.println(e);
            return false;
            
           
        } finally { // Desconecta de la BD
            try {
                System.out.println("Se cerró con exito de la base de dato");
                con.close();
            } catch (SQLException e) {
                System.out.println("No se cerró con exito de la base de dato");
                System.err.println(e);
            }
        }

    }

    @Override
    public boolean modificar(Object objeto) {
        Usuario user = (Usuario)objeto;
        
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE usuario SET nombre=?,apellidos=?,dni=?,correo=?,contrasena=? WHERE id_usuario = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, user.getId());//Atributos de la clase usuario - get seters
            ps.setString(2, user.getNombre());//Atributos de la clase usuario - get seters
            ps.setString(3, user.getApellidos());//Atributos de la clase usuario - get seters
            ps.setInt(4, user.getDni());//Atributos de la clase usuario - get seters
            ps.setString(5, user.getCorreo());//Atributos de la clase usuario - get seters
            ps.setString(6, user.getContraseña());//Atributos de la clase usuario - get seters
            

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("No se realizo el registro del usuario");
            System.err.println(e);
            return false;
            
           
        } finally { // Desconecta de la BD
            try {
                System.out.println("Se cerró con exito de la base de dato");
                con.close();
            } catch (SQLException e) {
                System.out.println("No se cerró con exito de la base de dato");
                System.err.println(e);
            }
        }
    }

    @Override
    public boolean eliminar(Object objeto) {
        Usuario user = (Usuario)objeto;
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean buscar(Object objeto) {
        Usuario user = (Usuario)objeto;
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
