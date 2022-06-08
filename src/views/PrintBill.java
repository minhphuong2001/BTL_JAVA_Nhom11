/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.FileController;
import static controllers.Utils.iconimage;
import static controllers.Utils.rightRender;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import models.Customer;
import models.Order;
import models.OrderDetail;
import models.product;
import static views.ManagementReceptView.fileController;
import static views.ManagementReceptView.modelCus;
import static views.ManagementReceptView.orderDetails;
import static views.ManagementReceptView.products;

/**
 *
 * @author ADMIN
 */
public class PrintBill extends javax.swing.JFrame {

    /**
     * Creates new form PrintBill
     */
    static FileController fileController;
    static List<Customer> listCustomer = new ArrayList<>();
    static List<product> listProduct = new ArrayList<>();
    static List<Order> listOrder = new ArrayList<>();
    static List<OrderDetail> listOrderDetail = new ArrayList<>();
    static DefaultTableModel tableModel;
    static DecimalFormat numberFormat = new DecimalFormat( "###,###,###" );

    public PrintBill() {}

    public PrintBill(String orderNumber, String customerID, String date) {
        initComponents();
        ImageIcon printIcon=iconimage(25,25,"src/icons/print.png");
        btnPrint.setIcon(printIcon);

        tableModel=(DefaultTableModel) detailTable.getModel();

        listOrder = fileController.readOrderFromFile("order.txt");
        listOrderDetail = fileController.readOrderDetailFromFile("orderDetail.txt");
        listProduct = fileController.readProductFromFile("product.txt");
        listCustomer = fileController.readCustomerFromFile("customer.txt");

        orderDetailNumber.setText(orderNumber);
        this.date.setText(date);

        for(Customer item : listCustomer) {
            if(item.getCustomerId().toString().equals(customerID)) {
                customerName.setText(item.getCustomerName());
                phoneNumber.setText(item.getCustomerPhone());
                points.setText(item.getAccumulatePoints().toString());
            }
        }

        Float totalBefore = 0f, totalDiscount = 0f;

        for(OrderDetail item : listOrderDetail) {
            if(item.getOrderID().toString().equals(orderNumber)) {
                for(product item2 : listProduct) {
                    if(item.getProductID().equals(item2.getmaSP())) {
                        tableModel.addRow(new Object[]{
                           item2.getTenSP(), item.getQuantity(), item2.getGiaBan(), item2.getGiamGia() + "%", item.money()
                       });
                        totalBefore += item.getQuantity()*item2.getGiaBan();
                        totalDiscount += item.money();
                    }
                }
            }
        }

        totalProduct.setText(numberFormat.format(totalBefore));
        totalMoney.setText(numberFormat.format(totalDiscount));
        promotion.setText(numberFormat.format(totalBefore - totalDiscount));
        
         ImageIcon closeIcon=iconimage(40,40,"src/icons/return.png");
        closeBtn.setIcon(closeIcon);
        rightRender(detailTable,2);
        rightRender(detailTable,4);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        orderDetailNumber = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        points = new javax.swing.JLabel();
        totalProduct = new javax.swing.JLabel();
        promotion = new javax.swing.JLabel();
        totalMoney = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÓA ĐƠN");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Địa chỉ: Số 8, Nguyên Xá, Minh Khai, Bắc Từ Liêm, Hà Nội");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Điện thoại: 0389247621");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 129, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 164, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("PHIẾU THANH TOÁN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Khách hàng: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số hóa đơn: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Điện thoại: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Điểm tích lũy: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        detailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hàng", "Số lượng", "Đơn giá", "Khuyến mãi", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(detailTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 430, 480, 178));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tổng tiền hàng: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Tổng phải trả");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 730, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Khuyễn mãi theo đơn: ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, -1, -1));

        orderDetailNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(orderDetailNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        customerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        phoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        points.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(points, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        totalProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(totalProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, -1, -1));

        promotion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(promotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, -1, -1));

        totalMoney.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(totalMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 730, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 52)); // NOI18N
        jLabel10.setText("MINASHOP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 164, -1, -1));

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrint.setText("IN");
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 780, -1, -1));

        closeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 40, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed

        this.dispose();

    }//GEN-LAST:event_closeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel date;
    private javax.swing.JTable detailTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orderDetailNumber;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel points;
    private javax.swing.JLabel promotion;
    private javax.swing.JLabel totalMoney;
    private javax.swing.JLabel totalProduct;
    // End of variables declaration//GEN-END:variables
}
