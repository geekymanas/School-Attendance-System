/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import javax.swing.JOptionPane;

/**
 *
 * @author ma
 */
public class ChangePasswordPanel extends javax.swing.JPanel {
private ApplicationController applicationController;
    /**
     * Creates new form NewJPanel
     */
    public ChangePasswordPanel(ApplicationController applicationController) {
        this.applicationController = applicationController;
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oldUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        newpass1 = new javax.swing.JPasswordField();
        newpass2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Old Username");
        add(jLabel5);
        jLabel5.setBounds(330, 150, 110, 30);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Old Password");
        add(jLabel6);
        jLabel6.setBounds(330, 220, 110, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("New  Password");
        add(jLabel3);
        jLabel3.setBounds(330, 280, 130, 30);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Confirm Password");
        add(jLabel4);
        jLabel4.setBounds(330, 347, 129, 30);
        add(oldUsername);
        oldUsername.setBounds(670, 150, 200, 26);
        add(jPasswordField1);
        jPasswordField1.setBounds(670, 220, 200, 26);
        add(newpass1);
        newpass1.setBounds(670, 280, 200, 26);
        add(newpass2);
        newpass2.setBounds(670, 350, 200, 26);

        jLabel7.setFont(new java.awt.Font("Rekha", 0, 24)); // NOI18N
        jLabel7.setText("Change Your Account Details");
        add(jLabel7);
        jLabel7.setBounds(380, 38, 329, 29);

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("Change Credentials");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(272, 470, 180, 29);

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(560, 470, 110, 29);

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(750, 470, 110, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/Screenshot from 2016-09-23 08_58_18.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(30, 0, 230, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/light-background-design-website-9.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-3, -4, 1350, 840);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       String username=oldUsername.getText();
        String old_pass=new String(jPasswordField1.getPassword());
        String new_pass1 = new String (newpass1.getPassword());
        String new_pass2 =new String( newpass2.getPassword());
        boolean validUser = applicationController.getApplicationDao().validateUser(username, old_pass);
            if (validUser) {
                    applicationController.changePassword(username,new_pass1,new_pass2);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong User ID or Password. Try again");
                    oldUsername.setText("");
                    jPasswordField1.setText("");
                    newpass1.setText(null);
                    newpass2.setText(null);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        oldUsername.setText("");
       jPasswordField1.setText("");
       newpass1.setText(null);
       newpass2.setText(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField newpass1;
    private javax.swing.JPasswordField newpass2;
    private javax.swing.JTextField oldUsername;
    // End of variables declaration//GEN-END:variables
}
