/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import Paciente.DatosPadreoTutor;
import ConexionDB.DbConnection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */

/*
Con este metodo nos pemrite agregar nuevos 
tutores en nuestra bas e de tados
 */
public class DatosTutorDAO {

    public void RegistrarDatosTutor(DatosPadreoTutor datostutor) {
        DbConnection conex = new DbConnection();

        try {
            Statement estatuto = conex.getConnection().createStatement();

            String insertSql1 = "INSERT INTO padre (id, nombre, apellido_paterno, apellido_materno, direccion, cp, municipio, estado) VALUES "
                    + "('" + datostutor.getIdtutor()
                    + "', '" + datostutor.getNombretutor()
                    + "', '" + datostutor.getApellidopaterno()
                    + "', '" + datostutor.getApellidomaterno()
                    + "', '" + datostutor.getDireccion()
                    + "', '" + datostutor.getCodigopostal()
                    + "', '" + datostutor.getMunicipio()
                    + "','" + datostutor.getEstado() + "')";

            System.out.println("" + insertSql1);
            estatuto.executeUpdate(insertSql1);

//                System.out.println(""+sqlInsert);
//                estatuto.executeUpdate(sqlInsert);
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }
        ///--------------------------------------------------------------------------

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

            solicitudSQL = "UPDATE padre SET status = '" + situacion + "' where id like " + idBusqueda;
            System.out.println(solicitudSQL);

            estatuto.executeUpdate(solicitudSQL);

            JOptionPane.showMessageDialog(null, "Status Actualizado!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Actualizar!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public void ModificarDatosTutor(DatosPadreoTutor datostutor) {
        DbConnection conex = new DbConnection();

        try {
            Statement estatuto = conex.getConnection().createStatement();

            String insertSql1 = "UPDATE padre SET nombre = '" + datostutor.getNombretutor() + "' , apellido_paterno = '" + datostutor.getApellidopaterno() + "', apellido_materno = '" + datostutor.getApellidomaterno() + "', direccion = '" + datostutor.getDireccion() + "', cp = '" + datostutor.getCodigopostal() + "', municipio = '" + datostutor.getMunicipio() + "', estado = '" + datostutor.getEstado() + "', status = '" + datostutor.getStatus() + "' where id like " + datostutor.getIdtutor();

            System.out.println("" + insertSql1);
            estatuto.executeUpdate(insertSql1);

//                System.out.println(""+sqlInsert);
//                estatuto.executeUpdate(sqlInsert);
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }
        ///--------------------------------------------------------------------------

    }
}
