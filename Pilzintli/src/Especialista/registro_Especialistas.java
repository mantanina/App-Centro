package Especialista;

import Menu.*;
import ConexionDB.DbConnection;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.util.logging.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class registro_Especialistas extends javax.swing.JFrame {

    DatosEspecialista especialista = new DatosEspecialista();

    public void RegistrarEspecialistA(DatosEspecialista datosEspecialista) {
        DbConnection conex = new DbConnection();

        try {
            Statement estatuto = conex.getConnection().createStatement();

            String insertSql1 = "INSERT INTO especialista (nombre, apellido_paterno, apellido_materno, profesion, cedula, especialidad, telefono,correo,status) VALUES "
                    + "('" + nom_Esp.getText() + "', '" + apellpate_Esp.getText() + "', '" + apellmat_Esp.getText() + "', '" + profesion_Esp.getText() + "', '" + cedula_esp.getText() + "', '" + Especialidad_Esp.getText() + "','" + telefono_Esp.getText() + "','" + correo_Esp.getText() + "','" + especialista.getStatus() + "')";
            System.out.println("" + insertSql1);
            estatuto.executeUpdate(insertSql1);

            JOptionPane.showMessageDialog(null, "Se ha registrado el especialista",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
        }
    }

    public registro_Especialistas() throws IOException {
        initComponents();

        this.setLocationRelativeTo(null);

        BufferedImage imagenIcono = ImageIO.read(getClass().getResource("/Recursos/logo_bcklss.png"));
        this.setTitle("Altas Especialista");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nom_Esp = new javax.swing.JTextField();
        apellpate_Esp = new javax.swing.JTextField();
        apellmat_Esp = new javax.swing.JTextField();
        telefono_Esp = new javax.swing.JTextField();
        correo_Esp = new javax.swing.JTextField();
        profesion_Esp = new javax.swing.JTextField();
        cedula_esp = new javax.swing.JTextField();
        Especialidad_Esp = new javax.swing.JTextField();
        btn_resgistrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registro Especialistas");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno:");

        jLabel5.setText("Profesión:");

        jLabel6.setText("Cédula:");

        jLabel7.setText("Especialidad:");

        jLabel8.setText("Teléfono:");

        jLabel9.setText("Correo Electrónico:");

        nom_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_EspActionPerformed(evt);
            }
        });

        apellpate_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellpate_EspActionPerformed(evt);
            }
        });

        apellmat_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellmat_EspActionPerformed(evt);
            }
        });

        telefono_Esp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telefono_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_EspActionPerformed(evt);
            }
        });

        correo_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_EspActionPerformed(evt);
            }
        });

        profesion_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesion_EspActionPerformed(evt);
            }
        });

        cedula_esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_espActionPerformed(evt);
            }
        });

        Especialidad_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Especialidad_EspActionPerformed(evt);
            }
        });

        btn_resgistrar.setText("Registrar");
        btn_resgistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resgistrarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_salir.setText("Regresar");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correo_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellpate_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellmat_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nom_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profesion_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Especialidad_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cedula_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_limpiar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_salir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_resgistrar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nom_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellpate_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellmat_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(profesion_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cedula_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(52, 52, 52))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Especialidad_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(telefono_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(correo_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_resgistrar)
                    .addComponent(btn_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resgistrarActionPerformed

        //seteos de los campos para el registro de los datos 
        especialista.setNombre(telefono_Esp.getText());
        especialista.setApellidoPaterno(apellpate_Esp.getText());
        especialista.setApellidoMaterno(apellmat_Esp.getText());
        especialista.setProfesion(profesion_Esp.getText());
        especialista.setCedula(cedula_esp.getText());
        especialista.setEspecialidad(Especialidad_Esp.getText());
        especialista.setTelefono(nom_Esp.getText());
        especialista.setCorreo(correo_Esp.getText());
        especialista.setStatus(1);

        RegistrarEspecialistA(especialista);


    }//GEN-LAST:event_btn_resgistrarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        int opc = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {

            try {
                new Menu.Principal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }

    }//GEN-LAST:event_btn_salirActionPerformed

    private void Especialidad_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Especialidad_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Especialidad_EspActionPerformed

    private void correo_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_EspActionPerformed

    private void apellpate_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellpate_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellpate_EspActionPerformed

    private void apellmat_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellmat_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellmat_EspActionPerformed

    private void profesion_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesion_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesion_EspActionPerformed

    private void cedula_espActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_espActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_espActionPerformed

    private void telefono_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_EspActionPerformed

    private void nom_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_EspActionPerformed
   
    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        //Limpiar los campos de texto
        telefono_Esp.setText("");
        apellpate_Esp.setText("");
        apellmat_Esp.setText("");
        profesion_Esp.setText("");
        cedula_esp.setText("");
        Especialidad_Esp.setText("");
        nom_Esp.setText("");
        correo_Esp.setText("");
      
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new registro_Especialistas().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(registro_Especialistas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Especialidad_Esp;
    private javax.swing.JTextField apellmat_Esp;
    private javax.swing.JTextField apellpate_Esp;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_resgistrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField cedula_esp;
    private javax.swing.JTextField correo_Esp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom_Esp;
    private javax.swing.JTextField profesion_Esp;
    private javax.swing.JTextField telefono_Esp;
    // End of variables declaration//GEN-END:variables
}
