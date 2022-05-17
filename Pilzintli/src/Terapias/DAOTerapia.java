/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terapias;

import ConexionDB.DbConnection;
import Paciente.DatosPadreoTutor;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 1234
 */
public class DAOTerapia {
    public void RegistrarDatosTerapia(DatosTerapia datostereapia){
        DbConnection conex = new DbConnection();
        try{
            Statement estatuto = conex.getConnection().createStatement();
            
            String insertSql1 = "INSERT INTO terapia (terapia) VALUES "
                    + "('" + datostereapia.getTerapia()+ "')";
 
                System.out.println(""+insertSql1);
                estatuto.executeUpdate(insertSql1);
                
//                System.out.println(""+sqlInsert);
//                estatuto.executeUpdate(sqlInsert);
                
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente",
                                              "Informacion",JOptionPane.INFORMATION_MESSAGE);
                estatuto.close();
                conex.desconectar();
                
        }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }
        ///pp
}
}
