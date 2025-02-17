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
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class REGISTRARPRODUCTO extends javax.swing.JFrame {
    
     private DefaultTableModel modelo;
     Login01 ventana=new Login01();
    int contador = 0;
    // Creacion de ArrayList
    public static LinkedList contenedor = new LinkedList();
     //ArrayList<producto> lista = new ArrayList<producto>();
        
     //Variables para los parametros
        int p1 = 0, p3 = 0;
        String p2, p4, p5;
        double p6;
        String cate;
       
    public REGISTRARPRODUCTO() {
        initComponents();
        setLocationRelativeTo(null);
        lblnombre.setText(ventana.user);
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
        lblnombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcerrar1 = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        fONDOADMIN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Administrador:");

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

        btnregresar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(0, 51, 102));
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        ContenedorMenu.setLayer(lblnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorMenu.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorMenu.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorMenu.setLayer(txtcerrar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorMenu.setLayer(btnregresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorMenuLayout = new javax.swing.GroupLayout(ContenedorMenu);
        ContenedorMenu.setLayout(ContenedorMenuLayout);
        ContenedorMenuLayout.setHorizontalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMenuLayout.createSequentialGroup()
                .addGroup(ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorMenuLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtcerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenedorMenuLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8))))
                    .addGroup(ContenedorMenuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnregresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenedorMenuLayout.setVerticalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorMenuLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorMenuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenedorMenuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        fONDOADMIN1.add(ContenedorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 700));

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

        lblFecha.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha:");

        ContenedorBarraSuperior.setLayer(lblCerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorBarraSuperior.setLayer(lblFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorBarraSuperiorLayout = new javax.swing.GroupLayout(ContenedorBarraSuperior);
        ContenedorBarraSuperior.setLayout(ContenedorBarraSuperiorLayout);
        ContenedorBarraSuperiorLayout.setHorizontalGroup(
            ContenedorBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        fONDOADMIN1.add(ContenedorBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 0, 910, 50));

        ContenedorTabla.setOpaque(false);

        tbRegistrarProductos.setForeground(new java.awt.Color(0, 51, 102));
        tbRegistrarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Stock", "Descripción", "Categoria", "Nombre del Producto", "Precio"
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
        cbCategoria.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
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
        lblCantidad.setText("Stock:");

        txtCantidad.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        txtPrecios.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtPrecios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreciosKeyTyped(evt);
            }
        });

        lblPrecios.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblPrecios.setForeground(new java.awt.Color(0, 51, 102));
        lblPrecios.setText("Precio:");

        txtDesc.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

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
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblNombreProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblPrecios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblNombreProducto))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescripcion))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(lblPrecios)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorTablaLayout = new javax.swing.GroupLayout(ContenedorTabla);
        ContenedorTabla.setLayout(ContenedorTablaLayout);
        ContenedorTablaLayout.setHorizontalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addGroup(ContenedorTablaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContenedorTablaLayout.setVerticalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblRegistrarProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        lblRegistrarProducto.setForeground(new java.awt.Color(251, 215, 48));
        lblRegistrarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarProducto.setText("REGISTRAR PRODUCTOS");

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
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        fONDOADMIN1.add(ContenedorMesadeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 52, 830, 580));

        getContentPane().add(fONDOADMIN1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked

       JOptionPane.showConfirmDialog(null,"Desea regresar al inicio de sesion?", "Registrar un producto", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_lblCerrarSesionMouseClicked


    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Llamar a Categoria
        CargaInterfaz();
        CargarDatos();  
        
        Fecha();
        
        Categoria(); 
        
        try{
        if(txtNombre.getText().equals("") || txtCantidad.getText().equals("") ||txtDesc.getText().equals("")||txtPrecios.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Asegurese de llenar todos los campos"); 
        }else{
        p1 = (contenedor.size() + 1);
        p2 = txtNombre.getText();
        p3 = Integer.valueOf(txtCantidad.getText());
        p4 = txtDesc.getText();
        p5 = cate;
        p6 = Double.parseDouble(txtPrecios.getText());
        
        producto producto = new producto(p1,p2,p3,p4,p5,p6);
        contenedor.add(producto);

        //mostrar();
        CargaInterfaz();
        CargarDatos();  
        
        txtCantidad.setText("");
        txtDesc.setText("");
        txtNombre.setText("");
        txtPrecios.setText("");    
        
        }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Por favor revise los campos");
        txtNombre.setText("");
        txtPrecios.setText("");
        txtCantidad.setText("");
        txtDesc.setText("");
    }
        
        //Igualar variables a los componentes necesarios de la ventana
       
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
          char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Por favor ingresar solo números");
        }
        
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPreciosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreciosKeyTyped
  char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Por favor ingresar solo números");
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_txtPreciosKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtcerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcerrar1ActionPerformed
        Login01 frm = new Login01();
        frm.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcerrar1ActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        MENUADMIN frm = new MENUADMIN();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed
    
    
    public void Categoria(){
                switch (cbCategoria.getSelectedIndex()){
            case 0:
                this.cate = "Refrescos";
                break;
            case 1:
                this.cate = "Lacteos";
                break; 
            case 2:
                this.cate = "Embutidos";
                break;
            case 3:
                this.cate = "Consome";
                break; 
             case 4:
                this.cate = "Crema de cacahuate";
                break;
            case 5:
                this.cate = "Alimento para bebe";
                break; 
            case 6:
                this.cate = "Cereales";
                break;
            case 7:
                this.cate = "Especias";
                break;                
             case 8:
                this.cate = "Harinas";
                break;
            case 9:
                this.cate = "Salsas";
                break; 
            case 10:
                this.cate = "Sazonadores";
                break;
            case 11:
                this.cate = "Pastas";
                break;            
             case 12:
                this.cate = "Enlatadas";
                break;
            case 13:
                this.cate = "Confiteria";
                break; 
            case 14:
                this.cate = "Frutas y verduras";
                break;
            case 15:
                this.cate = "Bebidas";
                break;                
             case 16:
                this.cate = "Carnes";
                break;
            case 17:
                this.cate = "Medicamentos";
                break; 
            case 18:
                this.cate = "Higuiene";
                break;
           }
    
                
    } 
    
    
    	public void CargaInterfaz()
	{
            String datos[][] = {};
            String columna [] = {"ID","NOMBRE","STOCK","CATEGORIA","DESCRIPCION", "PRECIO"}; 
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
            	modelo.setValueAt(p.getSnombreProd() , contador, 1);
                modelo.setValueAt(p.getSstock() , contador, 2);
                modelo.setValueAt(p.getSCategoria() , contador, 3);
                modelo.setValueAt(p.getSdescripProd() , contador, 4);
                modelo.setValueAt(p.getSprecio() , contador, 5);
        }
    
    }
    /*
    public void mostrar(){
    
    String matris[][] = new String[lista.size()][6];
    
     for (int i=0; i < lista.size(); i++){
     matris[i][0] = lista.get(i).getSidproducto();
     matris[i][1] = lista.get(i).getSstock();
     matris[i][2] = lista.get(i).getSnombreProd();
     matris[i][3] = lista.get(i).getSdescripProd();
     matris[i][4] = lista.get(i).getSCategoria();
     matris[i][5] = lista.get(i).getSprecio();
       
    }
              
    tbRegistrarProductos.setModel(new javax.swing.table.DefaultTableModel(
    matris,
    new String [] {
    "Id", "Cantidad", "Nombre del Producto", "Descripcion", "Categoria", "Precio"
    }
    ));
    
    
    }
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
            java.util.logging.Logger.getLogger(REGISTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRARPRODUCTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRARPRODUCTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ContenedorBarraSuperior;
    private javax.swing.JLayeredPane ContenedorMenu;
    private javax.swing.JLayeredPane ContenedorMesadeTrabajo;
    private javax.swing.JPanel ContenedorTabla;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cbCategoria;
    private Modelo.FONDOADMIN fONDOADMIN1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecios;
    private javax.swing.JLabel lblRegistrarProducto;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTable tbRegistrarProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecios;
    private javax.swing.JButton txtcerrar1;
    // End of variables declaration//GEN-END:variables

    private String toString(int HoraActual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
