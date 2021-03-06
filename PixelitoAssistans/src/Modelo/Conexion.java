/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author canow
 */
public class Conexion {

    //SERVIDOR DE BASE DE DATOS MYSQL 3306
    private final String baseBd = "ykypmkom_pixelito";
    private final String usuarioBd = "ykypmkom_brish";
    private final String passwordBd = "CERTUS2022BDLJJ";
    private final String urlBd = "jdbc:mysql://agenciabrishmancl.com:3306/" + baseBd;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection con = null;

    public Connection getConexion() {
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(this.urlBd, this.usuarioBd, this.passwordBd);
            if (con != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Conexion fallida");
            System.err.println(e);
        }
        return con;
    }
    
    
//    public Connection getConnection() {
//        return con;
//    }
//
//    public void desconectar() {
//        con = null;
//        if (con == null) {
//            System.out.println("getConexion terminada");
//        }
//    }
}
