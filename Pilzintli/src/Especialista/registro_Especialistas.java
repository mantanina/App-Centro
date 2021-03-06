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

/**
 * Éste Jframe de Java pretende el registro de especialistas al sistema
 *
 * @author Salvador Quiterio Saucedo
 * @author Cesar David Reyes Guillen
 * @since jPilzintli 1.0.0
 */
public class registro_Especialistas extends javax.swing.JFrame {

    DatosEspecialista especialista = new DatosEspecialista();

    /**
     * Método que registra el especialista a partir de los campos de texto
     *
     * @param datosEspecialista Trae consigo los datos insertados a los campos
     * de texto
     * @since jPilzintli 1.0.0
     */
    public void RegistrarEspecialistA(DatosEspecialista datosEspecialista) {
        DbConnection conex = new DbConnection();

        try {
            Statement estatuto = conex.getConnection().createStatement();

            String insertSql1 = "INSERT INTO usuario (nombre, apellido_paterno, apellido_materno, profesion, cedula, especialidad, telefono,correo,status) VALUES "
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

    /**
     * Creates new form Especialistas
     */
    public registro_Especialistas() throws IOException {
        initComponents();

        this.setLocationRelativeTo(null);

        BufferedImage imagenIcono = ImageIO.read(new File("logo_bcklss.png"));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_resgistrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        Especialidad_Esp = new javax.swing.JTextField();
        correo_Esp = new javax.swing.JTextField();
        apellpate_Esp = new javax.swing.JTextField();
        apellmat_Esp = new javax.swing.JTextField();
        profesion_Esp = new javax.swing.JTextField();
        cedula_esp = new javax.swing.JTextField();
        telefono_Esp = new javax.swing.JTextField();
        nom_Esp = new javax.swing.JTextField();
        cbx_status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        RT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Registro Especialistas");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Apellido Materno");

        jLabel5.setText("Profesion");

        jLabel6.setText("Cédula");

        jLabel7.setText("Especialidad");

        jLabel8.setText("Teléfono");

        jLabel9.setText("Correo Electrónico");

        btn_resgistrar.setText("Registrar");
        btn_resgistrar.setNextFocusableComponent(btn_limpiar);
        btn_resgistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resgistrarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.setNextFocusableComponent(nom_Esp);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.setNextFocusableComponent(btn_salir);
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        Especialidad_Esp.setNextFocusableComponent(telefono_Esp);
        Especialidad_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Especialidad_EspActionPerformed(evt);
            }
        });

        correo_Esp.setNextFocusableComponent(cbx_status);
        correo_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_EspActionPerformed(evt);
            }
        });

        apellpate_Esp.setNextFocusableComponent(apellmat_Esp);
        apellpate_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellpate_EspActionPerformed(evt);
            }
        });

        apellmat_Esp.setNextFocusableComponent(profesion_Esp);
        apellmat_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellmat_EspActionPerformed(evt);
            }
        });

        profesion_Esp.setNextFocusableComponent(cedula_esp);
        profesion_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesion_EspActionPerformed(evt);
            }
        });

        cedula_esp.setNextFocusableComponent(Especialidad_Esp);
        cedula_esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_espActionPerformed(evt);
            }
        });

        telefono_Esp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telefono_Esp.setNextFocusableComponent(correo_Esp);
        telefono_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_EspActionPerformed(evt);
            }
        });

        nom_Esp.setNextFocusableComponent(apellpate_Esp);
        nom_Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_EspActionPerformed(evt);
            }
        });

        cbx_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Activo", "Inactivo" }));
        cbx_status.setNextFocusableComponent(btn_resgistrar);
        cbx_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_statusActionPerformed(evt);
            }
        });

        jLabel10.setText("Status");

        RT.setText("Registro de Terapia");
        RT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profesion_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especialidad_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellpate_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellmat_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correo_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(RT)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_resgistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(telefono_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(correo_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(131, 131, 131))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nom_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellpate_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellmat_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(profesion_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cedula_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Especialidad_Esp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_resgistrar)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_salir))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botón de la interfaz que hace el evento de registro al sistema junto con
     * la validación
     * @param evt Evento que registra el especialista
     * @since jPilzintli 1.0.0
     */
    private void btn_resgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resgistrarActionPerformed
        //Instancia de las validaciones(la clase)
        FuncionesSQLEspecialista validaionesCampos = new FuncionesSQLEspecialista();

        if (!telefono_Esp.getText().equalsIgnoreCase("") && !apellpate_Esp.getText().equalsIgnoreCase("")
                && !apellmat_Esp.getText().equalsIgnoreCase("") && !profesion_Esp.getText().equalsIgnoreCase("")
                && !cedula_esp.getText().equalsIgnoreCase("") && !Especialidad_Esp.getText().equalsIgnoreCase("")
                && !nom_Esp.getText().equalsIgnoreCase("") && !correo_Esp.getText().equalsIgnoreCase("")
                && cbx_status.getSelectedItem() != "Seleccionar") {

            //validacion de los campos (letras numeros)
            if (validaionesCampos.valida_letras(nom_Esp.getText()) == true) {
                if (validaionesCampos.valida_letras(apellpate_Esp.getText()) == true) {
                    if (validaionesCampos.valida_letras(apellmat_Esp.getText()) == true) {
                        if (validaionesCampos.valida_letras(profesion_Esp.getText()) == true) {
                            if (validaionesCampos.valida_correo(correo_Esp.getText()) == true) {
                                if (validaionesCampos.valida_Telefono(telefono_Esp.getText()) == true) {
                                    if (validaionesCampos.valida_Cedula(cedula_esp.getText()) == true) {
                                        if (validaionesCampos.valida_letras(Especialidad_Esp.getText()) == true) {
                                            //seteos de los campos para el registro de los datos 
                                            especialista.setNombre(telefono_Esp.getText());
                                            especialista.setApellidoPaterno(apellpate_Esp.getText());
                                            especialista.setApellidoMaterno(apellmat_Esp.getText());
                                            especialista.setProfesion(profesion_Esp.getText());
                                            especialista.setCedula(cedula_esp.getText());
                                            especialista.setEspecialidad(Especialidad_Esp.getText());
                                            especialista.setTelefono(nom_Esp.getText());
                                            especialista.setCorreo(correo_Esp.getText());

                                            //ifs para ver la seleccion del status(combobox)
                                            if (cbx_status.getSelectedItem() == "Activo") {
                                                especialista.setStatus(1);

                                            }

                                            if (cbx_status.getSelectedItem() == "Inactivo") {
                                                especialista.setStatus(0);
                                            }

                                            //Manda llamar el método y registra el especialista
                                            RegistrarEspecialistA(especialista);

                                        } else {
                                            //Mensaje de error por datos erroneos
                                            JOptionPane.showMessageDialog(null, "Especialidad inválida",
                                                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    } else {
                                        //Mensaje de error por datos erroneos
                                        JOptionPane.showMessageDialog(null, "Cédula inválida,en caso de que la cedula contenga 7 numeros, coloque un cer al inicio de la cédula",
                                                "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    //Mensaje de error por datos erroneos
                                    JOptionPane.showMessageDialog(null, "Teléfono inválido",
                                            "Informacion", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else {
                                //Mensaje de error por datos erroneos
                                JOptionPane.showMessageDialog(null, "Correo electrónico inválido",
                                        "Informacion", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            //Mensaje de error por datos erroneos
                            JOptionPane.showMessageDialog(null, "Profesión inválida",
                                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        //Mensaje de error por datos erroneos
                        JOptionPane.showMessageDialog(null, "Apellido materno inválido",
                                "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    //Mensaje de error por datos erroneos
                    JOptionPane.showMessageDialog(null, "Apellido paterno inválido",
                            "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                //Mensaje de error por datos erroneos
                JOptionPane.showMessageDialog(null, "Nombre inválido",
                        "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            //Mensaje de que llene todos los campos
            JOptionPane.showMessageDialog(null, "Llene todos los campos incluyendo el status",
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_resgistrarActionPerformed
/**
 * Botón para salir de la interfáz
 * @param evt Evento para salir del sistema
 * @since jPilzintli 1.0.0
 */
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

    private void cbx_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_statusActionPerformed

    }//GEN-LAST:event_cbx_statusActionPerformed
/**
 * Botón para limpiar los campos de texto de la interfáz
 * @param evt Evento para la ejecución del evento
 * @since jPilzintli 1.0.0
 */
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

        //Limpia(remueve) los items del combo
        cbx_status.removeAllItems();

        //Agrega las estatus para seleccionarlo(para que en automatico te de la opcion "seleccionar")
        cbx_status.addItem("Seleccionar");
        cbx_status.addItem("Activado");
        cbx_status.addItem("Inactivo");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void RTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTActionPerformed
        // boten que llamara la ventana para dar de alta una terapia;
    }//GEN-LAST:event_RTActionPerformed

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
    private javax.swing.JButton RT;
    private javax.swing.JTextField apellmat_Esp;
    private javax.swing.JTextField apellpate_Esp;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_resgistrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cbx_status;
    private javax.swing.JTextField cedula_esp;
    private javax.swing.JTextField correo_Esp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom_Esp;
    private javax.swing.JTextField profesion_Esp;
    private javax.swing.JTextField telefono_Esp;
    // End of variables declaration//GEN-END:variables
}
