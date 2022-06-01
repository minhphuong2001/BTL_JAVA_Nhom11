package controllers;

import java.awt.TextField;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Minh Phuong Do
 */
public class Utils {
    public static void filterByTable(TextField fieldName, DefaultTableModel tableModel, JTable tableName){
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(tableModel);

        tableName.setRowSorter(rowSorter);
        String searchUsername = fieldName.getText();

        if(searchUsername.trim().length() == 0){
            rowSorter.setRowFilter(null);
        } else {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchUsername));
        }
    }
}
