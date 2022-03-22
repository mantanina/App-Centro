/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConexionDB;

import java.sql.*;
/**
 *
 * @author 1234
 */
public class DbConnection {
    static String bd = "Piltzintli";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+bd;
    
    Connection connection = null;
    
    /** Constructor de DbConnection */
    public DbConnection(){
        try{
            //obtenemos el driver para mysql.
            Class.forName("com.mysql.jdbc.Driver");
            //se obtiene la conexion
            connection = DriverManager.getConnection(url,login,password);
            
            if(connection!=null){
                System.out.println("Conexion a la base de datos: "+bd+"  CORRECTA...\n");
            }
            
            }catch(SQLException e){
                System.out.println(e);
                    }catch(ClassNotFoundException e){
                        System.out.println(e);
                        }catch(Exception e){
                            System.out.println(e);
                        }
    }
    
    /**´Permite retornar la conexion.*/
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
}
