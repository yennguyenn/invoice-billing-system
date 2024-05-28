/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package customerManager;

import DataOptions.dataOptions;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;


/**
 *
 * @author Admin
 */
public class customerData extends javax.swing.JFrame {
    public  int rowSelected;


    ArrayList<customer> customers;
    public customerData() {
       
        initComponents();
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableClients = new javax.swing.JTable();
        editBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nameF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resetBtn1 = new javax.swing.JButton();
        historyBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Clients:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);

        tableClients.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "NAME", "EMAIL", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(tableClients);
        if (tableClients.getColumnModel().getColumnCount() > 0) {
            tableClients.getColumnModel().getColumn(0).setMinWidth(150);
            tableClients.getColumnModel().getColumn(0).setPreferredWidth(150);
            tableClients.getColumnModel().getColumn(0).setMaxWidth(150);
            tableClients.getColumnModel().getColumn(1).setMinWidth(150);
            tableClients.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableClients.getColumnModel().getColumn(1).setMaxWidth(150);
            tableClients.getColumnModel().getColumn(2).setMinWidth(150);
            tableClients.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableClients.getColumnModel().getColumn(2).setMaxWidth(150);
            tableClients.getColumnModel().getColumn(3).setMinWidth(150);
            tableClients.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableClients.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        editBtn.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        editBtn.setText("UPDATE");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        historyBtn.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        historyBtn.setText(" HISTORY");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jButton1.setText(" FIND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        resetBtn1.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        resetBtn1.setText("RESET");
        resetBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(historyBtn)
                        .addGap(27, 27, 27)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editBtn, historyBtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editBtn, historyBtn});

        historyBtn1.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        historyBtn1.setText("BACK");
        historyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(historyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(historyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection conn=null;
        Statement st=null;
      
        
        try {
            // Tạo kết nối JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=MOONHOUSE;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            conn=DriverManager.getConnection(url);
            st= conn.createStatement();
            String query="SELECT *FROM CUSTOMER ";
            ResultSet rs =st.executeQuery(query);
            DefaultTableModel model=(DefaultTableModel)tableClients.getModel();  
            while(rs.next()){
                int id=rs.getInt("customerID");
                String name=rs.getString("Name");
                String email=rs.getString("Email");
                String phoneNumber=rs.getString("PhoneNumber");
                model.addRow(new Object[]{id,name,email,phoneNumber})  ;      
            }
                           
            
        }catch(ClassNotFoundException|SQLException e){
         e.printStackTrace();
             
         } finally {
            // Đóng tài nguyên
           try{
               
                if (st != null) st.close();
                if (conn != null && !conn.isClosed()) conn.close();
              
               
               
           }catch(SQLException e){
               e.printStackTrace();
           }
        }
      
    }//GEN-LAST:event_formWindowOpened

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
    int rowSelected = tableClients.getSelectedRow();
    EditCustomerData editForm = new EditCustomerData();
    editForm.setRowSelected(rowSelected);
    editForm.setIdSelected((int) tableClients.getValueAt(rowSelected,0));
    editForm.setName((String) tableClients.getValueAt(rowSelected,1));
    editForm.setEmail((String) tableClients.getValueAt(rowSelected,2));
     editForm.setPhoneNumber((String) tableClients.getValueAt(rowSelected,3));
    editForm.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        new customerHistory().setVisible(true);
        
    }//GEN-LAST:event_historyBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (nameF.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "ENTER THE NAME");
} else {
    String name = nameF.getText();
    DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
  
    for (int i = model.getRowCount() - 1; i >= 0; i--) {
         String s=(String) model.getValueAt(i,1);
           System.out.println("name:"+name+" and "+s);
     if (!removeSpaces(name).equalsIgnoreCase(removeSpaces(s))) {
    model.removeRow(i);

    }

           
           
           
           
    }
     }     
    }//GEN-LAST:event_jButton1ActionPerformed
public static String removeSpaces(String str) {
    // Sử dụng phương thức trim() để loại bỏ các khoảng trống từ đầu và cuối chuỗi
    // Sử dụng phương thức replaceAll() để loại bỏ tất cả các khoảng trống bên trong chuỗi
    return str.trim().replaceAll("\\s+", "");
}
    private void resetBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtn1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
        model.setRowCount(0);
        Connection conn=null;
        Statement st=null;
      
        
        try {
            // Tạo kết nối JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=MOONHOUSE;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            conn=DriverManager.getConnection(url);
            st= conn.createStatement();
            String query="SELECT *FROM CUSTOMER ";
            ResultSet rs =st.executeQuery(query);
         
            while(rs.next()){
                int id=rs.getInt("customerID");
                String name=rs.getString("Name");
                String email=rs.getString("Email");
                String phoneNumber=rs.getString("PhoneNumber");
                model.addRow(new Object[]{id,name,email,phoneNumber})  ;      
            }
                           
            
        }catch(ClassNotFoundException|SQLException e){
         e.printStackTrace();
             
         } finally {
            // Đóng tài nguyên
           try{
               
                if (st != null) st.close();
                if (conn != null && !conn.isClosed()) conn.close();
              
               
               
           }catch(SQLException e){
               e.printStackTrace();
           }
        }
    }//GEN-LAST:event_resetBtn1ActionPerformed

    private void historyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtn1ActionPerformed
        new dataOptions().setVisible(true);
    }//GEN-LAST:event_historyBtn1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new createAccount().setVisible(true);
    }                                       
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
            java.util.logging.Logger.getLogger(customerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerData().setVisible(true);
            }
        });
    }
    
   public int getSelectedRowIndex() {
    return tableClients.getSelectedRow();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JButton historyBtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameF;
    private javax.swing.JButton resetBtn1;
    private javax.swing.JTable tableClients;
    // End of variables declaration//GEN-END:variables
}
