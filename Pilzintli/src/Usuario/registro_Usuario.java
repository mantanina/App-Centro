/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario;

import Menu.*;
import ConexionDB.DbConnection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
//nada
/**
 *
 * @author Arreola N
 */
public class registro_Usuario extends javax.swing.JFrame {
DatoUsuarios usuarios = new DatoUsuarios();
    
    //Agregar nuevos usuarios
    public void registroUsua(DatoUsuarios datousuarios){
         DbConnection conex = new DbConnection();
         
         try{
            Statement estatuto = conex.getConnection().createStatement();

            String insertSql1 = "INSERT INTO usuario (username, password ,status, rol_id) VALUES "
                    + "('" + userName.getText() + "', '" + contraseña.getText() + "', '"+ usuarios.getStatus() + "', '" + idRol.getText() + "')";
            System.out.println("" + insertSql1);
            estatuto.executeUpdate(insertSql1);

            JOptionPane.showMessageDialog(null, "Se ha registrado el nuevo usuario",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar(); 
         } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro los datos");
        }
        
    }
    /**
     * Creates new form registro_Usuario
     */
    public registro_Usuario() throws IOException  {
       initComponents(); 
         
BufferedImage imagenIcono = ImageIO.read(new File("logo.jpg"));
        this.setTitle("Bajas Especialista");
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
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idRol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statusUsuario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        agregarUsuario = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Salida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar usuarios");

        jLabel2.setText("UserName");

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Contraseña");

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        jLabel5.setText("idRol");

        idRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRolActionPerformed(evt);
            }
        });

        jLabel4.setText("Status");

        statusUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activado", "Desactivado" }));
        statusUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusUsuarioActionPerformed(evt);
            }
        });

        jButton1.setText("Nivel Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agregarUsuario.setText("Agregar");
        agregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUsuarioActionPerformed(evt);
            }
        });

        Borrar.setText("Limpiar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Salida.setText("Salir");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(13, 13, 13)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contraseña)
                                        .addComponent(idRol)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(statusUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Borrar)
                .addGap(18, 18, 18)
                .addComponent(Salida)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Borrar)
                    .addComponent(Salida)
                    .addComponent(agregarUsuario)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void idRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRolActionPerformed

    private void statusUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsuarioActionPerformed
        // TODO add your handling code here:
        if (!userName.getText().equalsIgnoreCase("") && !contraseña.getText().equalsIgnoreCase("") && !idRol.getText().equalsIgnoreCase("") && statusUsuario.getSelectedItem() != "Seleccionar") {

            usuarios.setUser(userName.getText());
            usuarios.setContraseña(contraseña.getText());
            usuarios.setRol_id(ALLBITS);
            

            registroUsua(usuarios);
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos incluyendo el status",
                "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_agregarUsuarioActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {

            try {
                new Menu.Principal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_SalidaActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
        userName.setText(" ");
        contraseña.setText(" ");
        idRol.setText(" ");

        //Limpia(remueve) los items del combo
        statusUsuario.removeAllItems();

        //Agrega las estatus para seleccionarlo(para que en automatico te de la opcion "seleccionar")
        statusUsuario.addItem("Activo");
        statusUsuario.addItem("Desactivado");
    }//GEN-LAST:event_BorrarActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new registro_Usuario().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(registro_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Salida;
    private javax.swing.JButton agregarUsuario;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField idRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> statusUsuario;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
