/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;
import ConexionDB.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Arreola N
 */
public class DatosPagosDAO {
    
public DatoPagos RegistrosPagos(String id){
DbConnection conexion;
        ResultSet resultado;
        Statement estatuto;
        String idBusqueda;
        String solicitudSQL = null;
        DatoPagos pago = null;
        DbConnection conex = new DbConnection();

try{
conexion = new DbConnection();
            pago = new DatoPagos();
            estatuto = conexion.getConnection().createStatement();
            idBusqueda = id;
 solicitudSQL = "SELECT id,cantidad, consulta_id FROM pago where id like " + idBusqueda;
            System.out.println(solicitudSQL);
            resultado = estatuto.executeQuery(solicitudSQL);
while (resultado.next()) {


}

}catch(SQLException e){
 System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Encontraron Datos!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
}
 return pago;
}
}
