/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Controlador.BD.Conexion;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brand
 */
public class inventarioPanel extends javax.swing.JPanel {

    Conexion con = new Conexion();
    Connection cn;
    ProductosDAO productosDAO; // Variable para la instancia de ProductosDAO
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    /**
     * Creates new form inventarioPanel
     */
    public inventarioPanel() {
        initComponents();
        cn = con.getConnection();
        productosDAO = new ProductosDAO(cn);
        listar();
    }

    public class ProductosDAO {

        public Connection con;

        public ProductosDAO(Connection con) {
            this.con = con;
        }

        public void agregarProductoInventario(String nombreProducto, BigDecimal precioCosto, BigDecimal precioVenta, int cantidad, int cantidadMinima) {
            try {
                // Insertar en la tabla productos
                String sqlProductos = "INSERT INTO productos (nombre, precio_costo, precio_venta) VALUES (?, ?, ?)";
                PreparedStatement pstProductos = con.prepareStatement(sqlProductos, Statement.RETURN_GENERATED_KEYS);
                pstProductos.setString(1, nombreProducto);
                pstProductos.setBigDecimal(2, precioCosto);
                pstProductos.setBigDecimal(3, precioVenta);
                pstProductos.executeUpdate();

                // Obtener el ID generado para el producto insertado
                ResultSet rsProductos = pstProductos.getGeneratedKeys();
                int idProducto = -1;
                if (rsProductos.next()) {
                    idProducto = rsProductos.getInt(1);
                }

                if (idProducto != -1) {
                    // Insertar en la tabla inventario
                    String sqlInventario = "INSERT INTO inventario (id_producto, cantidad, cantidad_minima) VALUES (?, ?, ?)";
                    PreparedStatement pstInventario = con.prepareStatement(sqlInventario);
                    pstInventario.setInt(1, idProducto);
                    pstInventario.setInt(2, cantidad);
                    pstInventario.setInt(3, cantidadMinima);
                    pstInventario.executeUpdate();

                    listar();
                    limpiarCampos();

                    JOptionPane.showMessageDialog(null, "Producto y inventario agregados correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al obtener el ID del producto.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al agregar producto e inventario: " + e.getMessage());
            }
        }

        public void modificarProducto(int idProducto, String nombreProducto, BigDecimal precioCosto, BigDecimal precioVenta, int cantidad, int cantidadMinima) {
            try {
                // Actualizar en la tabla productos
                String sqlProductos = "UPDATE productos SET nombre=?, precio_costo=?, precio_venta=? WHERE id=?";
                PreparedStatement pstProductos = con.prepareStatement(sqlProductos);
                pstProductos.setString(1, nombreProducto);
                pstProductos.setBigDecimal(2, precioCosto);
                pstProductos.setBigDecimal(3, precioVenta);
                pstProductos.setInt(4, idProducto);
                pstProductos.executeUpdate();

                // Actualizar el inventario para el producto modificado
                String sqlInventario = "UPDATE inventario SET cantidad=?, cantidad_minima=? WHERE id_producto=?";
                PreparedStatement pstInventario = con.prepareStatement(sqlInventario);
                pstInventario.setInt(1, cantidad);
                pstInventario.setInt(2, cantidadMinima);
                pstInventario.setInt(3, idProducto);
                pstInventario.executeUpdate();

                listar();

                JOptionPane.showMessageDialog(null, "Producto y inventario modificados correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al modificar producto e inventario: " + e.getMessage());
            }

        }//Cierre metodo Modificar 

        public void eliminarProducto(int idProducto) {
            try {
                // Eliminar registros del inventario para el producto
                String sqlInventario = "DELETE FROM inventario WHERE id_producto=?";
                PreparedStatement pstInventario = con.prepareStatement(sqlInventario);
                pstInventario.setInt(1, idProducto);
                pstInventario.executeUpdate();

                // Eliminar el producto de la tabla productos
                String sqlProductos = "DELETE FROM productos WHERE id=?";
                PreparedStatement pstProductos = con.prepareStatement(sqlProductos);
                pstProductos.setInt(1, idProducto);
                pstProductos.executeUpdate();

                listar(); // Opcional: actualiza la tabla en la interfaz

                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al eliminar producto: " + e.getMessage());
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosProdu = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnLimpiarCamposInv = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtVenta = new javax.swing.JTextField();
        spinnerCantidad = new javax.swing.JSpinner();
        spinnerMin = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 1103));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("Insertar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        DatosProdu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Stock", "P. Costo", "P. Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DatosProdu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatosProduMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DatosProdu);

        jTabbedPane1.addTab("Prodcutos", jScrollPane1);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Buscar");

        btnLimpiarCamposInv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiarCamposInv.setText("Nuevo");
        btnLimpiarCamposInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposInvActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("P. Costo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Catidad");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("P. Venta");

        txtVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVentaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad Min");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerMin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerMin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarCamposInv, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(979, 979, 979)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCamposInv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Verificar si los campos están vacíos
        if (txtID.getText().trim().isEmpty()
                || txtProducto.getText().trim().isEmpty()
                || txtCosto.getText().trim().isEmpty()
                || txtVenta.getText().trim().isEmpty()
                || ((int) spinnerCantidad.getValue() == 0)
                || ((int) spinnerMin.getValue() == 0)) {

            JOptionPane.showMessageDialog(null, "Los campos están vacíos o tienen valores no válidos", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si algún campo está vacío
        }

        // Obtener los datos de los campos de texto y componentes
        int idProducto = Integer.parseInt(txtID.getText());
        String nombreProducto = txtProducto.getText();
        BigDecimal precioCosto = new BigDecimal(txtCosto.getText());
        BigDecimal precioVenta = new BigDecimal(txtVenta.getText());
        int cantidad = (int) spinnerCantidad.getValue();
        int cantidadMinima = (int) spinnerMin.getValue();

        // Llamar al método modificarProducto
        productosDAO.modificarProducto(idProducto, nombreProducto, precioCosto, precioVenta, cantidad, cantidadMinima);

        // Limpiar los campos después de modificar
        limpiarCampos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Verificar si el campo ID está vacío
        if (txtID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo ID está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el campo ID está vacío
        }

        // Obtener el ID del producto a eliminar
        int idProducto = Integer.parseInt(txtID.getText());

        // Llamar al método eliminarProducto
        productosDAO.eliminarProducto(idProducto);

        // Limpiar los campos después de eliminar
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarCamposInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposInvActionPerformed
        txtID.setText("");
        txtProducto.setText("");
        txtCosto.setText("");
        txtVenta.setText("");
        spinnerCantidad.setValue(0);
        spinnerMin.setValue(0);
    }//GEN-LAST:event_btnLimpiarCamposInvActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        /// Verificar si los campos están vacíos
        if (txtProducto.getText().trim().isEmpty()
                || txtCosto.getText().trim().isEmpty()
                || txtVenta.getText().trim().isEmpty()
                || ((int) spinnerCantidad.getValue() == 0)
                || ((int) spinnerMin.getValue() == 0)) {

            JOptionPane.showMessageDialog(null, "Los campos están vacíos o tienen valores no válidos", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si algún campo está vacío
        }

        // Obtener los datos del producto desde la interfaz
        String nombre = txtProducto.getText();
        BigDecimal precioCosto = new BigDecimal(txtCosto.getText());
        BigDecimal precioVenta = new BigDecimal(txtVenta.getText());

        // Obtener los datos del inventario desde la interfaz
        int cantidad = (int) spinnerCantidad.getValue();
        int cantidadMinima = (int) spinnerMin.getValue();

        // Llamar al método para agregar producto e inventario
        productosDAO.agregarProductoInventario(nombre, precioCosto, precioVenta, cantidad, cantidadMinima);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void DatosProduMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatosProduMouseClicked
        // Obtener la fila seleccionada
        int filaSeleccionada = DatosProdu.getSelectedRow();

        if (filaSeleccionada >= 0) { // Verificar que se haya seleccionado una fila
            // Obtener los datos de la fila seleccionada
            String idProducto = DatosProdu.getValueAt(filaSeleccionada, 0).toString();
            String nombreProducto = DatosProdu.getValueAt(filaSeleccionada, 1).toString();
            String precioCosto = DatosProdu.getValueAt(filaSeleccionada, 2).toString();
            String precioVenta = DatosProdu.getValueAt(filaSeleccionada, 3).toString();
            String cantidad = DatosProdu.getValueAt(filaSeleccionada, 4).toString();
            String cantidadMinima = DatosProdu.getValueAt(filaSeleccionada, 5).toString();

            // Mostrar los datos en los text fields y otros componentes de la interfaz
            txtID.setText(idProducto);
            txtProducto.setText(nombreProducto);
            txtCosto.setText(precioCosto);
            txtVenta.setText(precioVenta);
            spinnerCantidad.setValue(Integer.parseInt(cantidad));
            spinnerMin.setValue(Integer.parseInt(cantidadMinima));
        }
    }//GEN-LAST:event_DatosProduMouseClicked

    public void listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        // Agregar columnas al modelo de la tabla
        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio Costo");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Cantidad Mínima");

        try {
            // Consulta SQL para obtener información de productos e inventario combinados
            String sql = "SELECT p.id, p.nombre, p.precio_costo, p.precio_venta, i.cantidad, i.cantidad_minima "
                    + "FROM productos p INNER JOIN inventario i ON p.id = i.id_producto";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            // Iterar sobre los resultados y agregarlos al modelo de la tabla
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getBigDecimal("precio_costo");
                fila[3] = rs.getBigDecimal("precio_venta");
                fila[4] = rs.getInt("cantidad");
                fila[5] = rs.getInt("cantidad_minima");

                modelo.addRow(fila);
            }

            // Asignar el modelo a la tabla en tu interfaz
            DatosProdu.setModel(modelo);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void limpiarCampos() {
        txtProducto.setText("");
        txtCosto.setText("");
        txtVenta.setText("");
        spinnerCantidad.setValue(0);
        spinnerMin.setValue(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DatosProdu;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarCamposInv;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JSpinner spinnerMin;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
}
