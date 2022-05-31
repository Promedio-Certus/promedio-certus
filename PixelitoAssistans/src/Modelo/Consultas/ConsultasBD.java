/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.Consultas;

/**
 *
 * @author canow
 */
public interface ConsultasBD {
    public boolean registrar(Object objeto);
    
//    Usuario user = (Usuario)objeto;
//        
//        PreparedStatement ps = null;
//        Connection con = getConexion();
//
//        String sql = "INSERT INTO usuario (id_usuario,nombre,apellidos,dni,correo,contrasena) VALUES (?, ?, ?,?)";
//
//        try {
//            ps = con.prepareStatement(sql);
//
//            ps.setString(1, user.getId());//Atributos de la clase usuario - get seters
//            ps.setString(2, user.getNombre());//Atributos de la clase usuario - get seters
//            ps.setString(3, user.getApellidos());//Atributos de la clase usuario - get seters
//            ps.setInt(4, user.getDni());//Atributos de la clase usuario - get seters
//            ps.setString(5, user.getCorreo());//Atributos de la clase usuario - get seters
//            ps.setString(6, user.getContraseña());//Atributos de la clase usuario - get seters
//            //ps.setDouble(5, user.getApellidos());//Atributos de la clase usuario - get seters
//            
//
//            ps.execute();
//            return true;
//        } catch (SQLException e) {
//            System.out.println("No se realizo el registro del usuario");
//            System.err.println(e);
//            return false;
//            
//           
//        } finally { // Desconecta de la BD
//            try {
//                System.out.println("Se cerró con exito de la base de dato");
//                con.close();
//            } catch (SQLException e) {
//                System.out.println("No se cerró con exito de la base de dato");
//                System.err.println(e);
//            }
//        }
    
    public boolean modificar(Object objeto);
    public boolean eliminar(Object objeto);
    public boolean buscar(Object objeto);
}
