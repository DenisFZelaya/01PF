/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Fechas;
import Controlador.contabilidad;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CONTABILIDAD extends javax.swing.JFrame {
    ImagenFondo ejemplo =  new ImagenFondo();
    private DefaultTableModel modelo;
    Login01 ventana=new Login01();
    int contador = 0;
    
    // Creacion de ArrayList
    public static LinkedList contenedor = new LinkedList();
     //ArrayList<producto> lista = new ArrayList<producto>();
        
     //Variables para los parametros
        int p1=0, p4 = 0, p5=0, p6=0;
        String p2="", p3="";
        String cate;
        String año;
public void validar()
    {
         if(txting.getText().equals("") || txtegre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Asegurese de llenar todos los campos"); 
        }
    }
     
  
    /**
     * Creates new form CONTABILIDAD
     */
    public CONTABILIDAD() {
        this.setContentPane(ejemplo);
        initComponents();
        setLocationRelativeTo(null);
        lblnombre.setText(ventana.user);

        
        
        //Para obtener la hora actual
        Fechas hora = new Fechas();
        
        lblFecha.setText("Fecha: " + hora.fechaActual());
       
    }
    
    public void Fecha(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();        
        lblFecha.setText(String.valueOf(date));
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        conta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbmes = new javax.swing.JComboBox<>();
        cbaño = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txting = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtegre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        txtcerrar1 = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        txtutil = new javax.swing.JTextField();
        uti = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblnombre3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        conta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(conta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 790, 340));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 215, 48));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTABILIDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 790, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Mes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, 20));

        cbmes.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cbmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmesActionPerformed(evt);
            }
        });
        getContentPane().add(cbmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, 30));

        cbaño.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cbaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        cbaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbañoActionPerformed(evt);
            }
        });
        getContentPane().add(cbaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Año");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Ingresos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 20));

        txting.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingActionPerformed(evt);
            }
        });
        txting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingKeyTyped(evt);
            }
        });
        getContentPane().add(txting, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 66, 30));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Egresos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, 20));

        txtegre.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtegreActionPerformed(evt);
            }
        });
        txtegre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtegreKeyTyped(evt);
            }
        });
        getContentPane().add(txtegre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 66, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Utilidades");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, 20));

        btnguardar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(0, 51, 102));
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, 30));

        btnregresar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(0, 51, 102));
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, 30));

        txtcerrar1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtcerrar1.setForeground(new java.awt.Color(0, 51, 102));
        txtcerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconcerrarsesionSMALL.png"))); // NOI18N
        txtcerrar1.setText("Cerrar Sesión");
        txtcerrar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txtcerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcerrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtcerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 150, 40));

        lblFecha.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 160, 30));

        txtutil.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtutil.setEnabled(false);
        txtutil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtutilActionPerformed(evt);
            }
        });
        getContentPane().add(txtutil, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 70, 30));

        uti.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        uti.setForeground(new java.awt.Color(0, 51, 102));
        uti.setText("Calcular Utilidad");
        uti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utiActionPerformed(evt);
            }
        });
        getContentPane().add(uti, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, 40));

        lblnombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 50));

        lblnombre3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        getContentPane().add(lblnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 50));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Administrador:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmesActionPerformed

    private void cbañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbañoActionPerformed
    
    }//GEN-LAST:event_cbañoActionPerformed

    private void txtingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingActionPerformed

    private void txtegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtegreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtegreActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        mes();
        año();
        int error=0;
       
        
        try{
        if(txting.getText().equals("") || txtegre.getText().equals("") ||txtutil.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Asegurese de llenar todos los campos"); 
        }else{
        p1 = (contenedor.size() + 1);
        p2 = cate;
        p3 = año;
        p4 = Integer.valueOf(txting.getText());
        p5 = Integer.valueOf(txtegre.getText());
        p6 = Integer.valueOf(txtutil.getText());
        
        
        contabilidad conta = new contabilidad(p1,p2,p3,p4,p5,p6);
        contenedor.add(conta);

        //mostrar();
        CargaInterfaz();
        CargarDatos();  
        
        txting.setText("");
        txtegre.setText("");
        txtutil.setText("");  
            
        }     
        
        }catch(Exception e){
        error=1;
        JOptionPane.showMessageDialog(null,"Por favor revise los campos");
        txting.setText("");
        txtegre.setText("");
        txtutil.setText("");
    }
      
        
        
        
        
       
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
    MENUADMIN frm = new MENUADMIN();
    frm.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void txtcerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcerrar1ActionPerformed
        Login01 frm = new Login01();
        frm.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcerrar1ActionPerformed

    private void txtutilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtutilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtutilActionPerformed

    private void txtingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Por favor ingresar solo números");
        }
    }//GEN-LAST:event_txtingKeyTyped

    private void txtegreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtegreKeyTyped
