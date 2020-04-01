/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class MENUCAJERO extends javax.swing.JFrame {
ImagenFondo ejemplo =  new ImagenFondo();
    /**
     * Creates new form MENUCAJERO
     */
    public MENUCAJERO() {
        this.setContentPane(ejemplo);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnfactura = new javax.swing.JButton();
        btnclientes = new javax.swing.JButton();
        txtcerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡BIENVENIDO CAJERO!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/IconFacturasMenuCajero.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 320, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/IconClientesMenuCajero.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 320, 300));

        btnfactura.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnfactura.setForeground(new java.awt.Color(0, 51, 102));
        btnfactura.setText("Facturación");
        btnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 160, 60));

        btnclientes.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnclientes.setForeground(new java.awt.Color(0, 51, 102));
        btnclientes.setText("Clientes");
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 160, 60));

        txtcerrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtcerrar.setForeground(new java.awt.Color(0, 51, 102));
        txtcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconcerrarsesionSMALL.png"))); // NOI18N
        txtcerrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txtcerrar.setLabel("Cerrar Sesión");
        txtcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcerrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcerrarActionPerformed
        Login01 frm = new Login01();
        frm.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcerrarActionPerformed

    private void btnclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientesActionPerformed
         REGISTRARCLIENTES frm = new REGISTRARCLIENTES();
        frm.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_btnclientesActionPerformed

    private void btnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturaActionPerformed
        FACTURA frm = new FACTURA();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnfacturaActionPerformed

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
            java.util.logging.Logger.getLogger(MENUCAJERO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUCAJERO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUCAJERO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUCAJERO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUCAJERO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclientes;
    private javax.swing.JButton btnfactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton txtcerrar;
    // End of variables declaration//GEN-END:variables
class ImagenFondo extends JPanel
{
    private Image imagen;
    public void paint (Graphics g)
    {
        imagen = new ImageIcon(getClass().getResource("/IMG/MENU.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
}
