/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ma
 */
public class LoginPanel extends JPanel {
    private ApplicationController applicationController;
    public LoginPanel(ApplicationController applicationController) {
        this.applicationController = applicationController;
        System.out.println(getClass().getResource("C:/Users/lenovo/Desktop/attendance/src/javaapplication8/Screenshot from 2016-09-23 08_58_18.jpg"));
        initComponents();
    }
    
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1352, 840));
        setLayout(null);

        jLabel2.setBackground(new java.awt.Color(251, 177, 104));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Username");
        add(jLabel2);
        jLabel2.setBounds(280, 250, 100, 50);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Password");
        add(jLabel3);
        jLabel3.setBounds(280, 340, 110, 30);
      
      //  jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:/Users/lenovo/Desktop/attendance/src/javaapplication8/Screenshot from 2016-09-23 08_58_18.jpg")));// NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -10, 250, 220);

        jTextField1.setToolTipText("Enter your Username");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(450, 260, 200, 27);

        jPasswordField1.setToolTipText("Enter Your Password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        add(jPasswordField1);
        jPasswordField1.setBounds(450, 340, 200, 27);

        jButton1.setFont(new java.awt.Font("Rekha", 1, 15)); // NOI18N
        jButton1.setText("Login");
        jButton1.setToolTipText("Click to login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(240, 470, 90, 40);

        jButton2.setFont(new java.awt.Font("Rekha", 1, 15)); // NOI18N
        jButton2.setText("Clear");
        jButton2.setToolTipText("Click To clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(440, 470, 100, 40);

        jButton3.setFont(new java.awt.Font("Rekha", 1, 15)); // NOI18N
        jButton3.setText("Exit");
        jButton3.setToolTipText("Click To exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(650, 470, 100, 40);

        jLabel5.setFont(new java.awt.Font("Ume P Gothic C5", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(196, 10, 10));
        add(jLabel5);
        jLabel5.setBounds(360, 80, 560, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/Staff.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(810, 190, 310, 290);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/mobile-account-login-button.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(330, 70, 570, 100);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(940, 650, 370, 40);
        jLabel8.setText("Copyrights Reserved @ ManasAbhilash");

        JButton jButton4 = new javax.swing.JButton();
        jButton4.setText("Click Here For Admin Login");
        add(jButton4);
        jButton4.setBounds(1000, 100,250, 29);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/light-background-design-website-9.jpg"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1370, 850);
    }
    
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText("");
       jPasswordField1.setText("");
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       jPasswordField1ActionPerformed(evt);
    }                                        

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        jTextField1.setText("");
    }                                       

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
        jPasswordField1.setText("");
        if(jTextField1.getText()==null){
            JOptionPane.showMessageDialog(this,"Please Enter Username First");
        }
    }                                           

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new Login().setVisible(true);
        applicationController.Dispose();
    }                                        

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")||jPasswordField1.getPassword().equals("")){
            JOptionPane.showMessageDialog(null, "UserID or Password not entered.Please Try Again");
        } else {
            //first two lines to get username and password
            String username=jTextField1.getText();
            String passW=new String(jPasswordField1.getPassword());
            boolean validUser = applicationController.getApplicationDao().validateUser(username, passW);
            if (validUser) {
                    jTextField1.setText("");
                    jPasswordField1.setText("");
                    applicationController.userLoggedIn(username);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong User ID or Password. Try again");
                    jTextField1.setText("");
                    jPasswordField1.setText("");   
                }
        }        
    }                                               

    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration     
}
