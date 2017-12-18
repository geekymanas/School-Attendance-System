/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;



import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ma
 */
public class HeaderPanel extends JPanel {
    private ApplicationController applicationController;
    public HeaderPanel(ApplicationController applicationController) {
        this.applicationController = applicationController;
         initComponents();
    }
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        changeClassCBx = new javax.swing.JComboBox<String>();
        myTimetableJBtn = new javax.swing.JButton();
        attendanceBTn = new javax.swing.JButton();
        reportProblemBTn = new javax.swing.JButton();
        logOutJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5=new javax.swing.JLabel();
        changeTeacherCBx = new javax.swing.JComboBox<String>();
        changePasswordBTn = new javax.swing.JButton();
        jLabel4= new javax.swing.JLabel();
        
        setPreferredSize(new java.awt.Dimension(1380, 90));
        setLayout(null);

       /* jSeparator1.setBackground(new java.awt.Color(8, 6, 4));
        jSeparator1.setForeground(new java.awt.Color(9, 4, 4));
        add(jSeparator1);
        jSeparator1.setBounds(10, 80, 1330, 10);
*/
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Change Class");
        add(jLabel3);
        jLabel3.setBounds(400, 10, 132, 18);

        changeClassCBx.setFont(new java.awt.Font("TlwgTypewriter", 1, 15)); // NOI18N
        changeClassCBx.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "-Select-", "12a", "12b", "12C", "12D", "11A", "11B", "11C", "11D" }));
        changeClassCBx.setToolTipText("Change the class ");
        changeClassCBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeClassCBx(evt);
            }
        });
        add(changeClassCBx);
        changeClassCBx.setBounds(400, 40, 130, 32);

        myTimetableJBtn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        myTimetableJBtn.setText("My TimeTable");
        myTimetableJBtn.setToolTipText("Timetable");
        myTimetableJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(myTimetableJBtn);
        myTimetableJBtn.setBounds(230, 30, 140, 40);

       
        

        attendanceBTn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        attendanceBTn.setText("Attendance");
         attendanceBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceBTn(evt);
            }
         });
        add(attendanceBTn);
        attendanceBTn.setBounds(730, 30, 160, 40);;

       /* reportProblemBTn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        reportProblemBTn.setText("Report Problem");
        reportProblemBTn.setToolTipText("if any problem");
        reportProblemBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(reportProblemBTn);
        reportProblemBTn.setBounds(870, 30, 150, 40);;*/

        logOutJBtn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        logOutJBtn.setText("LogOut");
        logOutJBtn.setToolTipText("log out");
        logOutJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(logOutJBtn);
        logOutJBtn.setBounds(1120, 30, 90, 40);
       
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/index.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 80);
        
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Change Teacher");
        add(jLabel5);
        jLabel5.setBounds(560, 10, 130, 18);

         changeTeacherCBx.setFont(new java.awt.Font("TlwgTypewriter", 1, 15)); // NOI18N
        changeTeacherCBx.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "-Select-", "suchitha", "sumalatha", "chalapathi", "sarma", "sm", "ramadevi", "mallesh", "pushpa", "rajeshwari", "sri lakshmi", "deepshika" }));
        changeTeacherCBx.setToolTipText("Change the class ");
        changeTeacherCBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTeacherCBxActionPerformed(evt);
            }
        });
        add(changeTeacherCBx);
        changeTeacherCBx.setBounds(560, 40, 150, 32);    
        
        changePasswordBTn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        changePasswordBTn.setText("Change Password");
        changePasswordBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBTnActionPerformed(evt);
            }
        });
        add(changePasswordBTn);
        changePasswordBTn.setBounds(910, 30, 190, 40);
        
        

        jLabel2.setForeground(new java.awt.Color(195, 166, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/light-background-design-website-9.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1350, 90);
        
        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Welcome "+applicationController.getLoggedInUsername());
        add(jLabel4);
        jLabel4.setBounds(1245, 10, 50, 10);
        System.out.print("g "+jLabel4.getText());
      
    }// </editor-fold>  
    
      private void changeClassCBx(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Object value=changeClassCBx.getSelectedItem();
       applicationController.showSelectedClassTimetable(value.toString());
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
        applicationController.showMyTimetable();
        applicationController.showLoggedInTeacherTimetable();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     applicationController.userLoggedOut();
    }                                        

                                   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       
    }                                        
    
     private void changeTeacherCBxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        Object value=changeTeacherCBx.getSelectedItem();
       applicationController.showSelectedTeacherTimetable(value.toString());
            
    } 
    private void changePasswordBTnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        
        applicationController.getchangePassword();
    }       
    
    private void attendanceBTn(java.awt.event.ActionEvent evt) {   
         // TODO add your handling code here:
        applicationController.insertAttendancePanel();
    }      
    
  // Variables declaration - do not modify                     
    private javax.swing.JButton myTimetableJBtn;
    private javax.swing.JButton reportProblemBTn;
    private javax.swing.JButton logOutJBtn;
    private javax.swing.JButton attendanceBTn;
    private javax.swing.JComboBox<String> changeClassCBx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> changeTeacherCBx;
    private javax.swing.JButton changePasswordBTn;
    private javax.swing.JLabel user;
    // End of variables declaration     
}
