
package Agenda_Especialistas;

import ConexionDB.DbConnection;
import Paciente.Pacientes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


public class FuncionesCosulta {
    
    public DatosCita BuscarCita (String apP, String apM, String fecha) {

        DbConnection conexion;
        Statement estatuto0;
        String solicitudSQL0;
        ResultSet resultado0;
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
        int id = 0;

        try {
            conexion = new DbConnection();
            
            estatuto0 = conexion.getConnection().createStatement();
            solicitudSQL0 = "SELECT id FROM paciente where apellido_paterno like '" + apP +"' and apellido_materno like '" + apM + "'";
            resultado0 = estatuto0.executeQuery(solicitudSQL0);
            
            while (resultado0.next()){
                id = resultado0.getInt("id");
            }
            
            
            
            estatuto = conexion.getConnection().createStatement();
            consulta = new DatosCita();

            solicitudSQL = "SELECT id, fecha, hora, paciente_id, especialista_id, tipo_consulta_id, terapia_id FROM "
                    + "consulta where id like " + id + " and fecha like '" + fecha +"'";

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
            solicitudSQL1 = "SELECT nombre FROM paciente where id like " + consulta.getPaciente_id();
            resultado1 = estatuto1.executeQuery(solicitudSQL1);
            
            while(resultado1.next()){
                consulta.setNombre_paciente(resultado1.getString("nombre"));
            }
            
            estatuto2 = conexion.getConnection().createStatement();
            solicitudSQL2 = "SELECT nombre FROM especialista where id like " + consulta.getEspecialista_id();
            resultado2 = estatuto2.executeQuery(solicitudSQL2);
            
            while(resultado2.next()){
                consulta.setNombre_Especialista(resultado2.getString("nombre"));
            }
            
            estatuto3 = conexion.getConnection().createStatement();
            solicitudSQL3 = "SELECT tipo_consulta FROM tipo_consulta where id like " + consulta.getTipo_consulta_id();
            resultado3 = estatuto3.executeQuery(solicitudSQL3);
            
            while(resultado3.next()){
                consulta.setTipo_consulta(resultado3.getString("tipo_consulta"));
            }
            
            estatuto4 = conexion.getConnection().createStatement();
            solicitudSQL4 = "SELECT terapia FROM terapia where id like " + consulta.getTerapia_id();
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
    
    public void actualizarCita (String id, String hora, String fecha){
        
        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;

        try {

            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();

            solicitudSQL = "UPDATE consulta SET hora = '"+ hora +"', fecha = '" + fecha +"' where id like " + id ;
            
            estatuto.executeUpdate(solicitudSQL);
            
            JOptionPane.showMessageDialog(null,"Datos Actualizados!","Informacion",JOptionPane.INFORMATION_MESSAGE);
            
            estatuto.close();
            conexion.desconectar();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Actualizar!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        }
               
    }
    
    public ArrayList<Pacientes> ConsultarPacienteCita(){
        
        ArrayList<Pacientes> registroc = new ArrayList<Pacientes>();
        
        DbConnection conex = new DbConnection();
        
        try{
            Pacientes registropaci = new Pacientes();
            PreparedStatement consultac = conex.getConnection().
                    prepareStatement("SELECT id, nombre, apellido_paterno, apellido_materno, status FROM paciente where apellido_paterno like"+ registropaci.getApellido_paterno() );
            ResultSet res = consultac.executeQuery();
            while (res.next()) {                
                
                registropaci.setId(res.getInt("id"));
                registropaci.setNombre(res.getString("nombre"));
                registropaci.setApellido_paterno(res.getString("apellido paterno"));
                registropaci.setApellido_materno(res.getString("apellido materno"));
                registropaci.setStatus(res.getInt("status"));
                
                registroc.add(registropaci);
            }
            res.close();
            consultac.close();
            conex.desconectar();
            
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Hubo un error en la consulta de del paciente\n"+e);
        }
        
        
        return registroc;
    }
    
}
