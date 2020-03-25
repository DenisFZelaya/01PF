
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 */
public class JFrameCajeroBuscar extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCajeroBuscar
     */
    public JFrameCajeroBuscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Crear icono autoajustable y asignarlo a un label
        ImageIcon imagen = new ImageIcon( "src\\IMG\\iconcerrarsesion.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblcerrar.getWidth(),lblcerrar.getHeight(),Image.SCALE_DEFAULT));
        lblcerrar.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCajeroBuscar1 = new JPanelCajeroBuscar();
        lblcerrar = new javax.swing.JLabel();
        btnVerFacturas = new javax.swing.JButton();
        lbltipocajero = new javax.swing.JLabel();
        lblCajero1 = new javax.swing.JLabel();
        btnRegresar1 = new javax.swing.JButton();
        btnNuevaVenta1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnNuevaVenta2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setResizable(false);
        setState(6);

        lblcerrar.setText("LBLLOGIN");

        btnVerFacturas.setText("Ver Facturas");

        lbltipocajero.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lbltipocajero.setForeground(new java.awt.Color(0, 0, 0));
        lbltipocajero.setText("DENIS ZELAYA");

        lblCajero1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCajero1.setForeground(new java.awt.Color(0, 0, 0));
        lblCajero1.setText("DENIS ZELAYA");

        btnRegresar1.setText("Regresar");

        btnNuevaVenta1.setText("Nueva Venta");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar Clientes", "Registrar Clientes", "Buscar Clientes", "Eliminar Clientes" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Nombre del Cliente", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        lblIdCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblIdCliente.setText("Id del Cliente:");

        btnNuevaVenta2.setText("Buscar");

        javax.swing.GroupLayout jPanelCajeroBuscar1Layout = new javax.swing.GroupLayout(jPanelCajeroBuscar1);
        jPanelCajeroBuscar1.setLayout(jPanelCajeroBuscar1Layout);
        jPanelCajeroBuscar1Layout.setHorizontalGroup(
            jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbltipocajero))
                    .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(btnNuevaVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCajeroBuscar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCajeroBuscar1Layout.createSequentialGroup()
                        .addComponent(lblIdCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevaVenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addComponent(lblcerrar, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(lblCajero1)
                    .addContainerGap(707, Short.MAX_VALUE)))
            .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(718, Short.MAX_VALUE)))
        );
        jPanelCajeroBuscar1Layout.setVerticalGroup(
            jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(lbltipocajero, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevaVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnVerFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCajeroBuscar1Layout.createSequentialGroup()
                .addComponent(lblcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaVenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIdCliente)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCajeroBuscar1Layout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(lblCajero1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
            .addGroup(jPanelCajeroBuscar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCajeroBuscar1Layout.createSequentialGroup()
                    .addContainerGap(504, Short.MAX_VALUE)
                    .addComponent(btnRegresar1)
                    .addGap(32, 32, 32)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCajeroBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCajeroBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCajeroBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCajeroBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCajeroBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCajeroBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCajeroBuscar().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaVenta1;
    private javax.swing.JButton btnNuevaVenta2;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton btnVerFacturas;
    private javax.swing.JComboBox<String> jComboBox1;
    private JPanelCajeroBuscar jPanelCajeroBuscar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCajero1;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JLabel lbltipocajero;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}
