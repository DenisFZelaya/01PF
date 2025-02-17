/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.contabilidad;
import Controlador.factura;
import Controlador.producto;
import static Vista.CONTABILIDAD.contenedor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;

/**
 *
 * @author admin
 */
public class FACTURA extends javax.swing.JFrame {
    DefaultTableModel modelo;
    ImagenFondo ejemplo =  new ImagenFondo();
    Login01 ventana=new Login01();
    int contador = 0;
    double precio;
    

    public void suma()
    {
        int contar=factura.getRowCount();
        double suma=0;
        for(int i=0; i<contar; i++)
        {
            suma = suma+Integer.parseInt(factura.getValueAt(i, 5).toString());
        }
        double isv=suma*0.15;
        double total = isv+suma;
        txtsubtotal.setText(String.valueOf(suma));
        txtisv.setText(String.valueOf(isv));
        txttotal.setText(String.valueOf(total));
    }
    
    // Creacion de ArrayList
        
    public FACTURA() {
        
        this.setContentPane(ejemplo);
        initComponents();
        setLocationRelativeTo(null);
        modelo=new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Categoría");
        modelo.addColumn("Precio");
        this.factura.setModel(modelo);
        aux.setVisible(false);
        lblnombre.setText(ventana.user);
        


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        factura = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtisv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtcerrar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        txtdes1 = new javax.swing.JTextField();
        txtcate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        aux = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 594));
        setResizable(false);
        setSize(new java.awt.Dimension(1091, 692));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 215, 48));
        jLabel2.setText("FACTURA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("ID Producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        txtdes.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtdes.setEnabled(false);
        txtdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesActionPerformed(evt);
            }
        });
        txtdes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdesKeyTyped(evt);
            }
        });
        getContentPane().add(txtdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 130, 25));

        factura.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(factura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 630, 220));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Subtotal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        txtsubtotal.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtsubtotal.setEnabled(false);
        getContentPane().add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 71, 25));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("ISV");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        txtisv.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtisv.setEnabled(false);
        getContentPane().add(txtisv, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 130, 25));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("TOTAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, -1, -1));

        txttotal.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txttotal.setEnabled(false);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 71, 25));

        btnbuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(0, 51, 102));
        btnbuscar.setText("Buscar");
        btnbuscar.setPreferredSize(new java.awt.Dimension(99, 33));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 27));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 30));

        txtcerrar1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtcerrar1.setForeground(new java.awt.Color(0, 51, 102));
        txtcerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconcerrarsesionSMALL.png"))); // NOI18N
        txtcerrar1.setLabel("Cerrar Sesión");
        txtcerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcerrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtcerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        btnagregar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(0, 51, 102));
        btnagregar.setText("AGREGAR");
        btnagregar.setPreferredSize(new java.awt.Dimension(99, 33));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 110, 27));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Descripcion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 110, -1));

        txtPrecio.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtPrecio.setEnabled(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 60, 25));

        txtId.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 71, 25));

        txtNombreP.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtNombreP.setEnabled(false);
        txtNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 130, 25));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Precio unidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cajero:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Usuario");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        lblnombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 50));

        txtdes1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtdes1.setEnabled(false);
        txtdes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdes1ActionPerformed(evt);
            }
        });
        txtdes1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdes1KeyTyped(evt);
            }
        });
        getContentPane().add(txtdes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 130, 25));

        txtcate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtcate.setEnabled(false);
        txtcate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcateActionPerformed(evt);
            }
        });
        txtcate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcateKeyTyped(evt);
            }
        });
        getContentPane().add(txtcate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 130, 25));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("Categoría:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 110, -1));

        txtstock.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtstock.setEnabled(false);
        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });
        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstockKeyTyped(evt);
            }
        });
        getContentPane().add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 130, 25));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("En stock:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 70, -1));

        btntotal.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        btntotal.setForeground(new java.awt.Color(0, 51, 102));
        btntotal.setText("CALCULAR TOTAL");
        btntotal.setPreferredSize(new java.awt.Dimension(99, 33));
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });
        getContentPane().add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 170, 27));

        aux.setEnabled(false);
        aux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxActionPerformed(evt);
            }
        });
        getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String ID = txtId.getText().trim();
        producto p;
        
        for (int i= 0; i < REGISTRARPRODUCTO.contenedor.size(); i++){
            p=(producto)REGISTRARPRODUCTO.contenedor.get(i);
            if (ID.equalsIgnoreCase(p.getSidproducto())){
                txtNombreP.setText(p.getNombreProducto());
                txtPrecio.setText(p.getSprecio());
                txtdes.setText(p.getDescripcion());
                txtstock.setText(p.getSstock());
                txtcate.setText(p.getSCategoria());
            }
        }
        if(txtdes.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Producto no encontrado"); 
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MENUCAJERO frm = new MENUCAJERO();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcerrar1ActionPerformed
        Login01 frm = new Login01();
        frm.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcerrar1ActionPerformed

    private void txtdesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdesKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Por favor ingresar solo números");
        }
    }//GEN-LAST:event_txtdesKeyTyped
    
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        double subtotal=0;
        int error=0;
        
        aux.setText(String.valueOf(txtPrecio.getText()));
        
        
        try{
        if(txtNombreP.getText().equals("") || txtdes.getText().equals("") ||txtPrecio.getText().equals("")||txtId.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Asegurese de llenar todos los campos"); 
        }else{
            String[]info = new String[5];
        
        info[0] = txtId.getText();
        info[1] = txtNombreP.getText();
        info[2] = txtdes.getText();
        info[3] = txtcate.getText();
        info[4] = txtPrecio.getText();
        
        modelo.addRow(info);
       
        this.precio= this.precio+Double.parseDouble(aux.getText());
        txtstock.setText("");
        txtdes.setText("");
        txtNombreP.setText("");
        txtId.setText("");  
        txtcate.setText("");
        txtPrecio.setText("");
        }
        }catch(Exception e){
        error=1;
        JOptionPane.showMessageDialog(null,"Por favor revise los campos");
        txtId.setText("");
    }
       
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
      char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Por favor ingresar solo números");
        }
        
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePKeyTyped

    private void txtdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesActionPerformed

    private void txtdes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdes1ActionPerformed

    private void txtdes1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdes1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdes1KeyTyped

    private void txtcateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcateActionPerformed

    private void txtcateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcateKeyTyped

    private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockActionPerformed

    private void txtstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockKeyTyped

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
       DecimalFormat df=new DecimalFormat("#.00");
       factura f = new factura();        
       
       double isv = precio*0.15;
       double total = precio+isv;
       f.gettotal(precio, isv);
       
      txtisv.setText(String.valueOf(df.format(isv))); 
      txtsubtotal.setText(String.valueOf(precio));
      txttotal.setText(String.valueOf(f.gettotal(precio, isv)));
      txtstock.setText("");
      txtdes.setText("");
      txtNombreP.setText("");
      txtId.setText("");  
      txtcate.setText("");
      txtPrecio.setText("");
    }//GEN-LAST:event_btntotalActionPerformed

    private void auxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auxActionPerformed
    
     public void CargaInterfaz()
	{
            String datos[][] = {};
            String columna [] = {"ID","STOCK","NOMBRE","CATEGORIA","DESCRIPCION", "PRECIO"}; 
            modelo = new DefaultTableModel(datos,columna);
            factura.setModel(modelo);   
   	} 
    
            	public void CargarDatos()
	{
       		producto p;// INSTANCIA DE LA CLASE QUE CREAMOS
        
       		for (int i = 0; i < REGISTRARPRODUCTO.contenedor.size(); i++){
            	p = (producto)REGISTRARPRODUCTO.contenedor.get(i);
            	modelo.insertRow(contador, new Object []{});
           	modelo.setValueAt(p.getSidproducto(), contador, 0); 
            	modelo.setValueAt(p.getSstock() , contador, 1);
            	modelo.setValueAt(p.getSnombreProd() , contador, 2);
                modelo.setValueAt(p.getSCategoria() , contador, 3);
                modelo.setValueAt(p.getSdescripProd() , contador, 4);
                modelo.setValueAt(p.getSprecio() , contador, 5);
               
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FACTURA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aux;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btntotal;
    private javax.swing.JTable factura;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtcate;
    private javax.swing.JButton txtcerrar1;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtdes1;
    private javax.swing.JTextField txtisv;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}

class ImagenFondo extends JPanel
{
    private Image imagen;
    public void paint (Graphics g)
    {
        imagen = new ImageIcon(getClass().getResource("/IMG/CAJERO.jpeg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}