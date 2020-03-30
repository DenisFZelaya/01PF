/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.administrador;
import Controlador.producto;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laptop
 */
public class REGISTRARADMINISTRADOR extends javax.swing.JFrame {

     private DefaultTableModel modelo;
    int contador = 0;
    // Creacion de ArrayList
    public static LinkedList contenedor = new LinkedList();
    
    // VARIABLES GLOBALES DE LA CLASE ADMINISTRADOR
        String P1;
        String P2;
        String P3;
        String P4;
        int P5=0;
        int P6=0;
        String P7;
    
    public REGISTRARADMINISTRADOR() {
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

        fONDOADMIN1 = new Modelo.FONDOADMIN();
        ContenedorMenu = new javax.swing.JLayeredPane();
        btnRegresar = new javax.swing.JButton();
        ContenedorBarraSuperior = new javax.swing.JLayeredPane();
        lblCerrarSesion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        ContenedorMesadeTrabajo = new javax.swing.JLayeredPane();
        ContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistrarAdmin = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        cbSpec = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRegistrarProducto = new javax.swing.JLabel();
        ContenedorBarraSuperior1 = new javax.swing.JLayeredPane();
        lblHora1 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fONDOADMIN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegresar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnRegresar.setText("Regresar");

        ContenedorMenu.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorMenuLayout = new javax.swing.GroupLayout(ContenedorMenu);
        ContenedorMenu.setLayout(ContenedorMenuLayout);
        ContenedorMenuLayout.setHorizontalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );
        ContenedorMenuLayout.setVerticalGroup(
            ContenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorMenuLayout.createSequentialGroup()
                .addContainerGap(599, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        fONDOADMIN1.add(ContenedorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 700));

        ContenedorBarraSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconcerrarsesionSMALL.png"))); // NOI18N
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblCerrarSesion.setRequestFocusEnabled(false);
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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

        fONDOADMIN1.add(ContenedorBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 50));

        ContenedorMesadeTrabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ContenedorTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ContenedorTabla.setOpaque(false);

