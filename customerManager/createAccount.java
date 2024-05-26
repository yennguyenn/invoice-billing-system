
package customerManager;

import java.util.Random;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.UUID;
import java.util.*;

/**
 *
 * @author Admin
 */
public class createAccount extends javax.swing.JFrame {

    public createAccount() {
        initComponents();

    }
    
  public void setNameF(String name) {
        nameF.setText(name);
    }

 
  
  

  
  
  
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phonenumberF = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText(" CREATE ACCOUNT ! START YOUR JOURNEY WITH US !");

        jLabel2.setText(" NAME:");

        nameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFActionPerformed(evt);
            }
        });

        jLabel4.setText("EMAIL:");

        emailF.setText(" ");

        jLabel3.setText(" PHONE NUMBER:");

        phonenumberF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberFActionPerformed(evt);
            }
        });

        createBtn.setText(" CREATE");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(createBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel3)))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameF)
                                .addComponent(emailF)
                                .addComponent(phonenumberF, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phonenumberF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addComponent(createBtn)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
  
  
    }//GEN-LAST:event_formWindowClosed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createBtnActionPerformed

        if (nameF.getText().isEmpty() || emailF.getText().isEmpty() || phonenumberF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL THE FIELDS");
        }

       else {

            String name = nameF.getText().trim();
            String email = emailF.getText().trim();
            String phonenumber = phonenumberF.getText().trim();
 

            Connection conn = null;
            PreparedStatement pstmt = null;
            Statement statement=null;
            ResultSet rs=null;

            try {
              
                // Tạo kết nối JDBC
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=MOONHOUSE;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
                conn = DriverManager.getConnection(url);
             
                String findID="SELECT customerID FROM CUSTOMER";
                statement=conn.createStatement();
                rs=statement.executeQuery(findID);
                int id;
                int nextID;
                int previousID=0;
                boolean check=true;
                if(!rs.next())
                {
                    id=1;
                   
                }
                else
                {
                do
                   { 
                   nextID=rs.getInt("customerID");
                     if(nextID-previousID==1){
                        previousID=nextID;
                   } else{
                         check=false;
                     }
                   }while(rs.next()&&check);
                   if(check){
                       id=nextID+1;
                   }else{
                       id=previousID+1;
                   }
                  
                  
              }
              

   
                String sql = "INSERT INTO customer (customerID, name, email, phonenumber) VALUES (?, ?, ?, ?)";
            
           
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1,id);
                pstmt.setString(2, name);
                pstmt.setString(3, email);
                pstmt.setString(4, phonenumber);
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null,"Dữ liệu đã được chèn thành công vào bảng customer.");
                } else {
                   JOptionPane.showMessageDialog(null,"Không có dữ liệu nào được chèn vào bảng customer.");
                }

                // Tăng biến đếm cho lần chèn dữ liệu tiếp theo

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            } finally {
                // Đóng tài nguyên
                try {
                    if (pstmt != null)
                        pstmt.close();
                    if (conn != null && !conn.isClosed())
                        conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
        
        }

    



    }// GEN-LAST:event_createBtnActionPerformed

    private void phonenumberFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_phonenumberFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_phonenumberFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField emailF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField nameF;
    private javax.swing.JTextField phonenumberF;
    // End of variables declaration//GEN-END:variables
}
