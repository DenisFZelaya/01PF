/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Fechas;
import Controlador.producto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MOSTRARPRODUCTO extends javax.swing.JFrame {
    // Creacion de ArrayList

    private DefaultTableModel modelo;
    int contador = 0;
    
//    REGISTRARPRODUCTO PROD = new REGISTRARPRODUCTO();   
    
    public MOSTRARPRODUCTO() {
        initComponents();
        setLocationRelativeTo(null);

        CargaInterfaz();
        CargarDatos();  
        
        //Para obtener la hora actual
        Fechas hora = new Fechas();
        
        lblFecha.setText("Fecha: " + hora.fechaActual());
       
    }
    
    public void Fecha(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();        
        lblFecha.setText(String.valueOf(date));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fONDOADMIN1 = new Modelo.FONDOADMIN();
        ContenedorMenu = new javax.swing.JLayeredPane();
        btnRegresar = new javax.swing.JButton();
        ContenedorBarraSuperior = new javax.swing.JLayeredPane();
        lblCerrarSesion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        ContenedorMesadeTrabajo = new javax.swing.JLayeredPane();
        ContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistrarProductos = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblNombreProducto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecios = new javax.swing.JTextField();
        lblPrecios = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblRegistrarProducto = new javax.swing.JLabel();
        ContenedorBarraSuperior1 = new javax.swing.JLayeredPane();
        lblHora1 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fONDOADMIN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegresar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 51, 102));
        btnRegresar.setText("Regresar");

        ContenedorMenu.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorMenuLayout = new javax.swing.GroupLayout(ContenedorMenu);
        ContenedorMenu.setLayout(ContenedorMenuLayout);
        ContenedorMenuLayout.setHorizontalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        ContenedorMenuLayout.setVerticalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorMenuLayout.createSequentialGroup()
                .addContainerGap(594, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        fONDOADMIN1.add(ContenedorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 700));

        ContenedorBarraSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconcerrarsesionSMALL.png"))); // NOI18N
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha:");

        ContenedorBarraSuperior.setLayer(lblCerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorBarraSuperior.setLayer(lblFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorBarraSuperiorLayout = new javax.swing.GroupLayout(ContenedorBarraSuperior);
        ContenedorBarraSuperior.setLayout(ContenedorBarraSuperiorLayout);
        ContenedorBarraSuperiorLayout.setHorizontalGroup(
            ContenedorBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBarraSuperiorLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        ContenedorBarraSuperiorLayout.setVerticalGroup(
            ContenedorBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrarSesion)
                    .addComponent(lblFecha))
                .addGap(19, 19, 19))
        );

        fONDOADMIN1.add(ContenedorBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 0, 760, 50));

        ContenedorMesadeTrabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ContenedorTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ContenedorTabla.setOpaque(false);

        tbRegistrarProductos.setBackground(new java.awt.Color(255, 255, 255));
        tbRegistrarProductos.setForeground(new java.awt.Color(0, 51, 102));
        tbRegistrarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cantidad", "Descripción", "Categoria", "Nombre del Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbRegistrarProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tbRegistrarProductos.setRowHeight(25);
        tbRegistrarProductos.setSelectionBackground(new java.awt.Color(0, 51, 102));
        tbRegistrarProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbRegistrarProductos);

        lblNombreProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblNombreProducto.setText("Nombre del Producto:");

        lblDescripcion.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 51, 102));
        lblDescripcion.setText("Descripción:");

        lblCategoria.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 51, 102));
        lblCategoria.setText("Categoria:");

        cbCategoria.setBackground(new java.awt.Color(153, 255, 153));
        cbCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbCategoria.setForeground(new java.awt.Color(0, 51, 102));
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Refrescos", "Lacteos", "Embutidos", "Consome", "Crema de cacahuate", "Alimento para bebe", "Cereales", "Especias", "Harinas", "Salsas", "Sazonadores", "Pastas", "Enlatadas", "Confiteria", "Frutas y verduras", "Bebidas", "Carnes", "Medicamentos", "Higuiene" }));
        cbCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbCategoria.setFocusCycleRoot(true);
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 51, 102));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 51, 102));
        lblCantidad.setText("Cantidad:");

        txtCantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 51, 102));

        txtPrecios.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtPrecios.setForeground(new java.awt.Color(0, 51, 102));

        lblPrecios.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblPrecios.setForeground(new java.awt.Color(0, 51, 102));
        lblPrecios.setText("Precio:");

        txtDesc.setForeground(new java.awt.Color(0, 51, 102));

        txtNombre.setForeground(new java.awt.Color(0, 51, 102));

        jLayeredPane1.setLayer(lblNombreProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblDescripcion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtPrecios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPrecios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDesc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidad)
                        .addGap(6, 6, 6)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblNombreProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(lblNombreProducto))
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCategoria)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCantidad)
                        .addComponent(lblPrecios))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ContenedorTablaLayout = new javax.swing.GroupLayout(ContenedorTabla);
        ContenedorTabla.setLayout(ContenedorTablaLayout);
        ContenedorTablaLayout.setHorizontalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        ContenedorTablaLayout.setVerticalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblRegistrarProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        lblRegistrarProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblRegistrarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarProducto.setText("MOSTRAR PRODUCTOS");

        ContenedorMesadeTrabajo.setLayer(ContenedorTabla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorMesadeTrabajo.setLayer(lblRegistrarProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorMesadeTrabajoLayout = new javax.swing.GroupLayout(ContenedorMesadeTrabajo);
        ContenedorMesadeTrabajo.setLayout(ContenedorMesadeTrabajoLayout);
        ContenedorMesadeTrabajoLayout.setHorizontalGroup(
            ContenedorMesadeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMesadeTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorMesadeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContenedorMesadeTrabajoLayout.createSequentialGroup()
                        .addComponent(ContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContenedorMesadeTrabajoLayout.setVerticalGroup(
            ContenedorMesadeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMesadeTrabajoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRegistrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fONDOADMIN1.add(ContenedorMesadeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 52, -1, 580));

        ContenedorBarraSuperior1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHora1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHora1.setForeground(new java.awt.Color(255, 255, 255));
        lblHora1.setText("Hora:");

        lblFecha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha1.setText("Fecha:");

        ContenedorBarraSuperior1.setLayer(lblHora1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorBarraSuperior1.setLayer(lblFecha1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorBarraSuperior1Layout = new javax.swing.GroupLayout(ContenedorBarraSuperior1);
        ContenedorBarraSuperior1.setLayout(ContenedorBarraSuperior1Layout);
        ContenedorBarraSuperior1Layout.setHorizontalGroup(
            ContenedorBarraSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBarraSuperior1Layout.createSequentialGroup()
                .addContainerGap(527, Short.MAX_VALUE)
                .addComponent(lblFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(lblHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        ContenedorBarraSuperior1Layout.setVerticalGroup(
            ContenedorBarraSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorBarraSuperior1Layout.createSequentialGroup()
                .addGroup(ContenedorBarraSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora1)
                    .addComponent(lblFecha1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        fONDOADMIN1.add(ContenedorBarraSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 750, 30));

        getContentPane().add(fONDOADMIN1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked

       JOptionPane.showConfirmDialog(null,"Desea regresar al inicio de sesion?", "Registrar un producto", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Llamar a Categoria

        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed
    
      	public void CargaInterfaz()
	{
            String datos[][] = {};
            String columna [] = {"ID","CANTIDAD","NOMBRE","CATEGORIA","DESCRIPCION", "PRECIO"}; 
            modelo = new DefaultTableModel(datos,columna);
            tbRegistrarProductos.setModel(modelo);   
   	} 
    
            	public void CargarDatos()
	{
       		producto p; // INSTANCIA DE LA CLASE QUE CREAMOS
        
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
            java.util.logging.Logger.getLogger(MOSTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MOSTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MOSTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MOSTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MOSTRARPRODUCTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ContenedorBarraSuperior;
    private javax.swing.JLayeredPane ContenedorBarraSuperior1;
    private javax.swing.JLayeredPane ContenedorMenu;
    private javax.swing.JLayeredPane ContenedorMesadeTrabajo;
    private javax.swing.JPanel ContenedorTabla;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbCategoria;
    private Modelo.FONDOADMIN fONDOADMIN1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecios;
    private javax.swing.JLabel lblRegistrarProducto;
    private javax.swing.JTable tbRegistrarProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecios;
    // End of variables declaration//GEN-END:variables

    private String toString(int HoraActual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
