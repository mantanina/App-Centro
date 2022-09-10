/*
Permite crear funciones de SQL para ser utilizadas durante el codigo
 */
package Especialista;

import ConexionDB.DbConnection;
import java.sql.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 * Esta clase contienen métodos sql y demas para diversas funcionalidades del
 * sistema
 *
 * @author Salvador Quiterio Saucedo
 * @author Cesar David Reyes Guillen
 * @since jPilzintli 1.0.0
 */
public class FuncionesSQLEspecialista {

    public DatosEspecialista BuscarEspecialista(String apP, String apM) {

        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;
        ResultSet resultado;
        DatosEspecialista especialista = null;

        try {
            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();
            especialista = new DatosEspecialista();

            solicitudSQL = "SELECT id, nombre, apellido_paterno, apellido_materno, profesion, cedula, especialidad, telefono, correo, status FROM "
                    + "especialista where apellido_paterno like '" + apP + "' and apellido_materno like '" + apM + "'";
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

            JOptionPane.showMessageDialog(null, "Status Actualizado!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Actualizar!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void ModificarDatos(String nombre, String apellidoPaterno, String apellidoMaterno, String profesion, String cedula, String especialidad, String telefono, String correo, String status, String id) {

        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;
    /// Metrodo para modificar los datos del especialita 
        try {

            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();
    /// UPDATE es el metodo para hacer las modificaciones 
            solicitudSQL = "UPDATE especialista SET nombre = '" + nombre + "' , apellido_paterno = '" + apellidoPaterno + "', apellido_materno = '" + apellidoMaterno + "', profesion = '" + profesion + "', cedula = '" + cedula + "', especialidad = '" + especialidad + "', telefono = '" + telefono + "', correo = '" + correo + "', status = '" + status + "' where id like " + id;
            System.out.println(solicitudSQL);

            estatuto.executeUpdate(solicitudSQL);
    /// si todo esta bien mandara un mensje que se a actualizado los datos 
            JOptionPane.showMessageDialog(null, "Datos Actualizados!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Actualizar!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    /**
     * Método que valida que se hayan introducido solo letras
     *
     * @author Salvador Quiterio Saucedo
     * @param letras Recibe el texto (letras)a validar de los campos de
     * texto(JTextFile)
     * @return Regresa valor booleano de la validación, True(No háy valores
     * inválidos) False(Hay valores inválidos)
     * @since jPilzintli 1.0.0
     */
    public boolean valida_letras(String letras) {
        Pattern patron_letras = Pattern.compile("[a-zA-Z ]+[a-zA-Z ]*[a-zA-Z ]*");
        Matcher validacioLetra = patron_letras.matcher(letras);
        if (validacioLetra.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que valida que se hayan introducido un correo electrónico válido
     *
     * @author Salvador Quiterio Saucedo
     * @param correo Recibe el valor de la caja de texto correo electronico
     * @return Regresa valor booleano de la validación, True(No háy valores
     * inválidos) False(Hay valores inválidos)
     * @since jPilzintli 1.0.0
     */
    public boolean valida_correo(String correo) {
        Pattern patron_correo = Pattern.compile("[a-z0-9_.]+@([a-z]+.)+(com|mx|edu)(mx)?");
        Matcher validacioLetra = patron_correo.matcher(correo);
        if (validacioLetra.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que valida que se haya introducido un teléfono válido
     *
     * @author Salvador Quiterio Saucedo
     * @param telefono Recibe el valor de la caja de texto teléfono
     * @return Regresa valor booleano de la validación, True(No háy valores
     * inválidos) False(Hay valores inválidos)
     * @since jPilzintli 1.0.0
     */
    public boolean valida_Telefono(String telefono) {
        Pattern patron_Telefono = Pattern.compile("[0-9]{10}");
        Matcher validacioLetra = patron_Telefono.matcher(telefono);
        if (validacioLetra.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que valida que se haya introducido una cédula válida
     *
     * @author Salvador Quiterio Saucedo
     * @param cedula Recibe el valor de la caja de texto cédula
     * @return Regresa valor booleano de la validación, True(No háy valores
     * inválidos) False(Hay valores inválidos)
     * @since jPilzintli 1.0.0
     */
    
    public boolean valida_Cedula(String cedula) {
        Pattern patron_Cedula = Pattern.compile("[0-9]{8}");
        Matcher validacioLetra = patron_Cedula.matcher(cedula);
        if (validacioLetra.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
