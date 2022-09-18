package Paciente;

import ConexionDB.DbConnection;
import Especialista.DatosEspecialista;
import Menu.Principal;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ModificarTutor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ModificarTutor() throws IOException {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        BufferedImage imagenIcono = ImageIO.read(getClass().getResource("/Recursos/logo_bcklss.png"));
        this.setTitle("Modificaciones Tutor");
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

        campo_nombre.setEditable(false);
        campo_direccion.setEditable(false);
        campo_cp.setEditable(false);
        campo_municipio.setEditable(false);
        campo_estado.setEditable(false);
        campo_status.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campo_ap_paterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_ap_materno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campo_cp = new javax.swing.JTextField();
        campo_municipio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo_estado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_saveRes = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        campo_id = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        campo_status = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Modificar Padre o Tutor");

        jLabel1.setText("Nombre(s):");

        campo_nombre.setNextFocusableComponent(campo_ap_paterno);
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido Paterno:");

        campo_ap_paterno.setNextFocusableComponent(campo_ap_materno);

        jLabel3.setText("Apellido Materno:");

        campo_ap_materno.setNextFocusableComponent(campo_direccion);

        jLabel4.setText("Direccion:");

        campo_direccion.setNextFocusableComponent(campo_cp);

        jLabel5.setText("Código Postal:");

        campo_cp.setNextFocusableComponent(campo_municipio);

        campo_municipio.setNextFocusableComponent(campo_estado);

        jLabel6.setText("Municipio:");

        campo_estado.setNextFocusableComponent(btn_saveRes);

        jLabel7.setText("Estado:");

        btn_saveRes.setText("Guardar");
        btn_saveRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveResActionPerformed(evt);
            }
        });

        btn_back.setText("Regresar");
        btn_back.setNextFocusableComponent(campo_nombre);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel8.setText("ID:");

        campo_id.setNextFocusableComponent(campo_ap_paterno);
        campo_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_idActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.setNextFocusableComponent(campo_nombre);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        campo_status.setNextFocusableComponent(btn_saveRes);

        jLabel10.setText("Situación:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(campo_ap_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(campo_ap_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(campo_status, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(campo_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_saveRes)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_ap_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_ap_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saveRes)
                    .addComponent(btn_back)
                    .addComponent(btn_buscar))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveResActionPerformed
        DatosTutorDAO tutor = new DatosTutorDAO();
        DatosPadreoTutor data = new DatosPadreoTutor();

        data.setNombretutor(campo_nombre.getText());
        data.setApellidopaterno(campo_ap_paterno.getText());
        data.setApellidomaterno(campo_ap_materno.getText());
        data.setDireccion(campo_direccion.getText());
        data.setCodigopostal(campo_cp.getText());
        data.setMunicipio(campo_municipio.getText());
        data.setEstado(campo_estado.getText());
        data.setStatus(1);
        data.setIdtutor(Integer.parseInt(campo_id.getText()));

        tutor.ModificarDatosTutor(data);
        
        campo_ap_materno.setText("");
        campo_ap_paterno.setText("");
        campo_cp.setText("");
        campo_direccion.setText("");
        campo_estado.setText("");
        campo_id.setText("");
        campo_municipio.setText("");
        campo_nombre.setText("");
        campo_status.setText("");
        

    }//GEN-LAST:event_btn_saveResActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {

            try {
                new Menu.Principal().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ModificarTutor.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void campo_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_idActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        DbConnection conexion;
        Statement estatuto;
        String solicitudSQL;
        ResultSet resultado;

        try {
            conexion = new DbConnection();
            estatuto = conexion.getConnection().createStatement();

            solicitudSQL = "SELECT id, nombre, apellido_paterno, apellido_materno, direccion, cp, municipio, estado, status FROM "
                    + "padre where apellido_paterno like '" + campo_ap_paterno.getText() + "' and apellido_materno like '" + campo_ap_materno.getText() + "' and id like " + campo_id.getText();

            System.out.println(solicitudSQL);

            resultado = estatuto.executeQuery(solicitudSQL);

            while (resultado.next()) {

                campo_id.setText(String.valueOf(resultado.getInt("id")));
                campo_nombre.setText(resultado.getString("nombre"));
                campo_ap_paterno.setText(resultado.getString("apellido_paterno"));
                campo_ap_materno.setText(resultado.getString("apellido_materno"));
                campo_direccion.setText(resultado.getString("direccion"));
                campo_cp.setText(resultado.getString("cp"));
                campo_municipio.setText(resultado.getString("municipio"));
                campo_estado.setText(resultado.getString("estado"));
                if (resultado.getInt("status") == 1) {
                    campo_status.setText("Activo");
                } else if (resultado.getInt("status") == 0) {
                    campo_status.setText("Inactivo");
                }

            }

            campo_nombre.setEditable(true);
            campo_direccion.setEditable(true);
            campo_cp.setEditable(true);
            campo_municipio.setEditable(true);
            campo_estado.setEditable(true);

            estatuto.close();
            conexion.desconectar();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se Encontraron Datos!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
                    new ModificarTutor().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ModificarTutor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_saveRes;
    private javax.swing.JTextField campo_ap_materno;
    private javax.swing.JTextField campo_ap_paterno;
    private javax.swing.JTextField campo_cp;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_estado;
    private javax.swing.JTextField campo_id;
    private javax.swing.JTextField campo_municipio;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_status;
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
    // End of variables declaration//GEN-END:variables
}