        tbRegistrarAdmin.setBackground(new java.awt.Color(153, 255, 153));
        tbRegistrarAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Completo", "Usuario", "Contraseña", "No. de Identidad", "Salario", "Codigo Empleado", "Especializacion"
            }
        ));
        tbRegistrarAdmin.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tbRegistrarAdmin.setEnabled(false);
        tbRegistrarAdmin.setRowHeight(25);
        tbRegistrarAdmin.setSelectionBackground(new java.awt.Color(102, 255, 153));
        jScrollPane1.setViewportView(tbRegistrarAdmin);

        jLayeredPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLayeredPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 51, 102));
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtNombre.setSelectionColor(new java.awt.Color(102, 255, 102));

        lblUsuario.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 51, 102));
        lblUsuario.setText("Usuario: ");

        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 51, 102));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtUsuario.setPreferredSize(new java.awt.Dimension(6, 30));

        lblContraseña.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 51, 102));
        lblContraseña.setText("Contraseña:");

        txtCedula.setPreferredSize(new java.awt.Dimension(6, 30));

        lblCedula.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 51, 102));
        lblCedula.setText("Identificacion: ");

        lblTurno.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 51, 102));
        lblTurno.setText("Especializacion:");

        txtCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtCodigo.setSelectionColor(new java.awt.Color(102, 255, 102));

        lblSalario.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(0, 51, 102));
        lblSalario.setText("Salario: ");

        txtSalario.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtSalario.setSelectionColor(new java.awt.Color(102, 255, 102));

        lblCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 51, 102));
        lblCodigo.setText("Codigo:");

        cbSpec.setBackground(new java.awt.Color(153, 255, 153));
        cbSpec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbSpec.setForeground(new java.awt.Color(0, 51, 102));
        cbSpec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador/Contador", "Programador" }));
        cbSpec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/201-user.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/201-check-1.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/201-delete.png"))); // NOI18N

        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTurno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbSpec, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblUsuario)
                    .addComponent(lblContraseña)
                    .addComponent(lblCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblTurno)
                        .addGap(18, 18, 18)
                        .addComponent(cbSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtCodigo)))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalario)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTurno)
                                    .addComponent(cbSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsuario))
                                .addGap(17, 17, 17)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblContraseña, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorTablaLayout = new javax.swing.GroupLayout(ContenedorTabla);
        ContenedorTabla.setLayout(ContenedorTablaLayout);
        ContenedorTablaLayout.setHorizontalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorTablaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        ContenedorTablaLayout.setVerticalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        lblRegistrarProducto.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblRegistrarProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblRegistrarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarProducto.setText("REGISTRAR ADMINISTRADOR");

        ContenedorMesadeTrabajo.setLayer(ContenedorTabla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorMesadeTrabajo.setLayer(lblRegistrarProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorMesadeTrabajoLayout = new javax.swing.GroupLayout(ContenedorMesadeTrabajo);
        ContenedorMesadeTrabajo.setLayout(ContenedorMesadeTrabajoLayout);
        ContenedorMesadeTrabajoLayout.setHorizontalGroup(
            ContenedorMesadeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMesadeTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ContenedorMesadeTrabajoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(ContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenedorMesadeTrabajoLayout.setVerticalGroup(
            ContenedorMesadeTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMesadeTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistrarProducto)
                .addGap(18, 18, 18)
                .addComponent(ContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fONDOADMIN1.add(ContenedorMesadeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 52, 890, 580));

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

        fONDOADMIN1.add(ContenedorBarraSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, 750, 30));

        getContentPane().add(fONDOADMIN1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null,"Desea regresar al inicio de sesion?", "Registrar un producto", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
            switch (this.cbSpec.getSelectedIndex())
            {
                case 0:
                    this.P7 = "Administrador/Contador";
                    break;
                
                    case 1:
                    this.P7 = "Programador";
                    break;
            }
        
        
        ValidarDatos();

 
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    
        public void ValidarDatos(){
            
            switch (this.cbSpec.getSelectedIndex())
            {
                case 0:
                    this.P7 = "Administrador/Contador";
                    break;
                
                    case 1:
                    this.P7 = "Programador";
                    break;
            }
            
        this.P1 = txtNombre.getText();
        this.P2 = txtUsuario.getText() ;
        this.P3 = txtContraseña.getText();
        this.P4 = txtCedula.getText();
        this.P5 = Integer.parseInt(txtSalario.getText());
        this.P6 = Integer.parseInt(txtCodigo.getText());
        
        if (P1.equals("")){ txtNombre.setBackground(Color.red); }
        if (P2.equals("")){ txtUsuario.setBackground(Color.red); }
        if (P3.equals("")){ txtContraseña.setBackground(Color.red); }
        if (P4.equals("")){ txtCedula.setBackground(Color.red); }
        if (txtSalario.getText().equals("")){ txtSalario.setBackground(Color.red); }
        if (txtCodigo.getText().equals("")){ txtCodigo.setBackground(Color.red); }
   
        
        if (P1.equals("") || P2.equals("") || P3.equals("") || P4.equals("") || txtSalario.getText().equals("")|| txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
        
        CargaInterfaz();
        CargarDatos();  
        
        }
        
 
    
    }
              public void CargaInterfaz()
	{
            String datos[][] = {};
            String columna [] = {"NOMBRE COMPLETO","USUARIO","CONTRASEÑA","IDENTIDAD","SALARIO", "CODIGO", "ESPECIALIZACION"}; 
            modelo = new DefaultTableModel(datos,columna);
            tbRegistrarAdmin.setModel(modelo);   
   	} 
    
                
            	public void CargarDatos()
	{
       		administrador a; // INSTANCIA DE LA CLASE QUE CREAMOS
        
       		for (int i = 0; i < REGISTRARADMINISTRADOR.contenedor.size(); i++){
            	a = (administrador)REGISTRARADMINISTRADOR.contenedor.get(i);
            	modelo.insertRow(contador, new Object []{});
           	modelo.setValueAt(a.getNombre(), contador, 0); 
            	modelo.setValueAt(a.getUsuario() , contador, 1);
            	modelo.setValueAt(a.getContraseña() , contador, 2);
                modelo.setValueAt(a.getIdentidad() , contador, 3);
                modelo.setValueAt(a.getSsalario() , contador, 4);
                modelo.setValueAt(a.getScodigo() , contador, 5);
                modelo.setValueAt(a.getespecializacion() , contador, 6);
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
            java.util.logging.Logger.getLogger(REGISTRARADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRARADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRARADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRARADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRARADMINISTRADOR().setVisible(true);
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
    private javax.swing.JComboBox<String> cbSpec;
    private Modelo.FONDOADMIN fONDOADMIN1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistrarProducto;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tbRegistrarAdmin;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
