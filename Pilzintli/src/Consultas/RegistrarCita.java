/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import ConexionDB.DbConnection;
import java.sql.*;
import Menu.Principal;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author 1234
 */
public class RegistrarCita extends javax.swing.JFrame {
    
    DatosCita dc = new DatosCita();

    public RegistrarCita() throws IOException {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        BufferedImage imagenIcono = ImageIO.read(getClass().getResource("/Recursos/logo_bcklss.png"));
        this.setTitle("Altas Citas");
        this.setIconImage(imagenIcono);

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                int opc = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (opc == JOptionPane.YES_OPTION) {

                    try {
                        new Menu.Principal().setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dispose();
                }

            }

        });
        
        cbx_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
        "07:00:00",
        "08:00:00",
        "09:00:00",
        "10:00:00",
        "11:00:00",
        "12:00:00",
        "13:00:00",
        "14:00:00",
        "15:00:00",
        "16:00:00",
        "17:00:00",
        "18:00:00",
        "19:00:00",
        }));
        cbx_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_horaActionPerformed(evt);
            }
        });
        
        try {
            DbConnection conexion;
            Statement estatuto;
            String solicitudSQL;
            ResultSet resultado;

            cbx_paciente.removeAllItems();
            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();

            solicitudSQL = "SELECT id, nombre, apellido_paterno, apellido_materno FROM paciente";
            System.out.println(solicitudSQL);

            resultado = estatuto.executeQuery(solicitudSQL);

            while (resultado.next()) {

                int identificador = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apP = resultado.getString("apellido_paterno");
                String apM = resultado.getString("apellido_materno");

                String complexBuildString = String.valueOf(identificador) + "/" + nombre + " " + apP + " " + apM;
                cbx_paciente.addItem(complexBuildString);

            }

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        cbx_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pacienteActionPerformed(evt);
            }
        });
        
        try {
            DbConnection conexion;
            Statement estatuto;
            String solicitudSQL;
            ResultSet resultado;

            cbx_especialista.removeAllItems();
            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();

            solicitudSQL = "SELECT id, nombre, apellido_paterno, apellido_materno FROM especialista";
            System.out.println(solicitudSQL);

            resultado = estatuto.executeQuery(solicitudSQL);

            while (resultado.next()) {

                int identificador = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apP = resultado.getString("apellido_paterno");
                String apM = resultado.getString("apellido_materno");

                String complexBuildString = String.valueOf(identificador) + "/" + nombre + " " + apP + " " + apM;
                cbx_especialista.addItem(complexBuildString);

            }

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        cbx_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especialistaActionPerformed(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_res = new javax.swing.JButton();
        btn_bacck = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        cbx_hora = new javax.swing.JComboBox<>();
        cbx_paciente = new javax.swing.JComboBox<>();
        cbx_especialista = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Cita");

        btn_res.setText("Guardar");
        btn_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resActionPerformed(evt);
            }
        });

        btn_bacck.setText("Regresar");
        btn_bacck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bacckActionPerformed(evt);
            }
        });

        jLabel2.setText("Hora:");

        jLabel6.setText("Fecha:");

        jLabel7.setText("Paciente");

        jLabel8.setText("Especialista");

        cbx_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_horaActionPerformed(evt);
            }
        });

        cbx_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pacienteActionPerformed(evt);
            }
        });

        cbx_especialista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especialistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_bacck)
                            .addGap(18, 18, 18)
                            .addComponent(btn_res))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbx_paciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(cbx_hora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbx_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bacck)
                    .addComponent(btn_res))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resActionPerformed
        
        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;
        java.util.Date fechaCalendario = calendario.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        String hora = cbx_hora.getSelectedItem().toString();
        String fecha = df.format(fechaCalendario);
        
        
        
        String idPaciente = "";
        String idEspecialista = "";
        
        String nombrePaciente = cbx_paciente.getSelectedItem().toString();

        for (int i = 0; i < nombrePaciente.length() - 1; i++) {

            if (nombrePaciente.charAt(i) == '0'
                    || nombrePaciente.charAt(i) == '1'
                    || nombrePaciente.charAt(i) == '2'
                    || nombrePaciente.charAt(i) == '3'
                    || nombrePaciente.charAt(i) == '4'
                    || nombrePaciente.charAt(i) == '5'
                    || nombrePaciente.charAt(i) == '6'
                    || nombrePaciente.charAt(i) == '7'
                    || nombrePaciente.charAt(i) == '8'
                    || nombrePaciente.charAt(i) == '9') {
                
                idPaciente += nombrePaciente.charAt(i);
            }

        }
        
        String nombreEspecialista = cbx_especialista.getSelectedItem().toString();

        for (int i = 0; i < nombreEspecialista.length() - 1; i++) {

            if (nombreEspecialista.charAt(i) == '0'
                    || nombreEspecialista.charAt(i) == '1'
                    || nombreEspecialista.charAt(i) == '2'
                    || nombreEspecialista.charAt(i) == '3'
                    || nombreEspecialista.charAt(i) == '4'
                    || nombreEspecialista.charAt(i) == '5'
                    || nombreEspecialista.charAt(i) == '6'
                    || nombreEspecialista.charAt(i) == '7'
                    || nombreEspecialista.charAt(i) == '8'
                    || nombreEspecialista.charAt(i) == '9') {
                
                idEspecialista += nombreEspecialista.charAt(i);
            }

        }
        

        try {

            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();
        // Agrega la hora y fecha 
            solicitudSQL = "INSERT INTO consulta (id, fecha, hora, paciente_id, especialista_id, observaciones) "
                    + "VALUES (NULL, '"+ fecha +"', '"+hora+"', '"+idPaciente+"', '"+idEspecialista+"', NULL)";
            
            estatuto.executeUpdate(solicitudSQL);
         /// Indica que se a actualizada la agenda de especialistas   
            JOptionPane.showMessageDialog(null,"Cita Registrada con Exito!","Informacion",JOptionPane.INFORMATION_MESSAGE);
            
            estatuto.close();
            conexion.desconectar();          
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Registrar!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        }
        
    }//GEN-LAST:event_btn_resActionPerformed

    private void btn_bacckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bacckActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {

            try {
                new Menu.Principal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_btn_bacckActionPerformed

    private void cbx_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_horaActionPerformed

    private void cbx_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_pacienteActionPerformed

    private void cbx_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_especialistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrarCita().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(RegistrarCita.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bacck;
    private javax.swing.JButton btn_res;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> cbx_especialista;
    private javax.swing.JComboBox<String> cbx_hora;
    private javax.swing.JComboBox<String> cbx_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
