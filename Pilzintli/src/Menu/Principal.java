/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import Consultas.modificar_Cita;
import Especialista.*;
import Paciente.*;
import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.jdbc.Driver;
import java.sql.*;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author david
 */
public class Principal extends javax.swing.JFrame {

    ImageIcon logoPortada = new ImageIcon("logo_bcklss.png");
    BufferedImage imagenIcono = ImageIO.read(new File("logo_bcklss.png"));
    Connection conexion;
    PreparedStatement ps;
    static String bd = "Piltzintli";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/" + bd;

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
        altas_citas = new javax.swing.JMenuItem();
        altas_Paciente = new javax.swing.JMenuItem();
        altas_tutores = new javax.swing.JMenuItem();
        altas_Especialista = new javax.swing.JMenuItem();
        menu_Modificaciones = new javax.swing.JMenu();
        mod_Citas = new javax.swing.JMenuItem();
        mod_Paciente = new javax.swing.JMenuItem();
        mod_Tutor = new javax.swing.JMenuItem();
        mod_Especialista = new javax.swing.JMenuItem();
        menu_Bajas = new javax.swing.JMenu();
        bajas_citas = new javax.swing.JMenuItem();
        bajas_Paciente = new javax.swing.JMenuItem();
        bajas_Tutor = new javax.swing.JMenuItem();
        bajas_Especialista = new javax.swing.JMenuItem();
        menu_Reportes = new javax.swing.JMenu();
        reporte_Diario = new javax.swing.JMenuItem();
        menu_Ayuda = new javax.swing.JMenu();
        ayuda_about = new javax.swing.JMenuItem();
        Manual = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sistema Administrativo de Control de Expedientes");

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

        altas_citas.setText("Citas");
        altas_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_citasActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_citas);

        altas_Paciente.setText("Pacientes");
        altas_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_PacienteActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_Paciente);

        altas_tutores.setText("Tutores");
        altas_tutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_tutoresActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_tutores);

        altas_Especialista.setText("Especialistas");
        altas_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_EspecialistaActionPerformed(evt);
            }
        });
        menu_Altas.add(altas_Especialista);

        barraMenu.add(menu_Altas);

        menu_Modificaciones.setText("Modificaciones");

        mod_Citas.setText("Citas");
        mod_Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_CitasActionPerformed(evt);
            }
        });
        menu_Modificaciones.add(mod_Citas);

        mod_Paciente.setText("Pacientes");
        menu_Modificaciones.add(mod_Paciente);

        mod_Tutor.setText("Tutores");
        mod_Tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_TutorActionPerformed(evt);
            }
        });
        menu_Modificaciones.add(mod_Tutor);

        mod_Especialista.setText("Especialistas");
        mod_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_EspecialistaActionPerformed(evt);
            }
        });
        menu_Modificaciones.add(mod_Especialista);

        barraMenu.add(menu_Modificaciones);

        menu_Bajas.setText("Bajas");

        bajas_citas.setText("Citas");
        menu_Bajas.add(bajas_citas);

        bajas_Paciente.setText("Pacientes");
        bajas_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajas_PacienteActionPerformed(evt);
            }
        });
        menu_Bajas.add(bajas_Paciente);

        bajas_Tutor.setText("Tutores");
        bajas_Tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajas_TutorActionPerformed(evt);
            }
        });
        menu_Bajas.add(bajas_Tutor);

        bajas_Especialista.setText("Especialistas");
        bajas_Especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajas_EspecialistaActionPerformed(evt);
            }
        });
        menu_Bajas.add(bajas_Especialista);

        barraMenu.add(menu_Bajas);

        menu_Reportes.setText("Reportes");

        reporte_Diario.setText("Diario");
        reporte_Diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_DiarioActionPerformed(evt);
            }
        });
        menu_Reportes.add(reporte_Diario);

        barraMenu.add(menu_Reportes);

        menu_Ayuda.setText("Ayuda");

        ayuda_about.setText("Acerca De");
        ayuda_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayuda_aboutActionPerformed(evt);
            }
        });
        menu_Ayuda.add(ayuda_about);

        Manual.setText("Manual");
        Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualActionPerformed(evt);
            }
        });
        menu_Ayuda.add(Manual);

        barraMenu.add(menu_Ayuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void bajas_TutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajas_TutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajas_TutorActionPerformed

    private void ayuda_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayuda_aboutActionPerformed
        try {
            new About().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ayuda_aboutActionPerformed

    private void ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualActionPerformed
        try {
            File objetofile = new File("archivo.pdf");
            Desktop.getDesktop().open(objetofile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_ManualActionPerformed

    private void reporte_DiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_DiarioActionPerformed

        String query;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, password);

            query = "SELECT consulta.id, consulta.hora, paciente.nombre, paciente.apellido_paterno, paciente.apellido_materno, especialista.nombre, pago.cantidad "
                    + "FROM consulta INNER JOIN paciente ON consulta.paciente_id = paciente.id INNER JOIN especialista ON consulta.especialista_id = especialista.id INNER JOIN pago ON pago.consulta_id = consulta.id "
                    + "WHERE consulta.fecha = CURDATE()";

            InputStream archivoJRXML = Principal.class.getResourceAsStream("reporteDiario.jrxml");
            JasperDesign diario = JRXmlLoader.load(archivoJRXML);
            JRDesignQuery updateDiario = new JRDesignQuery();
            updateDiario.setText(query);

            diario.setQuery(updateDiario);

            JasperReport jreport = JasperCompileManager.compileReport(diario);

            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, conexion);
            
            JasperViewer.viewReport(jprint,false);

        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_reporte_DiarioActionPerformed

    private void bajas_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajas_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajas_PacienteActionPerformed

    private void mod_CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_CitasActionPerformed
        try {
            new modificar_Cita().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_mod_CitasActionPerformed

    private void mod_TutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_TutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mod_TutorActionPerformed

    private void mod_EspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_EspecialistaActionPerformed

        try {

            new modificar_Especialista().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_mod_EspecialistaActionPerformed

    private void altas_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altas_citasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altas_citasActionPerformed

    private void altas_tutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altas_tutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altas_tutoresActionPerformed

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
                    Logger.getLogger(Principal.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Manual;
    private javax.swing.JMenuItem altas_Especialista;
    private javax.swing.JMenuItem altas_Paciente;
    private javax.swing.JMenuItem altas_citas;
    private javax.swing.JMenuItem altas_tutores;
    private javax.swing.JMenuItem archivo_Salir;
    private javax.swing.JMenuItem ayuda_about;
    private javax.swing.JMenuItem bajas_Especialista;
    private javax.swing.JMenuItem bajas_Paciente;
    private javax.swing.JMenuItem bajas_Tutor;
    private javax.swing.JMenuItem bajas_citas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel logo_label;
    private javax.swing.JMenu menu_Altas;
    private javax.swing.JMenu menu_Archivo;
    private javax.swing.JMenu menu_Ayuda;
    private javax.swing.JMenu menu_Bajas;
    private javax.swing.JMenu menu_Modificaciones;
    private javax.swing.JMenu menu_Reportes;
    private javax.swing.JMenuItem mod_Citas;
    private javax.swing.JMenuItem mod_Especialista;
    private javax.swing.JMenuItem mod_Paciente;
    private javax.swing.JMenuItem mod_Tutor;
    private javax.swing.JMenuItem reporte_Diario;
    // End of variables declaration//GEN-END:variables
}
