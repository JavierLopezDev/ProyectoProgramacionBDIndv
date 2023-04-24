/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javierlopezproyectobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class VentanaProyectoBD extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/liga";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "toor";
    DefaultTableModel dtmClasificaion = null;

    public int getIdEquipo() {
        int id = obtenerIdEquipo(txf_nombreEquip.getText());
        return id;
    }

    /**
     * Creates new form VentanaProyectoBD
     */
    public VentanaProyectoBD() {
        initComponents();
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException ex) {
            Logger.getLogger(VentanaProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        visualizarClasificacion();
        btn_jugadores.setEnabled(false);
        btn_editarEquipo.setEnabled(false);
        btn_eliminarEquipo.setEnabled(false);
        btn_consultaEquipo.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Clasificacion = new javax.swing.JTable();
        lbl_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_nombreEquip = new javax.swing.JTextField();
        txf_puntos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txf_estadio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_ciudad = new javax.swing.JTextField();
        btn_jugadores = new javax.swing.JButton();
        btn_consultaEquipo = new javax.swing.JButton();
        btn_addEquipo = new javax.swing.JButton();
        btn_editarEquipo = new javax.swing.JButton();
        btn_eliminarEquipo = new javax.swing.JButton();
        btn_sync = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));

        tbl_Clasificacion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tbl_Clasificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tbl_Clasificacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_Clasificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_Clasificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ClasificacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Clasificacion);

        lbl_titulo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lbl_titulo.setText("LIGA ESPAÑOLA TEMPORADA 15/16");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("CLASIFICACIÓN:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("PUNTOS:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("ESTADIO:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("CIUDAD:");

        btn_jugadores.setText("JUGADORES");
        btn_jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jugadoresActionPerformed(evt);
            }
        });

        btn_consultaEquipo.setText("CONSULTAR EQUIPO");
        btn_consultaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaEquipoActionPerformed(evt);
            }
        });

        btn_addEquipo.setText("AÑADIR EQUIPO");
        btn_addEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addEquipoActionPerformed(evt);
            }
        });

        btn_editarEquipo.setText("EDITAR EQUIPO");
        btn_editarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarEquipoActionPerformed(evt);
            }
        });

        btn_eliminarEquipo.setText("ELIMINAR EQUIPO");
        btn_eliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarEquipoActionPerformed(evt);
            }
        });

        btn_sync.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javierlopezproyectobd/sync_blue.png"))); // NOI18N
        btn_sync.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_syncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_consultaEquipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_estadio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_nombreEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_editarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sync, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbl_titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txf_nombreEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txf_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txf_estadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_jugadores)
                            .addComponent(btn_consultaEquipo))
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarEquipo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sync)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminarEquipo)
                    .addComponent(btn_addEquipo))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_ClasificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ClasificacionMouseClicked
        // TODO add your handling code here:
        int i = tbl_Clasificacion.getSelectedRow();
        txf_nombreEquip.setText("");
        txf_puntos.setText("");
        txf_estadio.setText("");
        txf_ciudad.setText("");
        btn_jugadores.setEnabled(false);
        btn_editarEquipo.setEnabled(false);
        btn_eliminarEquipo.setEnabled(true);
        btn_consultaEquipo.setEnabled(true);
    }//GEN-LAST:event_tbl_ClasificacionMouseClicked

    private void btn_jugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jugadoresActionPerformed
        // TODO add your handling code here:
        Jugadores mostrarJugadores = new Jugadores(this, true);
        mostrarJugadores.setVisible(true);
    }//GEN-LAST:event_btn_jugadoresActionPerformed

    private void btn_consultaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaEquipoActionPerformed
        // TODO add your handling code here:
        int i = tbl_Clasificacion.getSelectedRow(), id;
        String estadio;
        //dtmEstadio.removeRow(0);        
        txf_nombreEquip.setText("" + dtmClasificaion.getValueAt(i, 0));
        txf_puntos.setText("" + dtmClasificaion.getValueAt(i, 1));
        id = obtenerIdEquipo(txf_nombreEquip.getText());
        estadio = obtenerEstadio(id);
        String[] datosEstadio = estadio.split(",");
        txf_estadio.setText("" + estadio);
        txf_estadio.setText("" + datosEstadio[0]);
        txf_ciudad.setText("" + datosEstadio[1]);
        btn_jugadores.setEnabled(true);
        btn_editarEquipo.setEnabled(true);        
    }//GEN-LAST:event_btn_consultaEquipoActionPerformed

    private void btn_addEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addEquipoActionPerformed
        // TODO add your handling code here:
        AnadirEquipo addEquipo = new AnadirEquipo(this, true);
        addEquipo.setVisible(true);
    }//GEN-LAST:event_btn_addEquipoActionPerformed

    private void btn_editarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarEquipoActionPerformed
        // TODO add your handling code here:
        EditarEquipo editEquipo = new EditarEquipo(this, true);
        editEquipo.setVisible(true);
    }//GEN-LAST:event_btn_editarEquipoActionPerformed

    private void btn_eliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarEquipoActionPerformed
        // TODO add your handling code here:
        int i = tbl_Clasificacion.getSelectedRow();
        int idEstadio = obtenerIdEstadio(obtenerIdEquipo((String) dtmClasificaion.getValueAt(i, 0)));        
        eliminarEquipo();
        eliminarEstadio(idEstadio);
    }//GEN-LAST:event_btn_eliminarEquipoActionPerformed

    private void btn_syncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_syncActionPerformed
        // TODO add your handling code here:
        visualizarClasificacion();
        txf_nombreEquip.setText("");
        txf_puntos.setText("");
        txf_estadio.setText("");
        txf_ciudad.setText("");
        btn_jugadores.setEnabled(false);
        btn_editarEquipo.setEnabled(false);
    }//GEN-LAST:event_btn_syncActionPerformed

    public static Connection hazConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return conexion;
    }

    public void visualizarClasificacion() {
        Statement s = null;
        ResultSet rs = null;
        Connection co = null;

        dtmClasificaion = new DefaultTableModel();
        //dtmClasificaion.addColumn("Id");
        dtmClasificaion.addColumn("Equipo");
        dtmClasificaion.addColumn("Puntos");

        //Asignamos el modelo a la vista tabla
        tbl_Clasificacion.setModel(dtmClasificaion);
        co = hazConexion();

        try {
            s = co.createStatement();
            rs = s.executeQuery("select nombre, puntuacion from equipo order by puntuacion desc");
            while (rs.next()) {
                Object[] fila = new Object[3];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                //fila[2] = rs.getObject(3);
                dtmClasificaion.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int obtenerIdEquipo(String equipo) {
        Statement s = null;
        ResultSet rs = null;
        Connection co = null;
        co = hazConexion();
        Object id = null;

        try {
            s = co.createStatement();
            rs = s.executeQuery("select idEquipo from equipo where nombre = " + '"' + equipo + '"');
            while (rs.next()) {
                id = rs.getObject(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (int) id;
    }

    public String obtenerEstadio(int id) {
        Statement s = null;
        ResultSet rs = null;
        Connection co = null;
        co = hazConexion();
        Object estadio = null;

        try {
            s = co.createStatement();
            rs = s.executeQuery("select estadio.nombre, ciudad from estadio,equipo where equipo.idEstad = estadio.idEstadio and idEquipo = " + id);
            while (rs.next()) {
                estadio = rs.getObject(1);
                estadio = estadio + "," + rs.getObject(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (String) estadio;
    }

    public void eliminarEstadio(int idEstadio) {
        int res = 0;
        PreparedStatement ps = null;
        Connection conex = hazConexion();

        try {
            ps = conex.prepareStatement("DELETE FROM estadio WHERE idEstadio=?");
            ps.setInt(1, idEstadio);

            res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Estadio eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR. No se eliminó ningun estadio");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int obtenerIdEstadio(int idEquipo) {
        Statement s = null;
        ResultSet rs = null;
        Connection co = null;
        co = hazConexion();
        Object id = null;

        try {
            s = co.createStatement();
            rs = s.executeQuery("select idEstadio from estadio, equipo where equipo.idEstad = estadio.idEstadio and idEquipo =" + idEquipo);
            while (rs.next()) {
                id = rs.getObject(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (int) id;
    }

    public void eliminarEquipo() {
        int res = 0;
        int i = tbl_Clasificacion.getSelectedRow();
        String nombre = (String) dtmClasificaion.getValueAt(i, 0);
        PreparedStatement ps = null;
        Connection conex = hazConexion();

        try {
            ps = conex.prepareStatement("DELETE FROM equipo WHERE nombre=?");
            ps.setString(1, nombre);

            res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Equipo eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR. No se eliminó ningun equipo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNombreEquipo() {
        return txf_nombreEquip.getText();
    }

    public int getPuntos() {
        return Integer.parseInt(txf_puntos.getText());
    }

    public String getEstadio() {
        return txf_estadio.getText();
    }

    public String getCiudad() {
        return txf_ciudad.getText();
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProyectoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProyectoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProyectoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProyectoBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProyectoBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addEquipo;
    private javax.swing.JButton btn_consultaEquipo;
    private javax.swing.JButton btn_editarEquipo;
    private javax.swing.JButton btn_eliminarEquipo;
    private javax.swing.JButton btn_jugadores;
    private javax.swing.JButton btn_sync;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tbl_Clasificacion;
    private javax.swing.JTextField txf_ciudad;
    private javax.swing.JTextField txf_estadio;
    private javax.swing.JTextField txf_nombreEquip;
    private javax.swing.JTextField txf_puntos;
    // End of variables declaration//GEN-END:variables
}
