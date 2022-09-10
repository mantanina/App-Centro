/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import ConexionDB.DbConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1234
 */
public class PacientesDAO {
    
    public void RegistrarPacientes(Pacientes pacientes){
        DbConnection conex = new DbConnection();
/*
Este metodo es para agredar los datos de los 
nuevos pacientes en la base de datos
*/
        try{
            Statement estatuto = conex.getConnection().createStatement();
            
                String sqlInsert = "INSERT INTO paciente (nombre, apellido_paterno, apellido_materno, fecha_nacimiento, escolaridad, diagnostico,padre_id) VALUES "
                    + "('" + pacientes.getNombre()
                    + "', '" + pacientes.getApellido_paterno()
                    + "', '" + pacientes.getApellido_materno()
                    + "', '" + pacientes.getFecha_nacimiento()
                    + "', '" + pacientes.getEscolaridad()
                    + "', '" + pacientes.getDiagnostico()
                    + "','" + pacientes.getPadre_id()+ "')";
                System.out.println(""+sqlInsert);
                estatuto.executeUpdate(sqlInsert);
                
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente al paciente",
                                              "Informacion",JOptionPane.INFORMATION_MESSAGE);
                estatuto.close();
                conex.desconectar();
                
        }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }

}
}