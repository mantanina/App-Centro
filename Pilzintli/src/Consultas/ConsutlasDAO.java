/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import ConexionDB.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arreola N
 */
public class ConsutlasDAO {

    public ArrayList<DatosConsultas> Datos_Consulta() {

        ArrayList<DatosConsultas> registro = new ArrayList<DatosConsultas>();
        DbConnection conex = new DbConnection();

        try {
            PreparedStatement consulta = conex.getConnection().
                    prepareStatement("SELECT * FROM consulta");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                DatosConsultas inventarioConsultas = new DatosConsultas();
                inventarioConsultas.setId(Integer.parseInt(resultado.getString("id")));
                inventarioConsultas.setFecha(resultado.getString("fecha"));
                inventarioConsultas.setHora(resultado.getString("hora"));
                inventarioConsultas.setPaciente_id(Integer.parseInt(resultado.getString("paciente_id")));
                inventarioConsultas.setEspecialista_id(Integer.parseInt(resultado.getString("especialista_id")));
                inventarioConsultas.setTipo_consulta_id(Integer.parseInt(resultado.getString("tipo_consulta_id")));
                inventarioConsultas.setTerapia_id(Integer.parseInt(resultado.getString("terapia_id")));

                registro.add(inventarioConsultas);
            }

            resultado.close();
            consulta.close();
            conex.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error en la consulta de Inventario\n" + e);
        }
        return registro;
    }
}
