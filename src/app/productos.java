package app;

import java.sql.*;
import javax.swing.JOptionPane;

public class productos extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet result;

    public static Connection getConnection() {

        Connection cn = null;
        String BD = "jdbc:postgresql://localhost:5432/abmproductos";
        String user = "postgres";
        String pass = "123456789";

        try {
            cn = DriverManager.getConnection(BD, user, pass);
            //JOptionPane.showMessageDialog(null, "Base de datos conectada con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos " + e);
        }
        return cn;
    }

    private void limpiarCajas() {
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtDetalle.setText(null);
        txtPrecioVenta.setText(null);
        txtPrecioCompra.setText(null);
        txtStock.setText(null);
        txtProveedor.setText(null);
        txtFechaIngreso.setText(null);
    }

    public productos() {
        initComponents();
        //txtId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDetalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Detalle:");

        jLabel4.setText("Precio Venta:");

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio Compra:");

        jLabel6.setText("Proveedor:");

        jLabel7.setText("Stock:");

        jLabel8.setText("Fecha Ingreso:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaIngreso))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDetalle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                            .addComponent(txtNombre))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClean)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnClean))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Connection cn = null;

        try {
            cn = getConnection();
            ps = cn.prepareStatement("INSERT INTO productos (codigo_producto, nombre, detalle, precio_venta, precio_compra, stock, proveedor) VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(txtCodigo.getText()));
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtDetalle.getText());
            ps.setFloat(4, Float.parseFloat(txtPrecioVenta.getText()));
            ps.setFloat(5, Float.parseFloat(txtPrecioCompra.getText()));
            ps.setInt(6, Integer.parseInt(txtStock.getText()));
            ps.setString(7, txtProveedor.getText());
            //ps.setDate(8, Date.valueOf(txtFechaIngreso.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Producto guardado");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar producto");
                limpiarCajas();
            }

            cn.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Connection cn = null;

        try {
            cn = getConnection();
            ps = cn.prepareStatement("UPDATE productos SET codigo_producto=?, nombre=?, detalle=?, precio_venta=?, precio_compra=?, stock=?, proveedor=? WHERE codigo_producto=?");
            ps.setInt(1, Integer.parseInt(txtCodigo.getText()));
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtDetalle.getText());
            ps.setFloat(4, Float.parseFloat(txtPrecioVenta.getText()));
            ps.setFloat(5, Float.parseFloat(txtPrecioCompra.getText()));
            ps.setInt(6, Integer.parseInt(txtStock.getText()));
            ps.setString(7, txtProveedor.getText());
            ps.setInt(8, Integer.parseInt(txtCodigo.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Producto modificado");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar producto");
                limpiarCajas();
            }

            cn.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Connection cn = null;

        try {
            cn = getConnection();

            ps = cn.prepareStatement("SELECT * from productos WHERE codigo_producto = ?");
            ps.setInt(1, Integer.parseInt(txtCodigo.getText()));

            result = ps.executeQuery();

            if (result.next()) {
                txtCodigo.setText(result.getString("codigo_producto"));
                txtNombre.setText(result.getString("nombre"));
                txtDetalle.setText(result.getString("detalle"));
                txtPrecioVenta.setText(result.getString("precio_venta"));
                txtPrecioCompra.setText(result.getString("precio_compra"));
                txtStock.setText(result.getString("stock"));
                txtProveedor.setText(result.getString("proveedor"));
                txtFechaIngreso.setText(result.getString("fecha_ingreso"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un producto con ese codigo");
            }
            cn.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Connection cn = null;

        try {
            cn = getConnection();
            ps = cn.prepareStatement("DELETE FROM productos WHERE codigo_producto = ?");
            ps.setInt(1, Integer.parseInt(txtCodigo.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0 ){
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al eliminar producto");
                limpiarCajas();
            }
            cn.close();
            
        } catch (Exception e) {
            System.err.println("Error: " +e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
