/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import Paciente.DatosPadreoTutor;
import ConexionDB.DbConnection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */

/*
Con este metodo nos pemrite agregar nuevos 
tutores en nuestra bas e de tados
*/
public class DatosTutorDAO {
    public void RegistrarDatosTutor(DatosPadreoTutor datostutor){
        DbConnection conex = new DbConnection();

        try{
            Statement estatuto = conex.getConnection().createStatement();
            
            String insertSql1 = "INSERT INTO padre (id, nombre, apellido_paterno, apellido_materno, direccion, cp, municipio, estado) VALUES "
                    + "('" + datostutor.getIdtutor()
                    + "', '" + datostutor.getNombretutor()
                    + "', '" + datostutor.getApellidopaterno()
                    + "', '" + datostutor.getApellidomaterno()
                    + "', '" + datostutor.getDireccion()
                    + "', '" + datostutor.getCodigopostal()
                    + "', '" + datostutor.getMunicipio()
                    + "','" + datostutor.getEstado()+ "')";
 
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
        ///--------------------------------------------------------------------------

}
}
