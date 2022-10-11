package Menu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import ConexionDB.DbConnection;
import static Menu.Principal.login;
import static Menu.Principal.password;
import static Menu.Principal.url;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.InputStream;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class HistorialPaciente extends javax.swing.JFrame {

    BufferedImage imagenIcono = ImageIO.read(getClass().getResource("/Recursos/logo_bcklss.png"));
    Connection conexion;

    public HistorialPaciente() throws IOException {
        initComponents();
        this.setIconImage(imagenIcono);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Historial Paciente");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                dispose();

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
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbx_paciente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Historial por Paciente");

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un Paciente para generar su Historial");

        cbx_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String query;
        String idPaciente = "";
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

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, password);

            query = "SELECT paciente.nombre, paciente.apellido_paterno, paciente.apellido_materno, consulta.fecha, consulta.hora, consulta.observaciones, consulta.paciente_id FROM consulta INNER JOIN paciente ON consulta.paciente_id = paciente.id WHERE consulta.paciente_id = " + idPaciente;
                    InputStream archivoJRXML = Principal.class
                    .getResourceAsStream("paciente.jrxml");
            JasperDesign diario = JRXmlLoader.load(archivoJRXML);
            JRDesignQuery updateDiario = new JRDesignQuery();
            updateDiario.setText(query);

            diario.setQuery(updateDiario);

            JasperReport jreport = JasperCompileManager.compileReport(diario);

            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, conexion);

            JasperViewer.viewReport(jprint, false);

        } catch (JRException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Principal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbx_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_pacienteActionPerformed

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
                    new HistorialPaciente().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(HistorialPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_paciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
