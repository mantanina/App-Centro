/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import ConexionDB.DbConnection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


/**
 *
 * @author 1234
 */
public class InventarioDAO {
    public ArrayList<Datos_Inventario> ConsultarInventario(){
        
        ArrayList<Datos_Inventario> registro = new ArrayList<Datos_Inventario>();
        
        DbConnection conex = new DbConnection();
        
        try{
            PreparedStatement consulta = conex.getConnection().
                    prepareStatement("SELECT * FROM inventario");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {                
                Datos_Inventario inventariodatos = new Datos_Inventario();
                inventariodatos.setId_inventario(Integer.parseInt(res.getString("id")));
                inventariodatos.setNombre_articulo(res.getString("nombre_articulo"));
                inventariodatos.setCantidad_disponible(Integer.parseInt(res.getString("cantidad_disponible")));
                inventariodatos.setFecha_entrada(res.getString("Fecha_entrada"));
                inventariodatos.setFecha_salida(res.getString("Fecha_salida"));
                
                registro.add(inventariodatos);
            }
            res.close();
            consulta.close();
            conex.desconectar();
            
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Hubo un error en la consulta de Inventario\n"+e);
        }
        
        
        return registro;
    }
    
    public void EliminarInventario(Datos_Inventario inventario){
        DbConnection conex = new DbConnection();
        try{
            Statement estatuto = conex.getConnection().createStatement();
            //delete from usuarios where nombre='Leonardo';
                String sqlDelete = "DELETE FROM inventario WHERE id ='" + inventario.getId_inventario() + "'";
                System.out.println(""+sqlDelete);
                estatuto.executeUpdate(sqlDelete);
                
                JOptionPane.showMessageDialog(null, "Se ha eliminado Exitosamente el producto",
                                              "Informacion",JOptionPane.INFORMATION_MESSAGE);
                estatuto.close();
                conex.desconectar();
                
        }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }
    
}
}
