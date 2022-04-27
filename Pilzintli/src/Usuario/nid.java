/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import ConexionDB.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/**
 *
 * @author Owen Axel H
 */
public class nid {
    nivel n =new nivel();
    DbConnection conex = new DbConnection();
//    public static Connection getConexion(){
//    Connection con=null;
//    String url="";
//    String pass="iscaxel19";
//    
//    class.forName("com.mysql")
//    }
     public ArrayList<nivel>getnombre(){
     // conexion nid con= nid.getConexion();
        Statement stmt;
        ResultSet rs;
        ArrayList<nivel>listanombres=new ArrayList<>();
        try {
            
            stmt= conex.getConnection().createStatement();
            rs= stmt.executeQuery("SELECT  `username`  FROM `usuario`");
            while(rs.next()){
                nivel n = new  nivel();
                n.setNombre(rs.getString("usename"));
                listanombres.add(n);
            }
        } catch (SQLException ex) {
            Logger.getLogger(nid.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listanombres;
     }
}
