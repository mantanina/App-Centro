/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import ConexionDB.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Arreola N
 */
public class DatosUsuariosDAO {

    public DatoUsuarios RegistroUsuarios(String id) {

        DbConnection conexion;
        ResultSet resultado;
        Statement estatuto;
        String idBusqueda;
        String solicitudSQL = null;
        DatoUsuarios usuarios = null;
        DbConnection conex = new DbConnection();

        try {
            conexion = new DbConnection();
            usuarios = new DatoUsuarios();
            estatuto = conexion.getConnection().createStatement();
            idBusqueda = id;    

           solicitudSQL = "SELECT id, username,password,status, rol_id FROM usuario where id like " + idBusqueda;
            System.out.println(solicitudSQL);
                       
            resultado = estatuto.executeQuery(solicitudSQL);

       while (resultado.next()) {

                usuarios.setId(resultado.getInt("id"));
                usuarios.setUser(resultado.getString("username"));
                usuarios.setContraseña(resultado.getString("password"));
               usuarios.setStatus(resultado.getInt("status"));          
               usuarios.setRol_id(resultado.getInt("rol_id"));


            }

            estatuto.close();
            conexion.desconectar();
        } catch (SQLException e) {
             System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Encontraron Datos!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }

 return usuarios;
    }

public void ModiUsuarios(String status, String id) {

       DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;

        String idBusqueda;
        String situacion;

        try {

            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();
            idBusqueda = id;
            situacion = status;

            solicitudSQL = "UPDATE usuarios SET status = '" + situacion + "' where id like " + idBusqueda;
            System.out.println(solicitudSQL);
            
            estatuto.executeUpdate(solicitudSQL);
            
            JOptionPane.showMessageDialog(null,"Status Actualizado!","Informacion",JOptionPane.INFORMATION_MESSAGE);
            
            estatuto.close();
            conexion.desconectar();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Actualizar!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
