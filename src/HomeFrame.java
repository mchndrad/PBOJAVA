/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.math.BigDecimal;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author candr
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame(){
        initComponents();
        initializeTable1();
        initializeTable2();
    }
    
    private void initializeTable1() {
    DefaultTableModel model = new DefaultTableModel();
    jTable1.setModel(model);
    model.addColumn("ID Barang");
    model.addColumn("Tanggal Terima Barang");
    model.addColumn("Nama Produk");
    model.addColumn("Kategori Produk");
   
}
    
    private void initializeTable2() {
    DefaultTableModel model = new DefaultTableModel();
    jTable2.setModel(model);
    model.addColumn("Jumlah Dipesan");
    model.addColumn("Jumlah Diterima");
    model.addColumn("Satuan");
    model.addColumn("Harga Per Unit");
    model.addColumn("Stock Barang");
    model.addColumn("Total Harga");
    model.addColumn("ID Supplier");
    model.addColumn("Nama Supplier");
    model.addColumn("Nomor Invoice");
    model.addColumn("Kondisi Barang");
    model.addColumn("ID Penerima");
    model.addColumn("Nama Penerima");
    }
    
    
    private void loadDataToTable1(){
    try {
        Connection connection = DatabaseConnection.getConnection();
        try {
            String query = "SELECT * FROM barang_masuk";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getInt("id_barang"),
                    resultSet.getString("tanggal_terima"),
                    resultSet.getString("nama_produk"),
                    resultSet.getString("kategori_produk"),
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (SQLException ex) {
            Logger.getLogger(HomeFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    
    private void loadDataToTable2(){
        try {
        Connection connection = DatabaseConnection.getConnection();
        try {
            String query = "SELECT * FROM barang_masuk";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getInt("jumlah_dipesan"),
                    resultSet.getInt("jumlah_diterima"),
                    resultSet.getString("satuan"),
                    resultSet.getBigDecimal("harga_per_unit"),
                    resultSet.getInt("stock_barang"),
                    resultSet.getBigDecimal("total_harga"),
                    resultSet.getInt("id_supplier"),
                    resultSet.getString("nama_supplier"),
                    resultSet.getString("nomor_invoice"),
                    resultSet.getString("kondisi_barang"),
                    resultSet.getInt("id_penerima"),
                    resultSet.getString("nama_penerima")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (SQLException ex) {
            Logger.getLogger(HomeFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDBarang = new javax.swing.JTextField();
        txtTanggalTerima = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNamaProduk = new javax.swing.JTextField();
        txtKategoriProduk = new javax.swing.JTextField();
        txtJumlahDipesan = new javax.swing.JTextField();
        txtJumlahDiterima = new javax.swing.JTextField();
        txtSatuan = new javax.swing.JTextField();
        txtHargaPerUnit = new javax.swing.JTextField();
        txtStockBarang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        txtIDSupplier = new javax.swing.JTextField();
        txtNamaSupplier = new javax.swing.JTextField();
        txtNomorInvoice = new javax.swing.JTextField();
        txtIDPenerima = new javax.swing.JTextField();
        txtNamaPenerima = new javax.swing.JTextField();
        cmbKondisiBarang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("PENDATAAN BARANG MASUK TOKO DEWI CANTIK");

        jLabel2.setText("ID Barang");

        jLabel3.setText("Tanggal Terima Barang");

        jLabel4.setText("Nama Produk");

        jLabel5.setText("Kategori Produk");

        jLabel6.setText("Jumlah yang dipesan");

        jLabel7.setText("Jumlah yang diterima");

        jLabel8.setText("Satuan (pcs,kg,liter)");

        jLabel9.setText("Harga Per Unit");

        jLabel10.setText("Total Harga");

        txtStockBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockBarangActionPerformed(evt);
            }
        });

        jLabel11.setText("ID Supplier");

        jLabel12.setText("Stock Barang");

        jLabel13.setText("Nama Supplier");

        jLabel14.setText("Nomor Invoice");

        jLabel15.setText("Kondisi barang saat diterima");

        jLabel16.setText("ID Penerima Barang");

        jLabel17.setText("Nama Penerima Barang");

        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        txtIDSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDSupplierActionPerformed(evt);
            }
        });

        txtNamaSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaSupplierActionPerformed(evt);
            }
        });

        txtNomorInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorInvoiceActionPerformed(evt);
            }
        });

        txtIDPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDPenerimaActionPerformed(evt);
            }
        });

        txtNamaPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPenerimaActionPerformed(evt);
            }
        });

        cmbKondisiBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Baik", "Cukup Baik", "Kurang Baik" }));
        cmbKondisiBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKondisiBarangActionPerformed(evt);
            }
        });

        jTable1.setModel(jTable1.getModel());
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ID Barang");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Tanggal Terima Barang");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Nama Produk");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Kategori Produk");
        }

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Jumlah Dipesan", "Jumlah DIterima", "Satuan", "Harga per Unit", "Stock Barang", "Total Harga", "ID Supplier", "Nama Supplier", "Nomor Invoice", "Kondisi Barang", "ID Pnerima", "Nama Penerima"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnRead.setText("READ");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setText("KEMBALI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtJumlahDiterima, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJumlahDipesan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKategoriProduk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaProduk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTanggalTerima, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDBarang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHargaPerUnit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIDPenerima, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbKondisiBarang, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                    .addComponent(txtNamaPenerima)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomorInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtNamaSupplier)
                                    .addComponent(txtIDSupplier)
                                    .addComponent(txtTotalHarga)
                                    .addComponent(txtStockBarang))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(362, 362, 362)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTanggalTerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKategoriProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtJumlahDipesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtNomorInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtJumlahDiterima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(cmbKondisiBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtIDPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtHargaPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtNamaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStockBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockBarangActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void txtIDSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDSupplierActionPerformed

    private void txtNamaSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaSupplierActionPerformed

    private void txtNomorInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorInvoiceActionPerformed

    private void txtIDPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDPenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDPenerimaActionPerformed

    private void txtNamaPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPenerimaActionPerformed

    private void cmbKondisiBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKondisiBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKondisiBarangActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
        // Validasi dan konversi input harga_per_unit dan total_harga
        BigDecimal hargaPerUnit = null;
        BigDecimal totalHarga = null;

        try {
            // Mengganti koma dengan string kosong dan mengganti titik sebagai pemisah desimal
            String hargaPerUnitStr = txtHargaPerUnit.getText().replace(",", "").trim();
            String totalHargaStr = txtTotalHarga.getText().replace(",", "").trim();

            hargaPerUnit = new BigDecimal(hargaPerUnitStr);
            totalHarga = new BigDecimal(totalHargaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Format harga tidak valid. Gunakan format angka desimal.");
            return;
        }

        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO `barang_masuk`(`id_barang`, `tanggal_terima`, `nama_produk`, `kategori_produk`, `jumlah_dipesan`, `jumlah_diterima`, `satuan`, `harga_per_unit`, `stock_barang`, `total_harga`, `id_supplier`, `nama_supplier`, `nomor_invoice`, `kondisi_barang`, `id_penerima`, `nama_penerima`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        pst.setInt(1, Integer.parseInt(txtIDBarang.getText()));
        pst.setDate(2, java.sql.Date.valueOf(txtTanggalTerima.getText()));
        pst.setString(3, txtNamaProduk.getText());
        pst.setString(4, txtKategoriProduk.getText());
        pst.setInt(5, Integer.parseInt(txtJumlahDipesan.getText()));
        pst.setInt(6, Integer.parseInt(txtJumlahDiterima.getText()));
        pst.setString(7, txtSatuan.getText());
        pst.setBigDecimal(8, hargaPerUnit);
        pst.setInt(9, Integer.parseInt(txtStockBarang.getText()));
        pst.setBigDecimal(10, totalHarga);
        pst.setInt(11, Integer.parseInt(txtIDSupplier.getText()));
        pst.setString(12, txtNamaSupplier.getText());
        pst.setString(13, txtNomorInvoice.getText());
        pst.setString(14, cmbKondisiBarang.getSelectedItem().toString());
        pst.setInt(15, Integer.parseInt(txtIDPenerima.getText()));
        pst.setString(16, txtNamaPenerima.getText());

        pst.executeUpdate();

        // Mendapatkan id_barang yang dihasilkan
        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()) {
            int generatedId = rs.getInt(1);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan dengan ID: " + generatedId);
        } else {
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
    }
        loadDataToTable1();
        loadDataToTable2();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        try {
        Connection con = DatabaseConnection.getConnection();
        String query = "DELETE FROM barang_masuk WHERE id_barang = ?";
        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, Integer.parseInt(txtIDBarang.getText()));

        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
    }
        loadDataToTable1();
        loadDataToTable2();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
     try {
        // Validasi dan konversi input harga_per_unit dan total_harga
        BigDecimal hargaPerUnit = null;
        BigDecimal totalHarga = null;

        try {
            // Mengganti koma dengan string kosong dan mengganti titik sebagai pemisah desimal
            String hargaPerUnitStr = txtHargaPerUnit.getText().replace(",", "").trim();
            String totalHargaStr = txtTotalHarga.getText().replace(",", "").trim();

            hargaPerUnit = new BigDecimal(hargaPerUnitStr);
            totalHarga = new BigDecimal(totalHargaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Format harga tidak valid. Gunakan format angka desimal.");
            return;
        }
        
        Connection con = DatabaseConnection.getConnection();
        String query = "UPDATE `barang_masuk` SET `tanggal_terima`= ? ,`jumlah_dipesan`= ? ,`jumlah_diterima`= ? ,`harga_per_unit`= ? ,`stock_barang`=? ,`total_harga`= ? ,`id_supplier`= ? ,`nama_supplier`=? ,`nomor_invoice`=? ,`kondisi_barang`= ? ,`id_penerima`= ? ,`nama_penerima`= ? WHERE id_barang = ?";
        PreparedStatement pst = con.prepareStatement(query);  

        pst.setDate(1, java.sql.Date.valueOf(txtTanggalTerima.getText()));
        pst.setInt(2, Integer.parseInt(txtJumlahDipesan.getText()));
        pst.setInt(3, Integer.parseInt(txtJumlahDiterima.getText()));
        pst.setBigDecimal(4, hargaPerUnit);
        pst.setInt(5, Integer.parseInt(txtStockBarang.getText()));
        pst.setBigDecimal(6, totalHarga);
        pst.setInt(7, Integer.parseInt(txtIDSupplier.getText()));
        pst.setString(8, txtNamaSupplier.getText());
        pst.setString(9, txtNomorInvoice.getText());
        pst.setString(10, cmbKondisiBarang.getSelectedItem().toString());
        pst.setInt(11, Integer.parseInt(txtIDPenerima.getText()));
        pst.setString(12, txtNamaPenerima.getText());

    // Pastikan Anda mengambil id_barang dari input pengguna atau komponen GUI
    int idBarang = Integer.parseInt(txtIDBarang.getText());
    pst.setInt(13, idBarang);  // Set id_barang sebagai parameter terakhir

    int rowsUpdated = pst.executeUpdate();
    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
    } else {
        JOptionPane.showMessageDialog(null, "Tidak ada data yang diupdate. Pastikan id_barang valid.");
    }
    } catch (Exception e) {
        e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Data Gagal Diupdate");
    }
     loadDataToTable1();
     loadDataToTable2();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
       loadDataToTable1();
        loadDataToTable2();
    }//GEN-LAST:event_btnReadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbKondisiBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtHargaPerUnit;
    private javax.swing.JTextField txtIDBarang;
    private javax.swing.JTextField txtIDPenerima;
    private javax.swing.JTextField txtIDSupplier;
    private javax.swing.JTextField txtJumlahDipesan;
    private javax.swing.JTextField txtJumlahDiterima;
    private javax.swing.JTextField txtKategoriProduk;
    private javax.swing.JTextField txtNamaPenerima;
    private javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtNamaSupplier;
    private javax.swing.JTextField txtNomorInvoice;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtStockBarang;
    private javax.swing.JTextField txtTanggalTerima;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}