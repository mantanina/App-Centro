/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import ConexionDB.DbConnection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Arreola N
 */
public class DatosUsuariosDAO {

    public void RegistroUsuarios(DatoUsuarios datousuarios) {

        DbConnection conex = new DbConnection();

        try {
            Statement estatuto = conex.getConnection().createStatement();
            String sqlInsert = "Insert INTO DatoUsuarios VALUES (" + datousuarios.getUser() + ", '" + datousuarios.getContraseña() + "');";

            System.out.println("" + sqlInsert);
            estatuto.executeUpdate(sqlInsert);

            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }
    }

}
