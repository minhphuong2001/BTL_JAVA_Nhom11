/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.FileController;
import controllers.Utils;
import static controllers.Utils.iconimage;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Account;
import static views.ManagementEmployeeView.employees;

/**
 *
 * @author Minh Phuong Do
 */
public class ManagementAccountView extends javax.swing.JPanel {

    /**
     * Creates new form ManagementAccountView
     */
    static DefaultTableModel tableModal;
    static List<Account> listAcc = new ArrayList<Account>();
    static FileController fileController;
    static Utils utils;

    Integer accountID;
    public void increaseIndex(){
        if(listAcc.size() == 0){
            accountID = 0;
        } else {
            accountID = listAcc.get(listAcc.size()-1).getId()+1;
        }
        idField.setEnabled(false);
        idField.setText(accountID.toString());
    }

    public ManagementAccountView() {
        initComponents();
        tableModal = (DefaultTableModel) accountTable.getModel();
        listAcc = fileController.readAccountFromFile("account.txt");
        for(Account item : listAcc){
            tableModal.addRow(new Object[]{
                item.getId(), item.getUsername(), item.getPassword(), item.getRole()
            });
        }
        editBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        utils.setBgButtonNull(addBtn, editBtn, deleteBtn);
        increaseIndex();
        
        ImageIcon searchIcon=iconimage(40,40,"src/icons/search.png");
        searchLabel.setIcon(searchIcon);
        ImageIcon deleteIcon=iconimage(25,25,"src/icons/bin2.png");
        deleteBtn.setIcon(deleteIcon);
        ImageIcon updateIcon=iconimage(25,25,"src/icons/update.png");
        editBtn.setIcon(updateIcon);
        ImageIcon addIcon=iconimage(25,25,"src/icons/add-user.png");
        addBtn.setIcon(addIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        roleLabel = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        roleComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        showError = new javax.swing.JLabel();
        searchField = new java.awt.TextField();
        searchLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(985, 670));
        setRequestFocusEnabled(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(75, 123, 236));
        titleLabel.setText("QUẢN LÝ TÀI KHOẢN");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 310, 52));

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabel.setText("ID");
        add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 275, 35));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameLabel.setText("Tên người dùng");
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 185, -1, -1));

        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameFieldKeyReleased(evt);
            }
        });
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 175, 275, 35));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setText("Mật khẩu");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 275, 35));

        addBtn.setBackground(new java.awt.Color(75, 123, 236));
        addBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Thêm");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 130, 50));

        roleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roleLabel.setText("Vai trò");
        add(roleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 185, -1, -1));

        editBtn.setBackground(new java.awt.Color(102, 255, 102));
        editBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editBtn.setText("Cập nhật");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 130, 50));

        roleComboBox.setEditable(true);
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        roleComboBox.setMinimumSize(new java.awt.Dimension(64, 40));
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 175, 275, 35));

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tài khoản", "Mật khẩu", "Vai Trò"
            }
        ));
        accountTable.setRowHeight(20);
        accountTable.setRowSelectionAllowed(false);
        accountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accountTable);
        if (accountTable.getColumnModel().getColumnCount() > 0) {
            accountTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            accountTable.getColumnModel().getColumn(1).setPreferredWidth(80);
            accountTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 378, 870, 300));

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Xóa");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 130, 50));

        showError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showError.setForeground(new java.awt.Color(204, 0, 51));
        add(showError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 730, 40));

        searchField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 310, 310, 40));
        add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 60, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyReleased
        validateField("username", usernameField.getText().trim());
    }//GEN-LAST:event_usernameFieldKeyReleased

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        // TODO add your handling code here:
        validateField("password", passwordField.getText().trim());
    }//GEN-LAST:event_passwordFieldKeyReleased

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        try {
            Integer id = Integer.parseInt(idField.getText().trim());
            String username = usernameField.getText().trim();
            String password = passwordField.getText().trim();
            String role = roleComboBox.getSelectedItem().toString().toLowerCase().trim();

            if(username.compareTo("") == 0){
                showError.setText("Vui lòng nhập tên");
                return;
            }
            String regexUsername = "^[a-zA-Z0-9]{0,30}$";
            Pattern pattern = Pattern.compile(regexUsername);
            Matcher match = pattern.matcher(username);

            if(!match.matches()){
                showError.setText("Tên người dùng không bao gồm các kí tự đặc biệt");
                return;
            }
            if(username.length() < 6){
                showError.setText("Tên người dùng tối thiểu 6 kí tự");
                return;
            }

            if(password.compareTo("") == 0){
                showError.setText("Vui lòng nhập mật khẩu");
                return;
            }
            if(password.length() < 6){
                showError.setText("Mật khẩu phải lớn hơn hoặc bằng 6 kí tự");
                return;
            }

            if(role.compareTo("") == 0){
                showError.setText("Vui lòng nhập chọn vai trò");
                return;
            }
            showError.setText(null);

            Account account = new Account(id, username, password, role);
            boolean check = false;
            for(Account item : listAcc) {
                if(username.toString().compareTo(item.getUsername().toString()) == 0) {
                    showError.setText("Tên người dùng không được phép trùng");
                    check = true;
                }
            }

            if(check == false) {
                fileController.writeAccountToFile("account.txt", account);
                tableModal.addRow(new Object[]{
                    account.getId(), account.getUsername(), account.getPassword(), account.getRole()
                });
                listAcc.add(account);
                setTextNull("Thêm tài khoản mới thành công", "Thêm mới tài khoản");
                increaseIndex();
                usernameField.requestFocus();
            }
        } catch(NumberFormatException e) {
            showError.setText("Vui lòng lòng nhập đầy đủ thông tin");
        } catch (Exception e) {
            showError.setText("Vui lòng lòng nhập đầy đủ thông tin");
            showError.setText(e.toString());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        Integer id = Integer.parseInt(idField.getText().trim());
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();
        String role = roleComboBox.getSelectedItem().toString().toLowerCase();
        int row = accountTable.getSelectedRow();

        // update data in file
        Account account = new Account(id, username, password, role);
        listAcc.set(row, account);
        FileController.updateListAccountToFile("account.txt", listAcc);

        //update UI
        accountTable.setValueAt(id, row, 0);
        accountTable.setValueAt(username, row, 1);
        accountTable.setValueAt(password, row, 2);
        accountTable.setValueAt(role, row, 3);

        editBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        addBtn.setEnabled(true);
        utils.setBgButtonNull(addBtn, editBtn, deleteBtn);
        setTextNull("Cập nhật thông tin thành công", "Cập nhật tài khoản");
        increaseIndex();
        usernameField.requestFocus();
    }//GEN-LAST:event_editBtnActionPerformed

    private void accountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTableMouseClicked
        // TODO add your handling code here:
        int row = accountTable.getSelectedRow();
        int id = (int) tableModal.getValueAt(row, 0);
        String username = (String) tableModal.getValueAt(row, 1);
        String password = (String) tableModal.getValueAt(row, 2);
        String role = (String) tableModal.getValueAt(row, 3);

        if(role.equals("admin")){
            role = "Admin";
        } else {
            role = "Employee";
        }
        idField.setText(id+"");
        usernameField.setText(username);
        passwordField.setText(password);
        roleComboBox.setSelectedItem(role);

        idField.setEnabled(false);
        addBtn.setEnabled(false);
        editBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        utils.setBgButtonHasColor(addBtn, editBtn, deleteBtn);
    }//GEN-LAST:event_accountTableMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa tài khoản này?", "Xác nhận", JOptionPane.YES_NO_OPTION,0);
        if(answer == 0){
            int row = accountTable.getSelectedRow();
            tableModal.removeRow(row);

            listAcc.remove(row);
            fileController.updateListAccountToFile("account.txt", listAcc);

            editBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
            addBtn.setEnabled(true);
            utils.setBgButtonNull(addBtn, editBtn, deleteBtn);
            setTextNull("Xóa thành công", "Xóa tài khoản");
            increaseIndex();
            usernameField.requestFocus();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO: filter by account table
        utils.filterByColummTable(searchField, tableModal, accountTable, 1);
    }//GEN-LAST:event_searchFieldKeyReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        deleteBtn.setEnabled(false);
        editBtn.setEnabled(false);
        addBtn.setEnabled(true);
        
        idField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        roleComboBox.setSelectedIndex(0);

        if(listAcc.size() == 0){
            accountID = 0;
        } else{
            accountID=listAcc.get(listAcc.size()-1).getId()+ 1;
        }
        idField.setText(accountID.toString());
        utils.setBgButtonNull(addBtn, editBtn, deleteBtn);
    }//GEN-LAST:event_formMouseClicked

    private void validateField(String name, String value) {
            switch (name) {
                case "password":
                    if(value.compareTo("") == 0){
                        showError.setText("Vui lòng nhập mật khẩu");
                        return;
                    }
                    if(value.length() < 6){
                        showError.setText("Mật khẩu phải có độ dài lớn hơn 6");
                        return;
                    }
                    showError.setText(null);
                    break;
                case "username": {
                    if(value.compareTo("") == 0){
                        showError.setText("Vui lòng nhập tên người dùng");
                        return;
                    }
                    String regexUsername = "^[a-zA-Z0-9]{0,30}$";
                    Pattern pattern = Pattern.compile(regexUsername);
                    Matcher match = pattern.matcher(value);

                    if(!match.matches()){
                        showError.setText("Tên người dùng không bao gồm các kí tự đặc biệt");
                        return;
                    } 
                    if(value.length() < 6){
                        showError.setText("Tên người dùng tối thiểu 6 kí tự");
                        return;
                    }
                    showError.setText(null);
                    break;
                }
                default:
                    showError.setText(null);
                    break;
        }
    }

    private void setTextNull(String title, String subTitle){
        idField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        roleComboBox.setSelectedIndex(0);
        JOptionPane.showConfirmDialog(null, title, subTitle, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTable;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JLabel roleLabel;
    private java.awt.TextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel showError;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
