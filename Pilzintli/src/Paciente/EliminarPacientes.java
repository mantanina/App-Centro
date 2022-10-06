/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import Menu.*;
import ConexionDB.DbConnection;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class EliminarPacientes extends javax.swing.JFrame {

    private boolean paciente = false;
    DefaultTableModel modelo = new DefaultTableModel();
    Object fila[] = new Object[3];

    /**
     * Creates new form RegistrarPacientes
     */
    public EliminarPacientes() throws IOException {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        BufferedImage imagenIcono = ImageIO.read(getClass().getResource("/Recursos/logo_bcklss.png"));
        this.setTitle("Bajas Paciente");
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
        
        cbx_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbx_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_statusActionPerformed(evt);
            }
        });
        
        try {
            DbConnection conexion;
            Statement estatuto;
            String solicitudSQL;
            ResultSet resultado;

            cbx_Padres.removeAllItems();
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
                cbx_Padres.addItem(complexBuildString);

            }

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        cbx_Padres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_PadresActionPerformed(evt);
            }
        });

        textNombre.setEditable(false);
        textApellidoMaterno.setEditable(false);
        textApellidoPaterno.setEditable(false);
        textFecha.setEditable(false);
        textEscolaridad.setEditable(false);
        textDiagnostico.setEditable(false);
        campo_IDPadre.setEditable(false);
        campo_Status.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textApellidoPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textEscolaridad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textApellidoMaterno = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        textFecha = new javax.swing.JTextField();
        campo_IDPadre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        campo_Status = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textDiagnostico = new javax.swing.JTextField();
        cbx_status = new javax.swing.JComboBox<>();
        cbx_Padres = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        jTextField5.setText(".");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1500, 700));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Pacientes");

        jLabel3.setText("Nombre:");

        textApellidoPaterno.setNextFocusableComponent(textApellidoMaterno);
        textApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoPaternoActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido Paterno:");

        jLabel5.setText("Apellido Materno:");

        textNombre.setNextFocusableComponent(textApellidoPaterno);
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        textEscolaridad.setNextFocusableComponent(campo_IDPadre);
        textEscolaridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEscolaridadActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha de nacimiento: (aaaa-mm-dd)  ");

        jLabel7.setText("Escolaridad:");

        textApellidoMaterno.setNextFocusableComponent(textFecha);
        textApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoMaternoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        textFecha.setNextFocusableComponent(textEscolaridad);
        textFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaActionPerformed(evt);
            }
        });

        campo_IDPadre.setNextFocusableComponent(btnGuardar);
        campo_IDPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_IDPadreActionPerformed(evt);
            }
        });

        jLabel8.setText("ID Padre/Tutor Responsable:");

        btn_back.setText("Regresar");
        btn_back.setNextFocusableComponent(textNombre);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel9.setText("ID:");

        campo_Status.setNextFocusableComponent(btnGuardar);
        campo_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_StatusActionPerformed(evt);
            }
        });

        jLabel10.setText("Situación:");

        jLabel11.setText("Diagnostico:");

        textDiagnostico.setNextFocusableComponent(textApellidoMaterno);
        textDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDiagnosticoActionPerformed(evt);
            }
        });

        cbx_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_statusActionPerformed(evt);
            }
        });

        cbx_Padres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_Padres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_PadresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(textApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(96, 96, 96)
                                        .addComponent(cbx_Padres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_buscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(btn_back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campo_IDPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(campo_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_IDPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btn_back)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbx_Padres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textEscolaridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEscolaridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEscolaridadActionPerformed

    private void textApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoMaternoActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        PacientesDAO FSQLE = new PacientesDAO();
        String status = cbx_status.getSelectedItem().toString();
        String nuevoStatus;
        
        String idBusqueda = "";
        String nombreTutor = cbx_Padres.getSelectedItem().toString();

        for (int i = 0; i < nombreTutor.length() - 1; i++) {

            if (nombreTutor.charAt(i) == '0'
                    || nombreTutor.charAt(i) == '1'
                    || nombreTutor.charAt(i) == '2'
                    || nombreTutor.charAt(i) == '3'
                    || nombreTutor.charAt(i) == '4'
                    || nombreTutor.charAt(i) == '5'
                    || nombreTutor.charAt(i) == '6'
                    || nombreTutor.charAt(i) == '7'
                    || nombreTutor.charAt(i) == '8'
                    || nombreTutor.charAt(i) == '9') {

                idBusqueda += nombreTutor.charAt(i);
            }

        }

        if (status.equals("Activo")) {
            nuevoStatus = "1";
            FSQLE.ModificarStatus(nuevoStatus, idBusqueda);
        } else {
            if (status.equals("Inactivo")) {
                nuevoStatus = "0";
                FSQLE.ModificarStatus(nuevoStatus, idBusqueda);
            }
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void textFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaActionPerformed

    }//GEN-LAST:event_textFechaActionPerformed

    private void textApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoPaternoActionPerformed

    private void campo_IDPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_IDPadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_IDPadreActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {

            try {
                new Menu.Principal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(RegistrarTutor.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;
        ResultSet resultado;
        
        String idBusqueda = "";
        String nombreTutor = cbx_Padres.getSelectedItem().toString();

        for (int i = 0; i < nombreTutor.length() - 1; i++) {

            if (nombreTutor.charAt(i) == '0'
                    || nombreTutor.charAt(i) == '1'
                    || nombreTutor.charAt(i) == '2'
                    || nombreTutor.charAt(i) == '3'
                    || nombreTutor.charAt(i) == '4'
                    || nombreTutor.charAt(i) == '5'
                    || nombreTutor.charAt(i) == '6'
                    || nombreTutor.charAt(i) == '7'
                    || nombreTutor.charAt(i) == '8'
                    || nombreTutor.charAt(i) == '9') {

                idBusqueda += nombreTutor.charAt(i);
            }

        }

        try {
            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();

            solicitudSQL = "SELECT id, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, escolaridad, diagnostico, padre_id, status FROM "
                    + "paciente where id like " + idBusqueda;

            System.out.println(solicitudSQL);

            resultado = estatuto.executeQuery(solicitudSQL);

            while (resultado.next()) {

                resultado.getInt("id");
                textNombre.setText(resultado.getString("nombre"));
                textApellidoPaterno.setText(resultado.getString("apellido_paterno"));
                textApellidoMaterno.setText(resultado.getString("apellido_materno"));
                textFecha.setText(resultado.getString("fecha_nacimiento"));
                textEscolaridad.setText(resultado.getString("escolaridad"));
                textDiagnostico.setText(resultado.getString("diagnostico"));
                campo_IDPadre.setText(String.valueOf(resultado.getInt("padre_id")));
                if (resultado.getInt("status") == 1) {
                    campo_Status.setText("Activo");
                } else if (resultado.getInt("status") == 0) {
                    campo_Status.setText("Inactivo");
                }

            }

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se Encontraron Datos!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void campo_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_StatusActionPerformed

    private void textDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDiagnosticoActionPerformed

    private void cbx_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_statusActionPerformed

    private void cbx_PadresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_PadresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_PadresActionPerformed

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
                    new EliminarPacientes().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EliminarPacientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField campo_IDPadre;
    private javax.swing.JTextField campo_Status;
    private javax.swing.JComboBox<String> cbx_Padres;
    private javax.swing.JComboBox<String> cbx_status;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField textApellidoMaterno;
    private javax.swing.JTextField textApellidoPaterno;
    private javax.swing.JTextField textDiagnostico;
    private javax.swing.JTextField textEscolaridad;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