char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Por favor ingresar solo números");
        }
    }//GEN-LAST:event_txtegreKeyTyped

    private void utiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utiActionPerformed
        if(txting.getText().equals("") || txtegre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Asegurese de llenar todos los campos"); 
        }else{
        int ingr=Integer.parseInt(txting.getText());
        int egre=Integer.parseInt(txtegre.getText());
        int ganancia;
            if (ingr < egre)
            {
            JOptionPane.showMessageDialog(null,"Este mes no obtuvo ganancias, solo pérdidas");
            ganancia = ingr - egre;    
            txtutil.setText(String.valueOf(ganancia));
            }else{
            ganancia = ingr - egre;    
            txtutil.setText(String.valueOf(ganancia));    
            }   
        }
    }//GEN-LAST:event_utiActionPerformed
    
    public void mes(){
                switch (cbmes.getSelectedIndex()){
            case 0:
                this.cate = "Enero";
                break;
            case 1:
                this.cate = "Febrero";
                break; 
            case 2:
                this.cate = "Marzo";
                break;
            case 3:
                this.cate = "Abril";
                break; 
             case 4:
                this.cate = "Mayo";
                break;
            case 5:
                this.cate = "Junio";
                break; 
            case 6:
                this.cate = "Julio";
                break;
            case 7:
                this.cate = "Agosto";
                break;                
             case 8:
                this.cate = "Septiembre";
                break;
            case 9:
                this.cate = "Octubre";
                break; 
            case 10:
                this.cate = "Noviembre";
                break;
            case 11:
                this.cate = "Diciembre";
                break;            
                
    }   
    }
    
    public void año(){
                switch (cbaño.getSelectedIndex()){
            case 0:
                this.año = "2019";
                break;
            case 1:
                this.año = "2020";
                break; 
            case 2:
                this.año = "2021";
                break;
            case 3:
                this.año = "2022";
                break; 
             case 4:
                this.año = "2023";
                break;
            case 5:
                this.año = "2024";
                break; 
            case 6:
                this.año = "2025";
                break;
               
    }   
    }
                
    
  
    
    public void CargaInterfaz()
	{
            String datos[][] = {};
            String columna [] = {"ID","MES","AÑO","EGRESOS","INGRESOS","UTILIDAD"}; 
            modelo = new DefaultTableModel(datos,columna);
            conta.setModel(modelo);   
   	} 
    
            	public void CargarDatos()
	{
       		contabilidad c = new contabilidad(); // INSTANCIA DE LA CLASE QUE CREAMOS
        
       		for (int i = 0; i < CONTABILIDAD.contenedor.size(); i++){
            	c = (contabilidad)CONTABILIDAD.contenedor.get(i);
            	modelo.insertRow(contador, new Object []{});
                modelo.setValueAt(c.getidMes(), contador, 0);
           	modelo.setValueAt(c.getMes(), contador, 1);
                modelo.setValueAt(c.getAño(), contador, 2);
            	modelo.setValueAt(c.getIngreso() , contador, 3);
            	modelo.setValueAt(c.getInversion() , contador, 4);
                modelo.setValueAt(c.getGanancia() , contador, 5);
               
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
            java.util.logging.Logger.getLogger(CONTABILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONTABILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONTABILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONTABILIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONTABILIDAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cbaño;
    private javax.swing.JComboBox<String> cbmes;
    private javax.swing.JTable conta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JButton txtcerrar1;
    private javax.swing.JTextField txtegre;
    private javax.swing.JTextField txting;
    private javax.swing.JTextField txtutil;
    private javax.swing.JButton uti;
    // End of variables declaration//GEN-END:variables
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

             
                
    }



                    
               

