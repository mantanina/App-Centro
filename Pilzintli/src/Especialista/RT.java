/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Especialista;

import ConexionDB.DbConnection;
import Usuario.nivel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owen Axel H
 */
public class RT {
   reTe r = new reTe();
   DbConnection conex = new DbConnection();
   public ArrayList<reTe>getnombre(){
       Statement stmt;
        ResultSet rs;
        ArrayList<reTe>listanombres=new ArrayList<>();
       try {
           stmt= conex.getConnection().createStatement();
            rs= stmt.executeQuery("SELECT  `nombre`  FROM `especialista`");
            while(rs.next()){
                r.setNombreT(rs.getString("nombre"));
                listanombres.add(r);
            }
            
            
       } catch (SQLException ex) {
           Logger.getLogger(RT.class.getName()).log(Level.SEVERE, null, ex);
       }
        return listanombres;
        
    
}

}
