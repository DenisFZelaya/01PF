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
public class MENUADMIN extends javax.swing.JFrame {
    ImagenFondo ejemplo =  new ImagenFondo();
    /**
     * Creates new form MENUADMIN
     */
    public MENUADMIN() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnconta = new javax.swing.JButton();
        txtcerrar = new javax.swing.JButton();
        btnprod = new javax.swing.JButton();
        btncajero = new javax.swing.JButton();
        btnadmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 594));
        setSize(new java.awt.Dimension(960, 594));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡BIENVENIDO ADMINISTRADOR!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/adminic.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 150, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/producto.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 150, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconocajero.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 150, 150));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/conta.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 150, 150));

        btnconta.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnconta.setForeground(new java.awt.Color(0, 51, 102));
        btnconta.setText("Contabilidad");
        btnconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontaActionPerformed(evt);
            }
        });
        getContentPane().add(btnconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 150, -1));

        txtcerrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtcerrar.setForeground(new java.awt.Color(0, 51, 102));
        txtcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconcerrarsesionSMALL.png"))); // NOI18N
        txtcerrar.setLabel("Cerrar Sesión");
        txtcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcerrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, -1));

        btnprod.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnprod.setForeground(new java.awt.Color(0, 51, 102));
        btnprod.setText("Productos");
        btnprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprodActionPerformed(evt);
            }
        });
        getContentPane().add(btnprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 150, -1));

        btncajero.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btncajero.setForeground(new java.awt.Color(0, 51, 102));
        btncajero.setText("Cajeros");
        btncajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajeroActionPerformed(evt);
            }
        });
        getContentPane().add(btncajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 150, -1));

        btnadmin.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnadmin.setForeground(new java.awt.Color(0, 51, 102));
        btnadmin.setText("Administradores");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        getContentPane().add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontaActionPerformed
        CONTABILIDAD frm = new CONTABILIDAD();
        frm.setVisible(true);
        this.setVisible(false);
        frm.CargaInterfaz();
        frm.CargarDatos(); 
    }//GEN-LAST:event_btncontaActionPerformed

    private void txtcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcerrarActionPerformed
        Login01 frm = new Login01();
        frm.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcerrarActionPerformed

    private void btnprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprodActionPerformed
       REGISTRARPRODUCTO frm = new REGISTRARPRODUCTO();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnprodActionPerformed

    private void btncajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajeroActionPerformed
       REGISTRARCAJEROS frm = new REGISTRARCAJEROS();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btncajeroActionPerformed

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        REGISTRARADMINISTRADOR RA = new REGISTRARADMINISTRADOR();
        RA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnadminActionPerformed

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
            java.util.logging.Logger.getLogger(MENUADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btncajero;
    private javax.swing.JButton btnconta;
    private javax.swing.JButton btnprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
