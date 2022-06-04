/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.FileController;
import controllers.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.product;
import static views.ManagementAccountView.tableModal;
import static views.ManagementAccountView.utils;

/**
 *
 * @author Minh Phuong Do
 */
public class ManagementProductView extends javax.swing.JPanel {

    /**
     * Creates new form ManagementProductView
     */
    private javax.swing.table.DefaultTableModel model;
    static DefaultTableModel tableModal;
    static List<product> listProduct = new ArrayList<product>();
    static FileController file;

    Integer productID;
    public void increaseProductId(){
        if(listProduct.size() == 0){
            productID = 0;
        } else {
            productID = listProduct.get(listProduct.size()-1).getmaSP()+1;
        }
        idspField.setEnabled(false);
        idspField.setText(productID.toString());
    }

    public ManagementProductView() {
        initComponents();
        tableModal = (DefaultTableModel) productTable.getModel();
        listProduct = file.readProductFromFile("product.txt");
        for (product item : listProduct) {
            tableModal.addRow(new Object[]{
                item.getmaSP(), item.getTenSP(), item.getGiaBan(), item.getGiaMua(), item.getGiamGia(), item.getSoLuong()
            });
        }
        suajButton.setEnabled(false);
        xoajButton.setEnabled(false);
        increaseProductId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suajButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        themjButton = new javax.swing.JButton();
        searchFieldProduct = new javax.swing.JTextField();
        tenspField = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        giamuaField = new java.awt.TextField();
        idspField = new java.awt.TextField();
        giagiamField = new java.awt.TextField();
        giabanField = new java.awt.TextField();
        xoajButton = new javax.swing.JButton();
        soluongField = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        showErr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        suajButton.setBackground(new java.awt.Color(102, 255, 102));
        suajButton.setForeground(new java.awt.Color(255, 255, 255));
        suajButton.setText("Sửa");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 123, 236));
        jLabel2.setText("QUẢN LÝ SẢN PHẨM");

        themjButton.setBackground(new java.awt.Color(192, 192, 192));
        themjButton.setText("Thêm");
        themjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themjButtonActionPerformed(evt);
            }
        });

        searchFieldProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldProductActionPerformed(evt);
            }
        });
        searchFieldProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldProductKeyReleased(evt);
            }
        });

        tenspField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tenspFieldKeyReleased(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá Bán", "GIá Mua", "Giám Giãm", "Số Lượng"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        giamuaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giamuaFieldKeyReleased(evt);
            }
        });

        idspField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        giagiamField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giagiamFieldKeyReleased(evt);
            }
        });

        giabanField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giabanFieldKeyReleased(evt);
            }
        });

        xoajButton.setBackground(new java.awt.Color(255, 0, 0));
        xoajButton.setForeground(new java.awt.Color(255, 255, 255));
        xoajButton.setText("Xóa");
        xoajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoajButtonActionPerformed(evt);
            }
        });

        soluongField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                soluongFieldKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tìm kiếm");

        showErr.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Mã sản phẩm");

        jLabel3.setText("Tên sản phẩm");

        jLabel4.setText("Giá bán");

        jLabel5.setText("Giá mua");

        jLabel6.setText("Giảm giá");

        jLabel8.setText("Số lượng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(364, 364, 364))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(idspField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tenspField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(giabanField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(giamuaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchFieldProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(giagiamField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(soluongField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showErr, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(themjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(giagiamField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idspField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tenspField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soluongField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giabanField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showErr, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(giamuaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFieldProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked

        int row = productTable.getSelectedRow();
        Integer maSP = (Integer) tableModal.getValueAt(row, 0);
        String tenSP = (String) tableModal.getValueAt(row, 1);
        Float giaBan = (Float) tableModal.getValueAt(row, 2);
        Float giaMua = (Float) tableModal.getValueAt(row, 3);
        Float giamGia = (Float) tableModal.getValueAt(row, 4);
        Integer soLuong = (Integer) tableModal.getValueAt(row, 5);

        idspField.setText("" + maSP);
        tenspField.setText(tenSP);
        giabanField.setText("" + giaBan);
        giamuaField.setText("" + giaMua);
        giagiamField.setText("" + giamGia);
        soluongField.setText("" + soLuong);

        idspField.setEnabled(false);
        themjButton.setEnabled(false);
        suajButton.setEnabled(true);
        xoajButton.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_productTableMouseClicked

    private void themjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themjButtonActionPerformed
        //
        try {
            Integer productId = Integer.parseInt(idspField.getText().trim());
            String productName = tenspField.getText().trim();
            String price = giabanField.getText().trim();
            String purchasePrice = giamuaField.getText().trim();
            String discount = giagiamField.getText().trim();
            String quantity = soluongField.getText().trim();

            if (productName.compareTo("") == 0) {
                showErr.setText("Vui lòng nhập tên sản phẩm");
                return;
            }
            String isNumbber = "^\\d+$";
            Pattern patternNumber = Pattern.compile(isNumbber);
            if (price.compareTo("") == 0) {
                showErr.setText("Vui lòng nhập giá mua");
                return;
            }
            Matcher matchPrice = patternNumber.matcher(price);
            if(!matchPrice.matches()){
                showErr.setText("Giá mua chỉ bao gồm số");
                return;
            }
            if (purchasePrice.compareTo("") == 0) {
                showErr.setText("Vui lòng nhập giá bán");
                return;
            }
            Matcher matchPurP = patternNumber.matcher(price);
            if(!matchPurP.matches()){
                showErr.setText("Giá mua chỉ bao gồm số");
                return;
            }
            if (discount.compareTo("") == 0) {
                showErr.setText("Vui lòng nhập giảm giá");
                return;
            }
            Matcher matchDiscount = patternNumber.matcher(price);
            if(!matchDiscount.matches()){
                showErr.setText("Giảm giá chỉ bao gồm số");
                return;
            }
            if (quantity.compareTo("") == 0) {
                showErr.setText("Vui lòng nhập số lượng");
                return;
            }
            Matcher matchQuantity = patternNumber.matcher(price);
            if(!matchQuantity.matches()){
                showErr.setText("Giá mua chỉ bao gồm số");
                return;
            }

            showErr.setText(null);
            product product = new product(productId, productName, 
                                   Float.parseFloat(price), Float.parseFloat(purchasePrice), 
                                   Float.parseFloat(discount), Integer.parseInt(quantity));

            FileController.writeProductToFile("product.txt", product);
            tableModal.addRow(new Object[]{
                product.getmaSP(), product.getTenSP(), product.getGiaBan(), product.getGiaMua(), product.getGiamGia(), product.getSoLuong()
            });
            listProduct.add(product);
            setTextNull("Thêm sản phẩm mới thành công", "Thêm mới sản phẩm");
            increaseProductId();
            tenspField.requestFocus();
        } catch (NumberFormatException e) {
            showErr.setText("Vui lòng lòng nhập đầy đủ thông tin");
        } catch (Exception e) {
            showErr.setText("Vui lòng lòng nhập đầy đủ thông tin");
            showErr.setText(e.toString());
        }
    }//GEN-LAST:event_themjButtonActionPerformed

    private void suajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suajButtonActionPerformed
        // TODO add your handling code here:
        Integer maSP = Integer.parseInt(idspField.getText().trim());
        String tenSP = tenspField.getText().trim();
        Float giaBan = Float.parseFloat(giabanField.getText().trim());
        Float giaMua = Float.parseFloat(giamuaField.getText().trim());
        Float giamGia = Float.parseFloat(giagiamField.getText().trim());
        Integer soLuong = Integer.parseInt(soluongField.getText().trim());
        int row = productTable.getSelectedRow();

        // update data in file
        product product = new product(maSP, tenSP, giaBan, giaMua, giamGia, soLuong);
        listProduct.set(row, product);
        file.updateListProductToFile("product.txt", listProduct);

        //update UI
        productTable.setValueAt(maSP, row, 0);
        productTable.setValueAt(tenSP, row, 1);
        productTable.setValueAt(giaBan, row, 2);
        productTable.setValueAt(giaMua, row, 3);
        productTable.setValueAt(giamGia, row, 4);
        productTable.setValueAt(soLuong, row, 5);

        suajButton.setEnabled(false);
        xoajButton.setEnabled(false);
        themjButton.setEnabled(true);
        setTextNull("Cập nhật thông tin thành công", "Cập nhật sản phẩm");
        increaseProductId();
    }//GEN-LAST:event_suajButtonActionPerformed

    private void xoajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoajButtonActionPerformed
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION, 0);
        if (answer == 0) {
            int row = productTable.getSelectedRow();
            tableModal.removeRow(row);

            listProduct.remove(row);
            FileController.updateListProductToFile("product.txt", listProduct);

            suajButton.setEnabled(false);
            xoajButton.setEnabled(false);
            themjButton.setEnabled(true);
            setTextNull("Xóa thành công", "Xóa sản phẩm");
            increaseProductId();
            tenspField.requestFocus();
        }
    }//GEN-LAST:event_xoajButtonActionPerformed

    private void setTextNull(String title, String subTitle) {
        idspField.setText("");
        tenspField.setText("");
        giabanField.setText("");
        giamuaField.setText("");
        giagiamField.setText("");
        soluongField.setText("");
        JOptionPane.showConfirmDialog(null, title, subTitle, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
    private void searchFieldProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldProductKeyReleased
      // utils.filterByTable(searchFieldProduct, tableModal, productTable);
    }//GEN-LAST:event_searchFieldProductKeyReleased

    private void giamuaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giamuaFieldKeyReleased
        // TODO add your handling code here:
        validateField("price", giamuaField.getText(), "Giá mua");
    }//GEN-LAST:event_giamuaFieldKeyReleased

    private void giabanFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giabanFieldKeyReleased
        // TODO add your handling code here:purchasePrice
        validateField("purchasePrice", giabanField.getText(), "Giá bán");
    }//GEN-LAST:event_giabanFieldKeyReleased

    private void giagiamFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giagiamFieldKeyReleased
        // TODO add your handling code here:
        validateField("discount", giagiamField.getText(), "Giảm giá");
    }//GEN-LAST:event_giagiamFieldKeyReleased

    private void soluongFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soluongFieldKeyReleased
        // TODO add your handling code here:
        validateField("quantity", soluongField.getText(), "Số lượng");
    }//GEN-LAST:event_soluongFieldKeyReleased

    private void tenspFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenspFieldKeyReleased
        // TODO add your handling code here:
        validateField("productName", tenspField.getText(), "");
    }//GEN-LAST:event_tenspFieldKeyReleased

    private void searchFieldProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField giabanField;
    private java.awt.TextField giagiamField;
    private java.awt.TextField giamuaField;
    private java.awt.TextField idspField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField searchFieldProduct;
    private javax.swing.JLabel showErr;
    private java.awt.TextField soluongField;
    private javax.swing.JButton suajButton;
    private java.awt.TextField tenspField;
    private javax.swing.JButton themjButton;
    private javax.swing.JButton xoajButton;
    // End of variables declaration//GEN-END:variables

    private void validateField(String name, String value, String displayText){
        switch(name){
            case "productName":
                if(value.compareTo("")==0){
                showErr.setText("Vui lòng nhập tên sản phẩm");
                }
                showErr.setText(null);
                break;
            case "price":
            case "purchasePrice":
            case "discount":
            case "quantity": 
                String isNumbber = "^\\d+$";
                Pattern patternNumber = Pattern.compile(isNumbber);
                Matcher matchNumber = patternNumber.matcher(value);
                if(value.compareTo("")==0){
                    showErr.setText("Vui lòng nhập " + displayText);
                }
                if(!matchNumber.matches()){
                    showErr.setText(displayText + " chỉ bao gồm số");
                    return;
                }
                showErr.setText(null);
                break;
            default: 
                break;
        }
    }
}
