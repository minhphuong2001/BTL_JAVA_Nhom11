/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.FileController;
import controllers.Utils;
import static controllers.Utils.iconimage;
import static controllers.Utils.rightRender;
import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
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
    static Utils utils;
    static DecimalFormat numberFormat = new DecimalFormat( "###,###,###" );
    static DecimalFormat number = new DecimalFormat( "#########" );

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
                item.getmaSP(), item.getTenSP(), 
                numberFormat.format(item.getGiaBan()), numberFormat.format(item.getGiaMua()), 
                numberFormat.format(item.getGiamGia())+"%", item.getSoLuong()
            });
        }
        rightRender(productTable,2);
        rightRender(productTable,3);
        rightRender(productTable,4);
        rightRender(productTable,5);
        
        suajButton.setEnabled(false);
        xoajButton.setEnabled(false);
        increaseProductId();
        utils.setBgButtonNull(themjButton, suajButton, xoajButton);
        
        ImageIcon searchIcon=iconimage(40,40,"src/icons/search.png");
        searchLabel.setIcon(searchIcon);
        ImageIcon deleteIcon=iconimage(25,25,"src/icons/bin2.png");
        xoajButton.setIcon(deleteIcon);
        ImageIcon updateIcon=iconimage(25,25,"src/icons/update.png");
        suajButton.setIcon(updateIcon);
        ImageIcon addIcon=iconimage(25,25,"src/icons/add-product.png");
        themjButton.setIcon(addIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suajButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        themjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        giamuaField = new java.awt.TextField();
        idspField = new java.awt.TextField();
        giagiamField = new java.awt.TextField();
        giabanField = new java.awt.TextField();
        xoajButton = new javax.swing.JButton();
        soluongField = new java.awt.TextField();
        searchLabel = new javax.swing.JLabel();
        showErr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchField = new java.awt.TextField();
        tenspField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        suajButton.setBackground(new java.awt.Color(102, 255, 102));
        suajButton.setForeground(new java.awt.Color(255, 255, 255));
        suajButton.setText("S???a");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });
        add(suajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 130, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 123, 236));
        jLabel2.setText("QU???N L?? S???N PH???M");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        themjButton.setBackground(new java.awt.Color(75, 123, 236));
        themjButton.setText("Th??m");
        themjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themjButtonActionPerformed(evt);
            }
        });
        add(themjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 130, 50));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? S???n Ph???m", "T??n S???n Ph???m", "Gi?? B??n", "GI?? Mua", "Gi???m Gi??", "S??? L?????ng"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 880, 320));

        giamuaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giamuaFieldKeyReleased(evt);
            }
        });
        add(giamuaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 275, 35));

        idspField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(idspField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 275, 35));

        giagiamField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giagiamFieldKeyReleased(evt);
            }
        });
        add(giagiamField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 275, 35));

        giabanField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        giabanField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giabanFieldKeyReleased(evt);
            }
        });
        add(giabanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 275, 35));

        xoajButton.setBackground(new java.awt.Color(204, 37, 31));
        xoajButton.setForeground(new java.awt.Color(255, 255, 255));
        xoajButton.setText("X??a");
        xoajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoajButtonActionPerformed(evt);
            }
        });
        add(xoajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 130, 50));

        soluongField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                soluongFieldKeyReleased(evt);
            }
        });
        add(soluongField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 275, 35));

        searchLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 60, 40));

        showErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showErr.setForeground(new java.awt.Color(204, 0, 51));
        add(showErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 720, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("M?? s???n ph???m");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("T??n s???n ph???m");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gi?? b??n");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Gi?? mua");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gi???m gi??");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("S??? l?????ng");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        searchField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 280, 35));

        tenspField.setPreferredSize(new java.awt.Dimension(6, 35));
        tenspField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenspFieldActionPerformed(evt);
            }
        });
        add(tenspField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked

        int row = productTable.getSelectedRow();        
        Integer maSP = (Integer) tableModal.getValueAt(row, 0);
        String tenSP = (String) tableModal.getValueAt(row, 1);
        Float giaBan = listProduct.get(row).getGiaBan();
        Float giaMua = listProduct.get(row).getGiaMua();
        Float giamGia = listProduct.get(row).getGiamGia();
        Integer soLuong = (Integer) tableModal.getValueAt(row, 5);

        idspField.setText("" + maSP);
        tenspField.setText(tenSP);
        giabanField.setText("" + number.format(giaBan));
        giamuaField.setText("" + number.format(giaMua));
        giagiamField.setText("" + number.format(giamGia));
        soluongField.setText("" + soLuong);

        idspField.setEnabled(false);
        themjButton.setEnabled(false);
        suajButton.setEnabled(true);
        xoajButton.setEnabled(true);
        utils.setBgButtonHasColor(themjButton, suajButton, xoajButton);
    }//GEN-LAST:event_productTableMouseClicked

    private void themjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themjButtonActionPerformed
        
        try {
            Integer productId = Integer.parseInt(idspField.getText().trim());
            String productName = tenspField.getText().trim();
            String price = giabanField.getText().trim();
            String purchasePrice = giamuaField.getText().trim();
            String discount = giagiamField.getText().trim();
            String quantity = soluongField.getText().trim();

            if (productName.compareTo("") == 0) {
                showErr.setText("Vui l??ng nh???p t??n s???n ph???m");
                return;
            }

            String isNumbber = "^\\d+$";
            Pattern patternNumber = Pattern.compile(isNumbber);
            if (price.compareTo("") == 0) {
                showErr.setText("Vui l??ng nh???p gi?? mua");
                return;
            }
            Matcher matchPrice = patternNumber.matcher(price);
            if(!matchPrice.matches()){
                showErr.setText("Gi?? mua ch??? bao g???m s???");
                return;
            }
            if (purchasePrice.compareTo("") == 0) {
                showErr.setText("Vui l??ng nh???p gi?? b??n");
                return;
            }
            Matcher matchPurP = patternNumber.matcher(price);
            if(!matchPurP.matches()){
                showErr.setText("Gi?? mua ch??? bao g???m s???");
                return;
            }
            if (discount.compareTo("") == 0) {
                showErr.setText("Vui l??ng nh???p gi???m gi??");
                return;
            }
            Matcher matchDiscount = patternNumber.matcher(price);
            if(!matchDiscount.matches()){
                showErr.setText("Gi???m gi?? ch??? bao g???m s???");
                return;
            }
            if (quantity.compareTo("") == 0) {
                showErr.setText("Vui l??ng nh???p s??? l?????ng");
                return;
            }
            Matcher matchQuantity = patternNumber.matcher(price);
            if(!matchQuantity.matches()){
                showErr.setText("Gi?? mua ch??? bao g???m s???");
                return;
            }

            showErr.setText(null);
            product product = new product(productId, productName, 
                                   Float.parseFloat(price), Float.parseFloat(purchasePrice), 
                                   Float.parseFloat(discount), Integer.parseInt(quantity));

            FileController.writeProductToFile("product.txt", product);
            tableModal.addRow(new Object[]{
                product.getmaSP(), product.getTenSP(), numberFormat.format(product.getGiaBan()), numberFormat.format(product.getGiaMua()), 
                product.getGiamGia() + "%", product.getSoLuong()
            });
            listProduct.add(product);
            setTextNull("Th??m s???n ph???m m???i th??nh c??ng", "Th??m m???i s???n ph???m");
            increaseProductId();
            tenspField.requestFocus();
        } catch (NumberFormatException e) {
            showErr.setText("Vui l??ng l??ng nh???p ?????y ????? th??ng tin");
        } catch (Exception e) {
            showErr.setText("Vui l??ng l??ng nh???p ?????y ????? th??ng tin");
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
        productTable.setValueAt(numberFormat.format(giaBan), row, 2);
        productTable.setValueAt(numberFormat.format(giaMua), row, 3);
        productTable.setValueAt(numberFormat.format(giamGia) + "%", row, 4);
        productTable.setValueAt(soLuong, row, 5);

        suajButton.setEnabled(false);
        xoajButton.setEnabled(false);
        themjButton.setEnabled(true);
        setTextNull("C???p nh???t th??ng tin th??nh c??ng", "C???p nh???t s???n ph???m");
        increaseProductId();
        utils.setBgButtonNull(themjButton, suajButton, xoajButton);
    }//GEN-LAST:event_suajButtonActionPerformed

    private void xoajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoajButtonActionPerformed
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "B???n c?? ch???c mu???n x??a s???n ph???m n??y?", "X??c nh???n", JOptionPane.YES_NO_OPTION, 0);
        if (answer == 0) {
            int row = productTable.getSelectedRow();
            tableModal.removeRow(row);

            listProduct.remove(row);
            FileController.updateListProductToFile("product.txt", listProduct);

            suajButton.setEnabled(false);
            xoajButton.setEnabled(false);
            themjButton.setEnabled(true);
            setTextNull("X??a th??nh c??ng", "X??a s???n ph???m");
            increaseProductId();
            tenspField.requestFocus();
        }
        utils.setBgButtonNull(themjButton, suajButton, xoajButton);
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
    private void giamuaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giamuaFieldKeyReleased
        // TODO add your handling code here:
        validateField("price", giamuaField, "Gi?? mua");
    }//GEN-LAST:event_giamuaFieldKeyReleased

    private void giabanFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giabanFieldKeyReleased
        // TODO add your handling code here:purchasePrice
        validateField("purchasePrice", giabanField, "Gi?? b??n");
    }//GEN-LAST:event_giabanFieldKeyReleased

    private void giagiamFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giagiamFieldKeyReleased
        // TODO add your handling code here:
        validateField("discount", giagiamField, "Gi???m gi??");
    }//GEN-LAST:event_giagiamFieldKeyReleased

    private void soluongFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soluongFieldKeyReleased
        // TODO add your handling code here:
        validateField("quantity", soluongField, "S??? l?????ng");
    }//GEN-LAST:event_soluongFieldKeyReleased

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO: filter by account table
        utils.filterByTable(searchField, tableModal, productTable);
    }//GEN-LAST:event_searchFieldKeyReleased

    private void tenspFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenspFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenspFieldActionPerformed


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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    private java.awt.TextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel showErr;
    private java.awt.TextField soluongField;
    private javax.swing.JButton suajButton;
    private javax.swing.JTextField tenspField;
    private javax.swing.JButton themjButton;
    private javax.swing.JButton xoajButton;
    // End of variables declaration//GEN-END:variables

    private void validateField(String name, TextField value, String displayText){
        switch(name){
            case "productName":
                if(value.getText().compareTo("")==0){
                    showErr.setText("Vui l??ng nh???p t??n s???n ph???m");
                }
                showErr.setText(null);
                break;
            case "price":
            case "purchasePrice":
            case "discount":
            case "quantity": 
                String isNumbber = "^\\d+$";
                Pattern patternNumber = Pattern.compile(isNumbber);
                Matcher matchNumber = patternNumber.matcher(value.getText());
                if(value.getText().compareTo("")==0){
                    showErr.setText("Vui l??ng nh???p " + displayText);
                }
                if(!matchNumber.matches()){
                    showErr.setText(displayText + " ch??? bao g???m s???");
                    return;
                }
                showErr.setText(null);
                break;
            default: 
                break;
        }
    }
}
