/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Fechas;
import Controlador.usuario;
import Controlador.cajero;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laptop
 */
public class REGISTRARCAJEROS extends javax.swing.JFrame {
         private DefaultTableModel modelo;
         int contador = 0;

// Creacion de ArrayList
     public static LinkedList contenedor = new LinkedList();
        
     //Variables para los parametros
        int p5=0, p6=0;
        String p1 ,p2, p3, p4,p7;
        String turno;
       

    /**
     * Creates new form REGISTRARPRODUCTO
     */
    public REGISTRARCAJEROS() {
        initComponents();
        CargaInterfaz();
        CargarDatos();
        setLocationRelativeTo(null);
        
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

        fONDOADMIN1 = new Modelo.FONDOADMIN();
        ContenedorMenu = new javax.swing.JLayeredPane();
        btnRegresar = new javax.swing.JButton();
        ContenedorBarraSuperior = new javax.swing.JLayeredPane();
        lblCerrarSesion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora2 = new javax.swing.JLabel();
        ContenedorMesadeTrabajo = new javax.swing.JLayeredPane();
        ContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistrarCajeros = new javax.swing.JTable();
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
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        cbTurno = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        lblRegistrarProducto = new javax.swing.JLabel();
        ContenedorBarraSuperior1 = new javax.swing.JLayeredPane();
        lblHora1 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fONDOADMIN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegresar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

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
                .addContainerGap(587, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        fONDOADMIN1.add(ContenedorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 700));

        ContenedorBarraSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconcerrarsesionSMALL.png"))); // NOI18N
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha:");

        lblHora2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHora2.setForeground(new java.awt.Color(255, 255, 255));
        lblHora2.setText("Hora:");

        ContenedorBarraSuperior.setLayer(lblCerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorBarraSuperior.setLayer(lblFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ContenedorBarraSuperior.setLayer(lblHora2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorBarraSuperiorLayout = new javax.swing.GroupLayout(ContenedorBarraSuperior);
        ContenedorBarraSuperior.setLayout(ContenedorBarraSuperiorLayout);
        ContenedorBarraSuperiorLayout.setHorizontalGroup(
            ContenedorBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBarraSuperiorLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(lblHora2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        ContenedorBarraSuperiorLayout.setVerticalGroup(
            ContenedorBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrarSesion)
                    .addComponent(lblFecha)
                    .addComponent(lblHora2))
                .addGap(19, 19, 19))
        );

        fONDOADMIN1.add(ContenedorBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 760, 50));

        ContenedorMesadeTrabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ContenedorTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ContenedorTabla.setOpaque(false);

        tbRegistrarCajeros.setBackground(new java.awt.Color(153, 255, 153));
        tbRegistrarCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cajero.", "Nombre Cajero", "Cedula", "Usuario", "Contraseña", "Salario", "Turno"
            }
        ));
        tbRegistrarCajeros.setRowHeight(25);
        tbRegistrarCajeros.setSelectionBackground(new java.awt.Color(102, 255, 153));
        jScrollPane1.setViewportView(tbRegistrarCajeros);

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
        lblTurno.setText("Turno:");

        lblSalario.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(0, 51, 102));
        lblSalario.setText("Salario: ");

        txtSalario.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtSalario.setSelectionColor(new java.awt.Color(102, 255, 102));

        cbTurno.setBackground(new java.awt.Color(153, 255, 153));
        cbTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbTurno.setForeground(new java.awt.Color(0, 51, 102));
        cbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Noche" }));
        cbTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTurnoActionPerformed(evt);
            }
        });

        txtContraseña.setPreferredSize(new java.awt.Dimension(6, 30));

        jLayeredPane1.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTurno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtSalario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbTurno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblUsuario)
                    .addComponent(lblContraseña)
                    .addComponent(lblCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblTurno)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula))
                        .addGap(18, 18, 18)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña))
                .addContainerGap())
        );

        javax.swing.GroupLayout ContenedorTablaLayout = new javax.swing.GroupLayout(ContenedorTabla);
        ContenedorTabla.setLayout(ContenedorTablaLayout);
        ContenedorTablaLayout.setHorizontalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTablaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        ContenedorTablaLayout.setVerticalGroup(
            ContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        lblRegistrarProducto.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblRegistrarProducto.setForeground(new java.awt.Color(251, 215, 48));
        lblRegistrarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarProducto.setText("REGISTRAR CAJEROS");

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
                .addContainerGap()
                .addComponent(lblRegistrarProducto)
                .addGap(18, 18, 18)
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

        fONDOADMIN1.add(ContenedorBarraSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 750, 30));

        getContentPane().add(fONDOADMIN1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
     JOptionPane.showConfirmDialog(null,"Desea regresar al inicio de sesion?", "Registrar un producto", JOptionPane.YES_NO_OPTION);   // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       
        int error = 0;
       Fecha();
       
       Turno();
       
       //Igualar variables a los componentes necesarios de la ventana
       try{
           if(txtNombre.getText().equals("") || txtUsuario.getText().equals("") || txtContraseña.getText().equals("") || txtSalario.getText().equals(""))
        {
        JOptionPane.showMessageDialog(null,"Asegurese de llenar todos los campos");
        }else{
       p1= txtNombre.getText();//nombre
       p2= txtCedula.getText();//usuario
       p3= txtUsuario.getText();//contrase;a 
       p4= txtContraseña.getText();//identidad
       p5= Integer.valueOf(txtSalario.getText());//salario 
       //p6++;//idcajero
       p7= turno;//turno
       
       
       cajero c;
       p6 = (contenedor.size() + 1);

 
        cajero cajero = new cajero(p1,p2,p3,p4,p5,p6,p7);
        contenedor.add(cajero);

        //mostrar();
        CargaInterfaz();
        CargarDatos(); 
        txtNombre.setText("");
        txtCedula.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtSalario.setText("");

        
        }
        }catch(Exception e){
        error=1;
        JOptionPane.showMessageDialog(null,"Por favor revise los campos");
        
    }
      
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTurnoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MENUADMIN frm = new MENUADMIN();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    public void Turno(){
                switch (cbTurno.getSelectedIndex()){
            case 0:
                this.turno = "Mañana";
                break;
            case 1:
                this.turno = "Tarde";
                break; 
            case 2:
                this.turno = "Noche";
                break;
           }
    }
    
       	public void CargaInterfaz()
	{
            String datos[][] = {};
            String columna [] = {"Id Cajero ","Nombre","Contraseña","Cedula","Usuario", "Salario","Turno"}; 
            modelo = new DefaultTableModel(datos,columna);
            tbRegistrarCajeros.setModel(modelo);   
   	} 
    
            	public void CargarDatos()
	{
       		cajero c; // INSTANCIA DE LA CLASE QUE CREAMOS
        
       		for (int i = 0; i < REGISTRARCAJEROS.contenedor.size(); i++){
            	c = (cajero)REGISTRARCAJEROS.contenedor.get(i);
            	modelo.insertRow(contador, new Object []{});
           	modelo.setValueAt(c.getIdCajero(), contador, 0); 
            	modelo.setValueAt(c.getNombre(), contador, 1);
            	modelo.setValueAt(c.getIdentidad(), contador, 2);
                modelo.setValueAt(c.getUsuario(), contador, 3);
                modelo.setValueAt(c.getContraseña(), contador, 4);
                modelo.setValueAt(c.getSalario(), contador, 5);
                modelo.setValueAt(c.getTurno(), contador,6);
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
            java.util.logging.Logger.getLogger(REGISTRARCAJEROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRARCAJEROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRARCAJEROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRARCAJEROS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRARCAJEROS().setVisible(true);
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
    private javax.swing.JComboBox<String> cbTurno;
    private Modelo.FONDOADMIN fONDOADMIN1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblHora2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistrarProducto;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tbRegistrarCajeros;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
