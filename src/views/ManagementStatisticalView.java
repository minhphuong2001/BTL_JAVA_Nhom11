/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.FileController;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Order;
import models.OrderDetail;
import models.product;
import static views.ManagementCustomerView.model;

/**
 *
 * @author ADMIN
 */
public class ManagementStatisticalView extends javax.swing.JPanel {

    /**
     * Creates new form ManagementStatisticalView
     */
    
    static List<OrderDetail> orderDetails = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();
    static List<product> products = new ArrayList<>();
    static DecimalFormat numberFormat = new DecimalFormat( "###,###,###" );
    
    public ManagementStatisticalView() {
        initComponents();
        List<OrderDetail> orderDetailstest = new ArrayList<>();
        model = (DefaultTableModel) tblReport.getModel();
        orderDetails = FileController.readOrderDetailFromFile("orderDetail.txt");
        orders = FileController.readOrderFromFile("order.txt");
        products = FileController.readProductFromFile("product.txt");
        
  }   

    public void showTable(List<OrderDetail> orDetail)
    {
        List<Integer> listProductID = new ArrayList<>();
        List<String> listProductName = new ArrayList<>();
        List<Float> listProductPrice = new ArrayList<>();
        List<Integer> listProductSold = new ArrayList<>();
        List<Float> listProductRevenue = new ArrayList<>();
        Float total = 0f;
        String choiceFilter = cbxFilter.getSelectedItem().toString();
                
        System.out.println("views.ManagementStatisticalView.showTable()"+ choiceFilter);
        
        for(int i=0; i<orDetail.size(); i++)
            if(!listProductID.contains(orDetail.get(i).getProductID())) 
                listProductID.add(orDetail.get(i).getProductID());
        
        Collections.sort(listProductID);
        
        for(int i=0; i<listProductID.size(); i++)
            for(int j=0; j<products.size(); j++)
                if(products.get(j).getmaSP() == listProductID.get(i)) 
                {
                    listProductName.add(products.get(j).getTenSP());
                    listProductPrice.add(products.get(j).getGiaBan());
                    break;
                }
        
        for(int i=0; i<listProductID.size(); i++)
        {
            Integer totalQuantity = 0;
            Float totalRevenue = 0f;
            for(int j=0; j<orDetail.size(); j++)
                if(orDetail.get(j).getProductID() == listProductID.get(i)) 
                {
                    totalQuantity += orDetail.get(j).getQuantity();
                    totalRevenue += orDetail.get(j).money();        
                }
            total += totalRevenue;
            listProductSold.add(totalQuantity);
            listProductRevenue.add(totalRevenue);
        }
        switch(choiceFilter)
        {
            case "Mã SP":
            {
                model.setRowCount(0); 
                for (int i=0; i<listProductID.size(); i++) 
                    model.addRow(new Object[]{
                        listProductID.get(i), listProductName.get(i), listProductSold.get(i), numberFormat.format(listProductPrice.get(i)) , numberFormat.format(listProductRevenue.get(i))
                    });  
                break;
            }
            case "Doanh thu":
            {          
                List<Integer> index = new ArrayList<>();
                for(int i=0; i<listProductRevenue.size();i++)
                {
                    index.add(i);
                }
                for(int i=0; i<listProductRevenue.size()-1;i++)
                {
                    for(int j=i+1; j<listProductRevenue.size();j++)
                        if(listProductRevenue.get(i) > listProductRevenue.get(j))
                        {
                            Float tg = listProductRevenue.get(i);
                            listProductRevenue.set(i, listProductRevenue.get(j));
                            listProductRevenue.set(j, tg);        
                            
                            Integer tg1 = index.get(i);
                            index.set(i, index.get(j));
                            index.set(j, tg1);  
                        }
                }
                
                model.setRowCount(0); 
                for (int i=0; i<listProductRevenue.size(); i++) 
                    model.addRow(new Object[]{
                        listProductID.get(index.get(i)), listProductName.get(index.get(i)), listProductSold.get(index.get(i)), numberFormat.format(listProductPrice.get(index.get(i))) , numberFormat.format(listProductRevenue.get(i))
                    });  
                break;
            }
            case "Số lượng":
            {
                List<Integer> index = new ArrayList<>();
                for(int i=0; i<listProductRevenue.size();i++)
                {
                    index.add(i);
                }
                for(int i=0; i<listProductSold.size()-1;i++)
                {
                    for(int j=i+1; j<listProductSold.size();j++)
                        if(listProductSold.get(i) > listProductSold.get(j))
                        {
                            Integer tg = listProductSold.get(i);
                            listProductSold.set(i, listProductSold.get(j));
                            listProductSold.set(j, tg);        
                            
                            Integer tg1 = index.get(i);
                            index.set(i, index.get(j));
                            index.set(j, tg1);  
                        }
                }
                
                model.setRowCount(0); 
                for (int i=0; i<listProductSold.size(); i++) 
                    model.addRow(new Object[]{
                        listProductID.get(index.get(i)), listProductName.get(index.get(i)), listProductSold.get(i), numberFormat.format(listProductPrice.get(index.get(i))) , numberFormat.format(listProductRevenue.get(index.get(i)))
                    });  
                break;
            }
        }
         
        
        tblReport.setAutoCreateRowSorter(true);
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        tblReport.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblReport.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblReport.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblReport.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        
        String totalFormat = numberFormat.format(total);
        labTotal.setText(totalFormat + " VND");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        inpMonth = new com.toedter.calendar.JMonthChooser();
        inpYear = new com.toedter.calendar.JYearChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        labDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labTotal = new javax.swing.JLabel();
        cbxFilter = new javax.swing.JComboBox<>();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 123, 236));
        jLabel2.setText("THỐNG KÊ BÁO CÁO");

        inpMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inpMonth.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inpMonthPropertyChange(evt);
            }
        });

        inpYear.setFocusable(false);
        inpYear.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inpYearPropertyChange(evt);
            }
        });

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số Lượng", "Giá Bán", "Doanh Thu"
            }
        ));
        jScrollPane1.setViewportView(tblReport);
        if (tblReport.getColumnModel().getColumnCount() > 0) {
            tblReport.getColumnModel().getColumn(0).setMinWidth(100);
            tblReport.getColumnModel().getColumn(0).setMaxWidth(150);
            tblReport.getColumnModel().getColumn(1).setMinWidth(200);
            tblReport.getColumnModel().getColumn(2).setMinWidth(150);
            tblReport.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        labDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tổng:");

        labTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        cbxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã SP", "Số lượng", "Doanh thu" }));
        cbxFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(labTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labDate, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(inpYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inpYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inpMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cbxFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labDate, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, labTotal});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inpMonth, inpYear});

    }// </editor-fold>//GEN-END:initComponents

    private void inpMonthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inpMonthPropertyChange
        // TODO add your handling code here:
        filter();
        
    }//GEN-LAST:event_inpMonthPropertyChange

    private void inpYearPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inpYearPropertyChange
        // TODO add your handling code here:
        filter();
    }//GEN-LAST:event_inpYearPropertyChange

    private void cbxFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFilterActionPerformed
        // TODO add your handling code here:
        filter();
    }//GEN-LAST:event_cbxFilterActionPerformed

    public void filter()
    {
        Integer month = inpMonth.getMonth() + 1;
        Integer year = inpYear.getYear();

        labDate.setText("Tháng "+(month)+" Năm " +(year));
        List<OrderDetail> listByDate = new ArrayList<>();
        List<String> listDate = new ArrayList<>();
        
        for(int i=0; i<orders.size(); i++)
        {
            Integer orderMonth = Integer.parseInt(orders.get(i).getDate().substring(3, 5));
            Integer orderYear = Integer.parseInt(orders.get(i).getDate().substring(6));
            
            if(orderMonth.equals(month) && orderYear.equals(year)) 
                for(int j=0; j<orderDetails.size(); j++)
                    if(orders.get(i).getOrderID() == orderDetails.get(j).getOrderID())
                        listByDate.add(orderDetails.get(j));                       
        }        
        showTable(listByDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxFilter;
    private com.toedter.calendar.JMonthChooser inpMonth;
    private com.toedter.calendar.JYearChooser inpYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labTotal;
    private javax.swing.JTable tblReport;
    // End of variables declaration//GEN-END:variables
}
