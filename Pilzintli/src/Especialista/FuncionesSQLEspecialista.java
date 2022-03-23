/*
Permite crear funciones de SQL para ser utilizadas durante el codigo
 */
package Especialista;

import ConexionDB.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class FuncionesSQLEspecialista {

    public DatosEspecialista BuscarEspecialista(String id) {

        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;
        String idBusqueda;
        ResultSet resultado;
        DatosEspecialista especialista = null;

        try {
            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();
            idBusqueda = id;
            especialista = new DatosEspecialista();

            solicitudSQL = "SELECT id, nombre, apellido_paterno, apellido_materno, profesion, cedula, especialidad, telefono, correo, status FROM especialista where id like " + idBusqueda;
            System.out.println(solicitudSQL);

            resultado = estatuto.executeQuery(solicitudSQL);

            while (resultado.next()) {

                especialista.setId(resultado.getInt("id"));
                especialista.setNombre(resultado.getString("nombre"));
                especialista.setApellidoPaterno(resultado.getString("apellido_paterno"));
                especialista.setApellidoMaterno(resultado.getString("apellido_materno"));
                especialista.setProfesion(resultado.getString("profesion"));
                especialista.setCedula(resultado.getString("cedula"));
                especialista.setEspecialidad(resultado.getString("especialidad"));
                especialista.setTelefono(resultado.getString("telefono"));
                especialista.setCorreo(resultado.getString("correo"));
                especialista.setStatus(resultado.getInt("status"));

            }

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se Encontraron Datos!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }

        return especialista;

    }

    public void ModificarStatus(String status, String id) {

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

            solicitudSQL = "UPDATE especialista SET status = '" + situacion + "' where id like " + idBusqueda;
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
