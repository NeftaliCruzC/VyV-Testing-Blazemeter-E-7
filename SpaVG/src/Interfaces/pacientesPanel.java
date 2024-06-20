package Interfaces;

import Controlador.BD.Conexion;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

public class pacientesPanel extends javax.swing.JPanel {

    Conexion con = new Conexion();
    Connection cn;
    ClientesDAO clientesDAO;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public pacientesPanel() {
        initComponents();
        cn = con.getConnection(); // Cambio aquí para obtener la conexión de la instancia de Conexion
        clientesDAO = new ClientesDAO(cn);
        listar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        controlPeso = new javax.swing.JTabbedPane();
        Pacientes = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtEmba = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        seguimiento = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Datos2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        btnBuscarClient = new javax.swing.JButton();
        btnRegistarDatos = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtGrasa = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtCintura = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtCadera = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtEspalda = new javax.swing.JTextField();
        fechaSeguimiento = new com.toedter.calendar.JDateChooser();
        jLabel62 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        txtNombCita = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnRegistrarCita = new javax.swing.JButton();
        fechaCitas = new com.toedter.calendar.JDateChooser();
        Hora = new javax.swing.JLabel();
        horarioSpinner = new javax.swing.JSpinner();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCitas1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        fechaCitaCalendario1 = new rojeru_san.componentes.RSDateChooser();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(880, 540));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        controlPeso.setPreferredSize(new java.awt.Dimension(880, 540));

