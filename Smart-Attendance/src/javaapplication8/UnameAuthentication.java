/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class UnameAuthentication extends javax.swing.JFrame {
public static String old_uname;
public String old_pass;
private String username;
    /**
     * Creates new form changeusernamepassword
     */
    public UnameAuthentication() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        olduname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 390));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("USER AUTHENTICATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(103, 12, 200, 20);

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(46, 63, 100, 20);

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(46, 128, 110, 20);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(42, 230, 110, 29);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 230, 90, 29);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 230, 110, 29);

        olduname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldunameActionPerformed(evt);
            }
        });
        getContentPane().add(olduname);
        olduname.setBounds(234, 58, 146, 26);
        olduname.getAccessibleContext().setAccessibleName("");
        olduname.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jLabel2);
        jLabel2.setBounds(46, 40, 0, 0);
        getContentPane().add(oldpass);
        oldpass.setBounds(234, 123, 146, 26);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(46, 198, 0, 0);

        jButton4.setFont(new java.awt.Font("Bitstream Charter", 1, 15)); // NOI18N
        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 290, 100, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/light-background-design-website-9.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-1, -3, 520, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        olduname.setText(null);
        oldpass.setText(null);
        jLabel5.setText(null);
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void oldunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldunameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         old_uname = olduname.getText();
         String old_pass=new String(oldpass.getPassword());
         
        if(old_uname.length()>0 && old_pass.length()>0)
        {  try{
                //first two lines to get username and password
                
                Class.forName("java.sql.DriverManager" ); //database connectivity
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","1234");
                Statement stmt=con.createStatement(); 
                String query="select * from login;";//to get table logins data
                ResultSet rs=stmt.executeQuery(query);
                while(rs.next()){
                if((rs.getString("Userid").equals(old_uname) && rs.getString("Password").equals(old_pass)) ) {
                    ChangeUname change = new ChangeUname();
                    change.setVisible(true);
                    dispose();
                    } else {jLabel5.setText("Credentials Invalid!");
                    
                    
                
                }
                }
                  
                
                stmt.close();   
                rs.close();
                con.close();
                
                }
        catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);}
                
                
             }
        else
            
            jLabel2.setText("Enter Username and Password");
        
        
            
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UnameAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnameAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnameAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnameAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnameAuthentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JTextField olduname;
    // End of variables declaration//GEN-END:variables
}
