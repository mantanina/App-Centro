
package Agenda_Especialistas;

import ConexionDB.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class FuncionesCosulta {
    
    public DatosCita BuscarCita (String id) {

        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;
        ResultSet resultado;
        Statement estatuto1;
        String solicitudSQL1;
        ResultSet resultado1;
        Statement estatuto2;
        String solicitudSQL2;
        ResultSet resultado2;
        Statement estatuto3;
        String solicitudSQL3;
        ResultSet resultado3;
        Statement estatuto4;
        String solicitudSQL4;
        ResultSet resultado4;
        DatosCita consulta = null;

        try {
            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();
            consulta = new DatosCita();

            solicitudSQL = "SELECT id, fecha, hora, paciente_id, especialista_id, tipo_consulta_id, terapia_id, FROM "
                    + "consulta where id like '" + id +"'";
            System.out.println(solicitudSQL);

            resultado = estatuto.executeQuery(solicitudSQL);

            while (resultado.next()) {

                consulta.setId(resultado.getInt("id"));
                consulta.setFecha(resultado.getString("fecha"));
                consulta.setHora(resultado.getString("hora"));
                consulta.setPaciente_id(resultado.getInt("paciente_id"));
                consulta.setEspecialista_id(resultado.getInt("especialista_id"));
                consulta.setTipo_consulta_id(resultado.getInt("tipo_consulta_id"));
                consulta.setTerapia_id(resultado.getInt("terapia_id"));

            }
            
            estatuto1 = conexion.getConnection().createStatement();
            solicitudSQL1 = "SELECT nombre FROM paciente where id like '" + consulta.getPaciente_id() + "'";
            resultado1 = estatuto1.executeQuery(solicitudSQL1);
            
            while(resultado1.next()){
                consulta.setNombre_paciente(resultado1.getString("nombre"));
            }
            
            estatuto2 = conexion.getConnection().createStatement();
            solicitudSQL2 = "SELECT nombre FROM especialista where id like '" + consulta.getEspecialista_id() + "'";
            resultado2 = estatuto2.executeQuery(solicitudSQL2);
            
            while(resultado2.next()){
                consulta.setNombre_Especialista(resultado2.getString("nombre"));
            }
            
            estatuto3 = conexion.getConnection().createStatement();
            solicitudSQL3 = "SELECT tipo_consulta FROM tipo_consulta where id like '" + consulta.getTipo_consulta_id() + "'";
            resultado3 = estatuto3.executeQuery(solicitudSQL3);
            
            while(resultado3.next()){
                consulta.setTipo_consulta(resultado3.getString("tipo_consulta"));
            }
            
            estatuto4 = conexion.getConnection().createStatement();
            solicitudSQL4 = "SELECT terapia FROM terapia where id like '" + consulta.getTerapia_id() + "'";
            resultado4 = estatuto4.executeQuery(solicitudSQL4);
            
            while(resultado4.next()){
                consulta.setTerapia(resultado4.getString("terapia"));
            }

            
            estatuto.close();
            estatuto1.close();
            estatuto2.close();
            estatuto3.close();
            estatuto4.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se Encontraron Datos!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }

        return consulta;

    }
    
}
