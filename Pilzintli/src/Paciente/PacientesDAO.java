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
        try{
            Statement estatuto = conex.getConnection().createStatement();
            
                String sqlInsert = "INSERT INTO paciente VALUES ("+pacientes.getNombre()+", '"
                                                                   +pacientes.getApellido_paterno()+", '"
                                                                   +pacientes.getApellido_materno()+", '"
                                                                   +pacientes.getFecha_nacimiento()+", '"
                                                                   +pacientes.getEscolaridad()+", '"
                                                                   +pacientes.getDiagnostico()+"');";
                System.out.println(""+sqlInsert);
                estatuto.executeUpdate(sqlInsert);
                
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente",
                                              "Informacion",JOptionPane.INFORMATION_MESSAGE);
                estatuto.close();
                conex.desconectar();
                
        }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }
        
//        public ArrayList<Pacientes> consultaPacientes()throws SQLException{
//            ArrayList<Pacientes> miRegistro = new ArrayList<Pacientes>();
//            DbConnection conex = new DbConnection();
//            try{
//                PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM pacientes");
//                ResultSet res = consulta.executeQuery();
//                while(res.next()){
//                    Pacientes pacientes = new Pacientes();
//                    pacientes.setNombre(res.getString("nombre"));
//                    pacientes.setApellido_paterno(res.getString("apellido paterno"));
//                    pacientes.setApellido_materno(res.getString("apellido materno"));
//                    pacientes.setFecha_nacimiento(res.getDate("Fecha de nacimiento"));
//                    pacientes.setEscolaridad(res.getString("Escolaridad"));
//                    pacientes.setDiagnostico(res.getString("Diagnostico"));
//                    pacientes.setStatus(res.getBoolean("Status"));
//                    miRegistro.add(pacientes);  
//                    
//                }
//                res.close();
//                consulta.close();
//                conex.desconectar();
//            }catch(Exception e){
//                JOptionPane.showMessageDialog(null, "No se consultaron los pacientes\n"+e);
//            }
//            return miRegistro;
//        }
}
}