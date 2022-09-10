/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Consultas;

import Especialista.eliminar_Especialistas;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author david
 */
public class modificar_Cita extends javax.swing.JFrame {

    private String hora_global;
    private String id_cita_global;

    public modificar_Cita() throws IOException {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        BufferedImage imagenIcono = ImageIO.read(new File("logo_bcklss.png"));
        this.setTitle("Modificar Citas");
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
                        Logger.getLogger(eliminar_Especialistas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dispose();
                }

            }

        });

        campo_id_cita.setEditable(false);
        campo_hora_cita.setEditable(false);
        campo_pacienteNombre_cita.setEditable(false);
        campo_especialista_cita.setEditable(false);
        campo_tipo_cita.setEditable(false);
        campo_terapia_cita.setEditable(false);
        boton_Guardar.setEnabled(false);
        campo_fecha_cita.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_id_cita = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_fecha_cita = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_hora_cita = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campo_pacienteNombre_cita = new javax.swing.JTextField();
        campo_paciente_apellidoP = new javax.swing.JTextField();
        campo_paciente_apellidoM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo_especialista_cita = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campo_tipo_cita = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campo_terapia_cita = new javax.swing.JTextField();
        boton_Buscar = new javax.swing.JButton();
        boton_Guardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combo_hora = new javax.swing.JComboBox<>();
        calendarioBuscar = new com.toedter.calendar.JDateChooser();
        calendarioMod = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Cita");

        jLabel2.setText("Numero Cita:");

        jLabel3.setText("Hora:");

        jLabel4.setText("Fecha:");

        jLabel5.setText("Paciente:");

        campo_paciente_apellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_paciente_apellidoPActionPerformed(evt);
            }
        });

        campo_paciente_apellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_paciente_apellidoMActionPerformed(evt);
            }
        });

        jLabel6.setText("Especialista:");

        jLabel7.setText("Tipo Cita:");

        jLabel8.setText("Terapia:");

        boton_Buscar.setText("Buscar");
        boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscarActionPerformed(evt);
            }
        });

        boton_Guardar.setText("Guardar");
        boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_GuardarActionPerformed(evt);
            }
        });

        jLabel9.setText("Apellido Paterno:");

        jLabel10.setText("Apellido Materno:");

        combo_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_horaActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Buscar Cita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_paciente_apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(boton_Buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calendarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_paciente_apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campo_id_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campo_terapia_cita)
                                        .addComponent(campo_tipo_cita)
                                        .addComponent(campo_especialista_cita)
                                        .addComponent(campo_pacienteNombre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campo_hora_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campo_fecha_cita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(combo_hora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(calendarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(boton_Guardar, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(calendarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campo_paciente_apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campo_paciente_apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_id_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_pacienteNombre_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_especialista_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campo_tipo_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campo_terapia_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(campo_fecha_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calendarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_hora_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_Guardar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscarActionPerformed

        FuncionesCosulta FSQLC = new FuncionesCosulta();
        DatosCita datoscita;
        String apP_busqueda;
        String apM_busqueda;
        String fechaCita;
        Date fechaDirecta;
        DateFormat fechaFormateada;
        String nombreCompleto = "";

        fechaDirecta = calendarioBuscar.getDate();
        fechaFormateada = new SimpleDateFormat("yyyy-MM-dd");
        fechaCita = fechaFormateada.format(fechaDirecta);

        apP_busqueda = campo_paciente_apellidoP.getText();
        apM_busqueda = campo_paciente_apellidoM.getText();
        
        

        datoscita = FSQLC.BuscarCita(apP_busqueda, apM_busqueda, fechaCita);

        if (!(datoscita.getNombre_paciente().equals(""))) {

            JOptionPane.showMessageDialog(null, "Datos Encontrados!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            campo_id_cita.setText(Integer.toString(datoscita.getId()));
            campo_fecha_cita.setText(datoscita.getFecha());
            campo_hora_cita.setText(datoscita.getHora());
            
            nombreCompleto += datoscita.getNombre_paciente() + " ";
            nombreCompleto += campo_paciente_apellidoP.getText() + " ";
            nombreCompleto += campo_paciente_apellidoM.getText();         
            campo_pacienteNombre_cita.setText(nombreCompleto);
            
            campo_especialista_cita.setText(datoscita.getNombre_Especialista());
            campo_tipo_cita.setText(datoscita.getTipo_consulta());
            campo_terapia_cita.setText(datoscita.getTerapia());

            hora_global = datoscita.getHora();
            id_cita_global = Integer.toString(datoscita.getId());
            anadirComboBox();
            boton_Guardar.setEnabled(true);

        }


    }//GEN-LAST:event_boton_BuscarActionPerformed

    private void boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_GuardarActionPerformed

        FuncionesCosulta FSQLC = new FuncionesCosulta();
        String hora;
        String fecha;
        String fechaCita;
        Date fechaDirecta;
        DateFormat fechaFormateada;

        hora = (String) combo_hora.getSelectedItem();
        
        fechaDirecta = calendarioMod.getDate();
        fechaFormateada = new SimpleDateFormat("yyyy-MM-dd");
        fechaCita = fechaFormateada.format(fechaDirecta);  

        FSQLC.actualizarCita(id_cita_global, hora, fechaCita);

        campo_id_cita.setText("");
        campo_hora_cita.setText("");
        campo_pacienteNombre_cita.setText("");
        campo_especialista_cita.setText("");
        campo_tipo_cita.setText("");
        campo_terapia_cita.setText("");

        refrescarDatos();

    }//GEN-LAST:event_boton_GuardarActionPerformed

    private void campo_paciente_apellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_paciente_apellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_paciente_apellidoPActionPerformed

    private void campo_paciente_apellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_paciente_apellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_paciente_apellidoMActionPerformed

    private void combo_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_horaActionPerformed


    }//GEN-LAST:event_combo_horaActionPerformed

    private void anadirComboBox() {

        combo_hora.removeAllItems();
        combo_hora.addItem(hora_global);
        combo_hora.addItem("08:00:00");
        combo_hora.addItem("09:00:00");
        combo_hora.addItem("10:00:00");
        combo_hora.addItem("11:00:00");
        combo_hora.addItem("12:00:00");
        combo_hora.addItem("13:00:00");
        combo_hora.addItem("14:00:00");
        combo_hora.addItem("15:00:00");
        combo_hora.addItem("16:00:00");
        combo_hora.addItem("17:00:00");
        combo_hora.addItem("18:00:00");

    }
    
    private void refrescarDatos(){
        FuncionesCosulta FSQLC = new FuncionesCosulta();
        DatosCita datoscita;
        String apP_busqueda;
        String apM_busqueda;
        String fechaCita;
        Date fechaDirecta;
        DateFormat fechaFormateada;
        String nombreCompleto = "";

        fechaDirecta = calendarioMod.getDate();
        fechaFormateada = new SimpleDateFormat("yyyy-MM-dd");
        fechaCita = fechaFormateada.format(fechaDirecta);

        apP_busqueda = campo_paciente_apellidoP.getText();
        apM_busqueda = campo_paciente_apellidoM.getText();
        
        

        datoscita = FSQLC.BuscarCita(apP_busqueda, apM_busqueda, fechaCita);

        if (!(datoscita.getNombre_paciente().equals(""))) {

            JOptionPane.showMessageDialog(null, "Datos Encontrados!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            campo_id_cita.setText(Integer.toString(datoscita.getId()));
            campo_fecha_cita.setText(datoscita.getFecha());
            campo_hora_cita.setText(datoscita.getHora());
            
            nombreCompleto += datoscita.getNombre_paciente() + " ";
            nombreCompleto += campo_paciente_apellidoP.getText() + " ";
            nombreCompleto += campo_paciente_apellidoM.getText();         
            campo_pacienteNombre_cita.setText(nombreCompleto);
            
            campo_especialista_cita.setText(datoscita.getNombre_Especialista());
            campo_tipo_cita.setText(datoscita.getTipo_consulta());
            campo_terapia_cita.setText(datoscita.getTerapia());

            hora_global = datoscita.getHora();
            id_cita_global = Integer.toString(datoscita.getId());
            anadirComboBox();
            boton_Guardar.setEnabled(true);

        }

    }

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
                    new modificar_Cita().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(modificar_Cita.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Buscar;
    private javax.swing.JButton boton_Guardar;
    private com.toedter.calendar.JDateChooser calendarioBuscar;
    private com.toedter.calendar.JDateChooser calendarioMod;
    private javax.swing.JTextField campo_especialista_cita;
    private javax.swing.JTextField campo_fecha_cita;
    private javax.swing.JTextField campo_hora_cita;
    private javax.swing.JTextField campo_id_cita;
    private javax.swing.JTextField campo_pacienteNombre_cita;
    private javax.swing.JTextField campo_paciente_apellidoM;
    private javax.swing.JTextField campo_paciente_apellidoP;
    private javax.swing.JTextField campo_terapia_cita;
    private javax.swing.JTextField campo_tipo_cita;
    private javax.swing.JComboBox<String> combo_hora;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