        Pacientes.setPreferredSize(new java.awt.Dimension(880, 540));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Edad", "Telefono", "Dirección", "Correo", "Embarazo"
            }
        ));
        Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Datos);

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setText("Actualizar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("Registrar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Nombre");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Edad");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Teléfono");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Dirección");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Correo");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtEmba.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        txtEmba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmbaActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Embarazo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtTelefono))
                        .addGap(27, 27, 27))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombre))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addGap(39, 39, 39)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmba, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmba, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Datos Generales", jPanel6);

        javax.swing.GroupLayout PacientesLayout = new javax.swing.GroupLayout(Pacientes);
        Pacientes.setLayout(PacientesLayout);
        PacientesLayout.setHorizontalGroup(
            PacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PacientesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PacientesLayout.createSequentialGroup()
                        .addGroup(PacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PacientesLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PacientesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(803, Short.MAX_VALUE))
                    .addGroup(PacientesLayout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 148, Short.MAX_VALUE))))
        );
        PacientesLayout.setVerticalGroup(
            PacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PacientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPeso.addTab("Pacientes", Pacientes);

        Datos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peso", "Talla", "IMC", "Grasa", "Cintura", "Cadera", "Espalda", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(Datos2);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Paciente:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("ID:");

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        txtPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacienteActionPerformed(evt);
            }
        });

        btnBuscarClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarClient.setText("Buscar");
        btnBuscarClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientActionPerformed(evt);
            }
        });

        btnRegistarDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistarDatos.setText("Registrar Datos");
        btnRegistarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarDatosActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Peso");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("KG");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Talla");

        txtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("IMC");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Grasa");

        txtGrasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrasaActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Cintura");

        txtCintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCinturaActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Cadera");

        txtCadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaderaActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("Espalda");

        txtEspalda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspaldaActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("Fecha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(btnRegistarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnBuscarClient, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel54)
                                .addComponent(jLabel56)
                                .addComponent(jLabel57)
                                .addComponent(jLabel58)
                                .addComponent(jLabel59)
                                .addComponent(jLabel60)
                                .addComponent(jLabel61))
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel55))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCadera, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEspalda, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarClient)
                        .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCadera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEspalda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaSeguimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Control", jPanel3);

        jTabbedPane1.addTab("Control de Peso", jTabbedPane2);

        javax.swing.GroupLayout seguimientoLayout = new javax.swing.GroupLayout(seguimiento);
        seguimiento.setLayout(seguimientoLayout);
        seguimientoLayout.setHorizontalGroup(
            seguimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seguimientoLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        seguimientoLayout.setVerticalGroup(
            seguimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seguimientoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        controlPeso.addTab("Seguimiento", seguimiento);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Fecha");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Nombre");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Descripcion");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane4.setViewportView(txtDescripcion);

        btnRegistrarCita.setText("Registrar");
        btnRegistrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCitaActionPerformed(evt);
            }
        });

        Hora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Hora.setText("Horario");

        horarioSpinner.setModel(new javax.swing.SpinnerDateModel());

        tablaCitas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Folio", "Nombre", "Fecha", "Horario", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCitas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitas1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaCitas1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addComponent(Hora)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fechaCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(txtNombCita)
                                    .addComponent(horarioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombCita, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horarioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addComponent(btnRegistrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Agendar", jPanel4);

        fechaCitaCalendario1.setColorBackground(new java.awt.Color(144, 37, 230));
        fechaCitaCalendario1.setColorButtonHover(new java.awt.Color(0, 0, 0));
        fechaCitaCalendario1.setColorForeground(new java.awt.Color(0, 0, 0));
        fechaCitaCalendario1.setColorSelForeground(new java.awt.Color(0, 0, 0));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Folio", "Cliente", "Servicio", "Precio", "Estatus", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCitas);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(fechaCitaCalendario1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaCitaCalendario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Registros", jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        controlPeso.addTab("Citas", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controlPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(controlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPacienteActionPerformed

    private void btnBuscarClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientActionPerformed
        String nombreCliente = txtPaciente.getText();
        clientesDAO.buscarSeguimientoPorNombreCliente(nombreCliente);
    }//GEN-LAST:event_btnBuscarClientActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Verificar si los campos están vacíos
    if (txtNombre.getText().trim().isEmpty() || 
        txtEdad.getText().trim().isEmpty() || 
        txtTelefono.getText().trim().isEmpty() || 
        txtDireccion.getText().trim().isEmpty() || 
        txtCorreo.getText().trim().isEmpty() || 
        txtEmba.getSelectedItem() == null) {
        
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si algún campo está vacío
    }

    // Obtener los datos del cliente desde los campos de texto
    String nombre = txtNombre.getText();
    int edad = Integer.parseInt(txtEdad.getText());
    int telefono = Integer.parseInt(txtTelefono.getText());
    String direccion = txtDireccion.getText();
    String correo = txtCorreo.getText();
    String embarazo = txtEmba.getSelectedItem().toString();

    // Crear una instancia de ClienteDAO y llamar al método registrarCliente
    ClientesDAO clienteDAO = new ClientesDAO(cn); // Suponiendo que "conexion" es tu objeto de conexión a la base de datos
    boolean registrado = clienteDAO.registrarCliente(nombre, edad, telefono, direccion, correo, embarazo);

    if (registrado) {
        JOptionPane.showMessageDialog(this, "Cliente registrado correctamente.");
        limpiarCampos(); // Limpiar los campos después de registrar
        listar(); // Si quieres listar los clientes después de registrar uno nuevo
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el cliente.");
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatosMouseClicked
        // Obtener la fila seleccionada
        int filaSeleccionada = Datos.getSelectedRow();

        if (filaSeleccionada >= 0) { // Verificar que se haya seleccionado una fila
            // Obtener los datos de la fila seleccionada
            String id_Cliente = Datos.getValueAt(filaSeleccionada, 0).toString();
            String nombre = Datos.getValueAt(filaSeleccionada, 1).toString();
            String edad = Datos.getValueAt(filaSeleccionada, 2).toString();
            String telefono = Datos.getValueAt(filaSeleccionada, 3).toString();
            String direccion = Datos.getValueAt(filaSeleccionada, 4).toString();
            String correo = Datos.getValueAt(filaSeleccionada, 5).toString();
            String embarazo = Datos.getValueAt(filaSeleccionada, 6).toString();

            // Mostrar los datos en los text fields
            txtID.setText(id_Cliente);
            txtNombre.setText(nombre);
            txtEdad.setText(edad);
            txtTelefono.setText(telefono);
            txtDireccion.setText(direccion);
            txtCorreo.setText(correo);
            txtEmba.setSelectedItem(embarazo);

        }

    }//GEN-LAST:event_DatosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Verificar si el campo ID está vacío
        if (txtID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo ID está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el campo ID está vacío
        }

        // Obtener los datos del cliente desde los campos de texto
        int idCliente = Integer.parseInt(txtID.getText());
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        int telefono = Integer.parseInt(txtTelefono.getText());
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        String embarazo = txtEmba.getSelectedItem().toString();

        // Llamar al método modificarCliente
        clientesDAO.modificarCliente(idCliente, nombre, edad, telefono, direccion, correo, embarazo);

        // Llamar al método listar para actualizar la tabla
        listar();

        // Limpiar los campos después de modificar
        limpiarCampos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Verificar si el campo ID está vacío
        if (txtID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo ID está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el campo ID está vacío
        }

        // Obtener el ID del cliente a eliminar
        int idCliente = Integer.parseInt(txtID.getText());

        // Llamar al método eliminarCliente
        clientesDAO.eliminarCliente(idCliente);

        // Llamar al método listar para actualizar la tabla
        listar();

        // Limpiar los campos después de eliminar
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked

    }//GEN-LAST:event_tablaCitasMouseClicked

    private void txtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTallaActionPerformed

    private void txtGrasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrasaActionPerformed

    private void txtCinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCinturaActionPerformed

    private void txtCaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaderaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaderaActionPerformed

    private void txtEspaldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspaldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspaldaActionPerformed

    private void txtEmbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmbaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmbaActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnRegistarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarDatosActionPerformed
        // Obtener el ID del cliente y otros datos necesarios para el seguimiento
        int idCliente = clientesDAO.obtenerIdClientePorNombre(txtPaciente.getText());
        String peso = txtPeso.getText();
        String talla = txtTalla.getText();
        String imc = txtIMC.getText();
        String grasa = txtGrasa.getText();
        String cintura = txtCintura.getText();
        String cadera = txtCadera.getText();
        String espalda = txtEspalda.getText();
        java.util.Date utilFecha = fechaSeguimiento.getDate();

// Verificar que el ID del cliente es válido antes de intentar registrar el seguimiento
        if (idCliente != -1) {
            // Convertir java.util.Date a java.sql.Date
            java.sql.Date fecha = new java.sql.Date(utilFecha.getTime());

            // Llamada al método registrarSeguimiento con los valores obtenidos
            clientesDAO.registrarSeguimiento(idCliente, peso, talla, imc, grasa, cintura, cadera, espalda, fecha);
            limpiarSeguimiento();
            JOptionPane.showMessageDialog(null, "Seguimiento registrado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el cliente.");
        }

    }//GEN-LAST:event_btnRegistarDatosActionPerformed

    private void btnRegistrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCitaActionPerformed
        // Obtener los datos de los componentes
        String nombre = txtNombCita.getText();
        java.util.Date fechaUtil = fechaCitas.getDate();
        // Obtener el valor del horario del JSpinner como cadena de texto
        String horarioString = horarioSpinner.getValue().toString();

// Convertir la cadena de texto a un objeto Time
        Time horario = Time.valueOf(horarioString);

        String descripcion = txtDescripcion.getText();

        // Crear una instancia de tu clase de control (ClientesDAO)
        ClientesDAO clientesDAO = new ClientesDAO((Connection) con); // Suponiendo que "con" es tu objeto de conexión a la base de datos

        // Llamar al método registrarCita
        boolean registroExitoso = clientesDAO.registrarCita(0, nombre, fechaUtil, horario, descripcion); // Suponiendo que el ID_Cita es autoincremental y no necesitas pasarlo desde la interfaz

        // Mostrar mensaje de confirmación
        if (registroExitoso) {
            JOptionPane.showMessageDialog(this, "Cita registrada correctamente");
            limpiarCampos(); // Si deseas limpiar los campos después de registrar la cita
            // Otras operaciones que desees realizar después de registrar la cita
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la cita");
        }
    }//GEN-LAST:event_btnRegistrarCitaActionPerformed

    private void tablaCitas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaCitas1MouseClicked

    //METODOS ---------------------------------------------------------------------------------------------------------------------------
    //METODOS ---------------------------------------------------------------------------------------------------------------------------
    //METODOS ---------------------------------------------------------------------------------------------------------------------------
    public class ClientesDAO {

        private Connection con;

        public ClientesDAO(Connection con) {
            this.con = con;
        }

        //metodo registarCliente
        public boolean registrarCliente(String nombre, int edad, int telefono, String direccion, String correo, String embarazo) {
            try {
                String sql = "INSERT INTO clientes (Nombre, Edad, Telefono, Direccion, Correo, Embarazo) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nombre);
                pst.setInt(2, edad);
                pst.setInt(3, telefono);
                pst.setString(4, direccion);
                pst.setString(5, correo);
                pst.setString(6, embarazo);

                int filasAfectadas = pst.executeUpdate();
                pst.close();

                return filasAfectadas > 0; // Si se insertó al menos una fila, retornar true

            } catch (SQLException e) {
                e.printStackTrace();
                return false; // Retornar false si ocurre un error durante la inserción
            }
        }

        //Actualiza Los datos del cliente
        public void modificarCliente(int idCliente, String nombre, int edad, int telefono, String direccion, String correo, String embarazo) {
            try {
                String sql = "UPDATE clientes SET Nombre=?, Edad=?, Telefono=?, Direccion=?, Correo=?, Embarazo=? WHERE Id_Cliente=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nombre);
                pst.setInt(2, edad);
                pst.setInt(3, telefono);
                pst.setString(4, direccion);
                pst.setString(5, correo);
                pst.setString(6, embarazo);
                pst.setInt(7, idCliente);  // Índice corregido para Id_Cliente

                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //metodo eliminar el cliente

        public void eliminarCliente(int idCliente) {
            try {
                String sql = "DELETE FROM clientes WHERE Id_Cliente=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, idCliente);
                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //registra el seguimiento del cliente 
        public void registrarSeguimiento(int idCliente, String peso, String talla, String imc, String grasa, String cintura, String cadera, String espalda, java.util.Date utilFecha) {
            try {
                // Convertir java.util.Date a java.sql.Date
                java.sql.Date fecha = new java.sql.Date(utilFecha.getTime());

                // Insertar en la tabla seguimiento
                String sqlSeguimiento = "INSERT INTO seguimiento (Id_Cliente, Peso, Talla, IMC, Grasa, Cintura, Cadera, Espalda, Fecha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstSeguimiento = con.prepareStatement(sqlSeguimiento);
                pstSeguimiento.setInt(1, idCliente); // ID del cliente
                pstSeguimiento.setString(2, peso); // Peso del cliente
                pstSeguimiento.setString(3, talla); // Talla del cliente
                pstSeguimiento.setString(4, imc); // IMC del cliente
                pstSeguimiento.setString(5, grasa); // Porcentaje de grasa del cliente
                pstSeguimiento.setString(6, cintura); // Medida de cintura del cliente
                pstSeguimiento.setString(7, cadera); // Medida de cadera del cliente
                pstSeguimiento.setString(8, espalda); // Medida de espalda del cliente
                pstSeguimiento.setDate(9, fecha); // Fecha del seguimiento
                pstSeguimiento.executeUpdate(); // Ejecutar la actualización

                JOptionPane.showMessageDialog(null, "Seguimiento registrado correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al registrar seguimiento: " + e.getMessage());
            }
        }

        //metodo para obtenerl el id cliente en la tabla clientes
        public int obtenerIdClientePorNombre(String nombreCliente) {
            int idCliente = -1;
            try {
                String sql = "SELECT Id_Cliente FROM clientes WHERE Nombre = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nombreCliente);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    idCliente = rs.getInt("Id_Cliente");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al obtener ID del cliente: " + e.getMessage());
            }
            return idCliente;
        }

        // Método para buscar seguimiento por nombre del cliente y mostrarlo en la tabla
        public void buscarSeguimientoPorNombreCliente(String nombreCliente) {
            int idCliente = obtenerIdClientePorNombre(nombreCliente);
            if (idCliente != -1) {
                // Aquí puedes buscar en la tabla seguimiento usando el ID del cliente y mostrar los resultados en la tabla de la interfaz
                // Suponiendo que tienes un JTable llamado tableSeguimiento
                DefaultTableModel model = (DefaultTableModel) Datos2.getModel();
                model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
                try {
                    String sql = "SELECT Peso, Talla, IMC, Grasa, Cintura, Cadera, Espalda, Fecha FROM seguimiento WHERE Id_Cliente = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, idCliente);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        // Asumiendo que la tabla tiene las mismas columnas que la base de datos
                        model.addRow(new Object[]{
                            rs.getString("Peso"),
                            rs.getString("Talla"),
                            rs.getString("IMC"),
                            rs.getString("Grasa"),
                            rs.getString("Cintura"),
                            rs.getString("Cadera"),
                            rs.getString("Espalda"),
                            rs.getDate("Fecha")
                        });
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al buscar seguimiento: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }
        }

        //Metodo de Registar Cita
        public boolean registrarCita(int id_Cita, String Nombre_cliente, java.util.Date utilFecha, Time Horario, String Descripcion) {
            try {
                // Convertir java.util.Date a java.sql.Date
                java.sql.Date fecha = new java.sql.Date(utilFecha.getTime());

                String sql = "INSERT INTO Citas(Nombre_cliente,Fecha, Hora, Descripcion,) VALUES (?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, Nombre_cliente);
                pst.setDate(2, fecha);
                pst.setTime(3, Horario);
                pst.setString(4, Descripcion);

                int filasAfectadas = pst.executeUpdate();
                pst.close();

                return filasAfectadas > 0; // Si se insertó al menos una fila, retornar true

            } catch (SQLException e) {
                e.printStackTrace();
                return false; // Retornar false si ocurre un error durante la inserción

            }// Cierre catch

        }//cerrar metodo registrar cita 

        public boolean registrarCita(String nombre, JDateChooser fechaChooser, Time horario, String descripcion) {
            try {
                // Obtener la fecha del JDateChooser
                java.util.Date fechaUtil = fechaChooser.getDate();
                java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

                String sql = "INSERT INTO citas (Folio, Nombre, Fecha, Horario, Descripcion) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(2, nombre);
                pst.setDate(3, fechaSql);
                pst.setTime(4, horario);
                pst.setString(5, descripcion);

                int filasAfectadas = pst.executeUpdate();
                pst.close();

                return filasAfectadas > 0; // Si se insertó al menos una fila, retornar true

            } catch (SQLException e) {
                e.printStackTrace();
                return false; // Retornar false si ocurre un error durante la inserción
            }
        }

    }///cierre metodo sentencias 

    //Metodo Limpiar
    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtEmba.setSelectedIndex(0); // Selección por defecto en el combobox

    }

    //METODO LISTAR
    public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        // Agregar columnas al modelo de la tabla
        modelo.addColumn("Id_Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        modelo.addColumn("Embarazo");

        try {
            // Consulta SQL para obtener todos los clientes
            String sql = "SELECT * FROM clientes";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            // Iterar sobre los resultados y agregarlos al modelo de la tabla
            while (rs.next()) {
                Object[] fila = new Object[14];
                fila[0] = rs.getInt("Id_Cliente");
                fila[1] = rs.getString("Nombre");
                fila[2] = rs.getInt("Edad");
                fila[3] = rs.getInt("Telefono");
                fila[4] = rs.getString("Direccion");
                fila[5] = rs.getString("Correo");
                fila[6] = rs.getString("Embarazo");

                modelo.addRow(fila);
            }

            // Asignar el modelo a la tabla en tu interfaz
            Datos.setModel(modelo);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void Nuevo() {
        // Limpiar los campos para agregar un nuevo cliente
        limpiarCampos();
    }

    //limpiar seguimiento al registrar
    public void limpiarSeguimiento() {
        txtIdCliente.setText("");
        txtPeso.setText("");      // Limpia el campo del peso
        txtTalla.setText("");     // Limpia el campo de la talla
        txtIMC.setText("");       // Limpia el campo del IMC
        txtGrasa.setText("");     // Limpia el campo de la grasa
        txtCintura.setText("");   // Limpia el campo de la cintura
        txtCadera.setText("");    // Limpia el campo de la cadera
        txtEspalda.setText("");   // Limpia el campo de la espalda
        fechaSeguimiento.setDate(null);  // Limpia la fecha del seguimiento
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Datos;
    private javax.swing.JTable Datos2;
    private javax.swing.JLabel Hora;
    private javax.swing.JPanel Pacientes;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarClient;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistarDatos;
    private javax.swing.JButton btnRegistrarCita;
    private javax.swing.JTabbedPane controlPeso;
    private rojeru_san.componentes.RSDateChooser fechaCitaCalendario1;
    private com.toedter.calendar.JDateChooser fechaCitas;
    private com.toedter.calendar.JDateChooser fechaSeguimiento;
    private javax.swing.JSpinner horarioSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JPanel seguimiento;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTable tablaCitas1;
    private javax.swing.JTextField txtCadera;
    private javax.swing.JTextField txtCintura;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JComboBox<String> txtEmba;
    private javax.swing.JTextField txtEspalda;
    private javax.swing.JTextField txtGrasa;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombCita;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
