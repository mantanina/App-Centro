/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Especialista;

import ConexionDB.DbConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owen Axel H
* Este metodo nos permite borrar la informacion 
* de los pacienetes
 */
public class eliminacion {
    DbConnection conex = new DbConnection();
    public void inactivar(){
         Statement stmt;
        
        try {
            stmt= conex.getConnection().createStatement();
            stmt.executeQuery("INSERT INTO  `paciente` (`status`) values  (`0`)");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
