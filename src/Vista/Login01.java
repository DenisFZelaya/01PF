package Vista;


import Controlador.administrador;
import Controlador.cajero;
import javax.swing.JOptionPane;


public class Login01 extends javax.swing.JFrame {

     MENUADMIN MA = new MENUADMIN();  
     MENUCAJERO MC = new MENUCAJERO();      
     
     //VARIABLE PARA ACCEDER AL NOMBRE DE USUARIO DEL REGISTRO
     public String GLOBALUSER;
 
    public Login01() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtseleccion = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        lblContraseña2 = new javax.swing.JLabel();
        lblfondo1 = new javax.swing.JLabel();
        lblContraseña1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(720, 405));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtseleccion.setForeground(new java.awt.Color(255, 255, 255));
        txtseleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Administrador" }));
        getContentPane().add(txtseleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 266, 170, 40));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 100, 40));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 110, 40));

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 70, -1));

        lblContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContraseña.setText("Tipo:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 174, 150, 30));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 222, 130, 30));

        lblContraseña2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContraseña2.setText("Contraseña:");
        getContentPane().add(lblContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        lblfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/IMGLogin.jpg"))); // NOI18N
        lblfondo1.setLabelFor(lblfondo1);
        lblfondo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblfondo1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        lblfondo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblfondo1.setIconTextGap(6);
        lblfondo1.setRequestFocusEnabled(false);
        getContentPane().add(lblfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 405));

        lblContraseña1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContraseña1.setText("Contraseña:");
        getContentPane().add(lblContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        
        if (txtUsuario.getText().equals("") || (txtContra.getText().equals("") ) ){
            JOptionPane.showMessageDialog(null, "Verifique los datos ingresados.");
            
            txtContra.setText("");
            txtUsuario.setText("");
        }

        switch (txtseleccion.getSelectedIndex()){
            case 0://cajero
                    buscarCajero();
                break;
                
            case 1:
                    buscarAdmin();
                break;
        
        }
       
    }//GEN-LAST:event_btnIngresarActionPerformed
   
    public void buscarAdmin(){
           
        
    String user = "GRUPO";
    String contra = "GRUPO";
    
              if (txtUsuario.getText().equals(user) && txtContra.getText().equals(contra))
          {
           MA.setVisible(true);
           this.dispose();
          } else {

              }
    
          administrador p;
          for (int i = 0; i < REGISTRARADMINISTRADOR.contenedor.size(); i++){
          p = (administrador)REGISTRARADMINISTRADOR.contenedor.get(i);
          
          if (txtUsuario.getText().equals(p.getUsuario()) && txtContra.getText().equals(p.getContraseña()))
          {
           MA.setVisible(true);
           this.dispose();
          } else {
              JOptionPane.showMessageDialog(null, "Administrador no encontrado");
          }
          }//FOR
    }
    
    
    public void buscarCajero(){
              
        
    String user = "C";
    String contra = "C";
    
              if (txtUsuario.getText().equals(user) && txtContra.getText().equals(contra))
          {
           MC.setVisible(true);
           this.dispose();
           
          } else {
              
              }
    
          cajero c;
          for (int i = 0; i < REGISTRARCAJEROS.contenedor.size(); i++){
          c = (cajero)REGISTRARCAJEROS.contenedor.get(i);
          
          if (txtUsuario.getText().equals(c.getUsuario()) && txtContra.getText().equals(c.getContraseña()))
          {
           MC.setVisible(true);
           this.dispose();
          } else {
          JOptionPane.showMessageDialog(null, "Cajero no encontrado");
          }

          }//FOR

    }
    
    public String getPublicUser(){
        String NU = this.GLOBALUSER;
        
        return NU;
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
            java.util.logging.Logger.getLogger(Login01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblContraseña2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblfondo1;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JComboBox<String> txtseleccion;
    // End of variables declaration//GEN-END:variables
}
