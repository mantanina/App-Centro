package Especialista;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class eliminar_Especialistas extends javax.swing.JFrame {
    
    public eliminar_Especialistas() throws IOException {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        BufferedImage imagenIcono = ImageIO.read(getClass().getResource("/Recursos/logo_bcklss.png"));
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
                        Logger.getLogger(eliminar_Especialistas.class.getName()).log(Level.SEVERE, null, ex);
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
         
        nom_Esp.setEditable(false);
        profesion_Esp.setEditable(false);
        cedula_esp.setEditable(false);
        Especialidad_Esp.setEditable(false);
        telefono_Esp.setEditable(false);
        correo_Esp.setEditable(false);
        status_esp.setEditable(false);
        
        
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
        botonGuardar = new javax.swing.JButton();
        boton_Salir = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        Especialidad_Esp = new javax.swing.JTextField();
        correo_Esp = new javax.swing.JTextField();
        apellpate_Esp = new javax.swing.JTextField();
        apellmat_Esp = new javax.swing.JTextField();
        profesion_Esp = new javax.swing.JTextField();
        cedula_esp = new javax.swing.JTextField();
        nom_Esp = new javax.swing.JTextField();
        telefono_Esp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        id_Esp = new javax.swing.JTextField();
        status_esp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbx_status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Especialistas");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Apellido Materno");

        jLabel5.setText("Profesion");

        jLabel6.setText("Cédula");

        jLabel7.setText("Especialidad");

        jLabel8.setText("Teléfono");

        jLabel9.setText("Correo Electrónico");

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        boton_Salir.setText("Regresar");
        boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_SalirActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        Especialidad_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Especialidad_EspActionPerformed(evt);
            }
        });

        correo_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_EspActionPerformed(evt);
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

        nom_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_EspActionPerformed(evt);
            }
        });

        telefono_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_EspActionPerformed(evt);
            }
        });

        jLabel11.setText("ID");

        id_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_EspActionPerformed(evt);
            }
        });

        status_esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_espActionPerformed(evt);
            }
        });

        jLabel12.setText("Situacion");

        cbx_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_statusActionPerformed(evt);
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
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonBuscar)
                                    .addComponent(status_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel11))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(apellpate_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nom_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(id_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(apellmat_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(profesion_Esp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cedula_esp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Especialidad_Esp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(telefono_Esp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(boton_Salir)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonGuardar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel9))
                                        .addGap(40, 40, 40)
                                        .addComponent(correo_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellpate_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apellmat_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(botonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profesion_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cedula_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Especialidad_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(correo_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(status_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(boton_Salir))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
        FuncionesSQLEspecialista FSQLE = new FuncionesSQLEspecialista();
        String idBusqueda = id_Esp.getText();
        String status = cbx_status.getSelectedItem().toString();
        String nuevoStatus;

        if (status.equals("Activo")) {
            nuevoStatus = "1";
            FSQLE.ModificarStatus(nuevoStatus, idBusqueda);
        } else {
            if (status.equals("Inactivo")) {
                nuevoStatus = "0";
                FSQLE.ModificarStatus(nuevoStatus, idBusqueda);
            }
        }
        

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_SalirActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
        if (opc == JOptionPane.YES_OPTION) {
            
            try {
                new Menu.Principal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(eliminar_Especialistas.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_boton_SalirActionPerformed

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

    private void nom_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_EspActionPerformed

    private void telefono_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_EspActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        
        FuncionesSQLEspecialista FSQLE = new FuncionesSQLEspecialista();
        DatosEspecialista especialista;
        String apellidoP = apellpate_Esp.getText();
        String apellidoM = apellmat_Esp.getText();
        String id = id_Esp.getText();
        
        especialista = FSQLE.BuscarEspecialista(apellidoP, apellidoM,id);
        
        if (!(especialista.getNombre().equals(""))) {
            
            JOptionPane.showMessageDialog(null, "Datos Encontrados!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            
            id_Esp.setText(Integer.toString(especialista.getId()));
            nom_Esp.setText(especialista.getNombre());
            apellpate_Esp.setText(especialista.getApellidoPaterno());
            apellmat_Esp.setText(especialista.getApellidoMaterno());
            profesion_Esp.setText(especialista.getProfesion());
            cedula_esp.setText(especialista.getCedula());
            Especialidad_Esp.setText(especialista.getEspecialidad());
            telefono_Esp.setText(especialista.getTelefono());
            correo_Esp.setText(especialista.getCorreo());           
            
            if (especialista.getStatus() == 1) {
                status_esp.setText("Activo");
                
            } else {
                if (especialista.getStatus() == 0) {
                    status_esp.setText("Inactivo");
                }
                
            }
        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void id_EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_EspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_EspActionPerformed

    private void status_espActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_espActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_espActionPerformed

    private void cbx_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_statusActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new eliminar_Especialistas().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(eliminar_Especialistas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Especialidad_Esp;
    private javax.swing.JTextField apellmat_Esp;
    private javax.swing.JTextField apellpate_Esp;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton boton_Salir;
    private javax.swing.JComboBox<String> cbx_status;
    private javax.swing.JTextField cedula_esp;
    private javax.swing.JTextField correo_Esp;
    private javax.swing.JTextField id_Esp;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField nom_Esp;
    private javax.swing.JTextField profesion_Esp;
    private javax.swing.JTextField status_esp;
    private javax.swing.JTextField telefono_Esp;
    // End of variables declaration//GEN-END:variables
}
