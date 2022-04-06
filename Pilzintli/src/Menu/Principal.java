/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import Especialista.*;
import Paciente.*;
import Usuario.*;
import Tutor.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author david
 */
public class Principal extends javax.swing.JFrame {

    ImageIcon logoPortada = new ImageIcon("logo_bcklss.png");
    BufferedImage imagenIcono = ImageIO.read(new File("logo_bcklss.png"));

    public Principal() throws IOException {
        initComponents();
        
        this.setLocationRelativeTo(null);

        logo_label.setIcon(logoPortada);
        this.setIconImage(imagenIcono);

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                int opc = JOptionPane.showConfirmDialog(null, "Salir del Sistema?", "Cerrar Sesión", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (opc == JOptionPane.YES_OPTION) {
                    dispose();
                }

            }

        });

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        logo_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menu_Archivo = new javax.swing.JMenu();
        archivo_Salir = new javax.swing.JMenuItem();
        menu_Altas = new javax.swing.JMenu();
        altas_Especialista = new javax.swing.JMenuItem();
        altas_Paciente = new javax.swing.JMenuItem();
        altas_Tutor = new javax.swing.JMenuItem();
        altas_Usuario = new javax.swing.JMenuItem();
        menu_Modificaciones = new javax.swing.JMenu();
        mod_Especialista = new javax.swing.JMenuItem();
        mod_Paciente = new javax.swing.JMenuItem();
        mod_Tutor = new javax.swing.JMenuItem();
        mod_Usuario = new javax.swing.JMenuItem();
        menu_Bajas = new javax.swing.JMenu();
        bajas_Especialista = new javax.swing.JMenuItem();
        bajas_Paciente = new javax.swing.JMenuItem();
        bajas_Tutor = new javax.swing.JMenuItem();
        bajas_Usuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Administrativo para Piltzintli");

        menu_Archivo.setText("Archivo");

        archivo_Salir.setText("Salir");
        archivo_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivo_SalirActionPerformed(evt);
            }
        });
        menu_Archivo.add(archivo_Salir);

        barraMenu.add(menu_Archivo);

        menu_Altas.setText("Altas");

        altas_Especialista.setText("Especialistas");
        altas_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_EspecialistaActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_Especialista);

        altas_Paciente.setText("Pacientes");
        altas_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_PacienteActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_Paciente);

        altas_Tutor.setText("Tutores");
        altas_Tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_TutorActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_Tutor);

        altas_Usuario.setText("Usuarios");
        altas_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_UsuarioActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_Usuario);

        barraMenu.add(menu_Altas);

        menu_Modificaciones.setText("Modificaciones");

        mod_Especialista.setText("Especialistas");
        mod_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_EspecialistaActionPerformed(evt);
            }
        });
        menu_Modificaciones.add(mod_Especialista);

        mod_Paciente.setText("Pacientes");
        menu_Modificaciones.add(mod_Paciente);

        mod_Tutor.setText("Tutores");
        menu_Modificaciones.add(mod_Tutor);

        mod_Usuario.setText("Usuarios");
        menu_Modificaciones.add(mod_Usuario);

        barraMenu.add(menu_Modificaciones);

        menu_Bajas.setText("Bajas");

        bajas_Especialista.setText("Especialistas");
        bajas_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajas_EspecialistaActionPerformed(evt);
            }
        });
        menu_Bajas.add(bajas_Especialista);

        bajas_Paciente.setText("Pacientes");
        menu_Bajas.add(bajas_Paciente);

        bajas_Tutor.setText("Tutores");
        bajas_Tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajas_TutorActionPerformed(evt);
            }
        });
        menu_Bajas.add(bajas_Tutor);

        bajas_Usuario.setText("Usuarios");
        menu_Bajas.add(bajas_Usuario);

        barraMenu.add(menu_Bajas);

        jMenu1.setText("Consultas");
        barraMenu.add(jMenu1);

        jMenu2.setText("Ayuda");
        barraMenu.add(jMenu2);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altas_EspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altas_EspecialistaActionPerformed
        try {

            new registro_Especialistas().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();


    }//GEN-LAST:event_altas_EspecialistaActionPerformed

    private void mod_EspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_EspecialistaActionPerformed

        try {

            new modificar_Especialista().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();

    }//GEN-LAST:event_mod_EspecialistaActionPerformed

    private void bajas_EspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajas_EspecialistaActionPerformed
        try {

            new eliminar_Especialistas().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();

    }//GEN-LAST:event_bajas_EspecialistaActionPerformed

    private void archivo_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivo_SalirActionPerformed
        // TODO add your handling code here:

        int opcion = JOptionPane.showConfirmDialog(null, "Salir del Sistema?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (opcion == 0) {
            dispose();
        }
    }//GEN-LAST:event_archivo_SalirActionPerformed

    private void altas_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altas_PacienteActionPerformed

        try {

            new RegistrarPacientes().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();

    }//GEN-LAST:event_altas_PacienteActionPerformed

    private void altas_TutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altas_TutorActionPerformed
        try {
            new DatosTutor().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();

    }//GEN-LAST:event_altas_TutorActionPerformed

    private void altas_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altas_UsuarioActionPerformed
        try {
            new registro_Usuario().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_altas_UsuarioActionPerformed

    private void bajas_TutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajas_TutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajas_TutorActionPerformed

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
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altas_Especialista;
    private javax.swing.JMenuItem altas_Paciente;
    private javax.swing.JMenuItem altas_Tutor;
    private javax.swing.JMenuItem altas_Usuario;
    private javax.swing.JMenuItem archivo_Salir;
    private javax.swing.JMenuItem bajas_Especialista;
    private javax.swing.JMenuItem bajas_Paciente;
    private javax.swing.JMenuItem bajas_Tutor;
    private javax.swing.JMenuItem bajas_Usuario;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel logo_label;
    private javax.swing.JMenu menu_Altas;
    private javax.swing.JMenu menu_Archivo;
    private javax.swing.JMenu menu_Bajas;
    private javax.swing.JMenu menu_Modificaciones;
    private javax.swing.JMenuItem mod_Especialista;
    private javax.swing.JMenuItem mod_Paciente;
    private javax.swing.JMenuItem mod_Tutor;
    private javax.swing.JMenuItem mod_Usuario;
    // End of variables declaration//GEN-END:variables
}
