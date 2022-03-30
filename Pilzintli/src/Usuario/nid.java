/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import ConexionDB.DbConnection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Owen Axel H
 */
public class nid {
    DbConnection conex = new DbConnection();
    public void InsertarN(String rol) throws SQLException{
         Statement estatuto = conex.getConnection().createStatement();
         
    }
}
