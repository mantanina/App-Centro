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
 */
public class eliminacion {
    DbConnection conex = new DbConnection();
    public void inactivar(){
         Statement stmt;
        
        try {
            stmt= conex.getConnection().createStatement();
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
