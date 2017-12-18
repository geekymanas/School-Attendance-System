/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ma
 */
public class Attendance extends javax.swing.JPanel {
private ApplicationController applicationController;
    /**
     * Creates new form Attendance
     */
    public Attendance(ApplicationController applicationController) {
        this.applicationController=applicationController;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    private void setTableData(List<Map<String, Object>> timetableData, DefaultTableModel model) {
        for (Map<String, Object> periodTimeTable: timetableData) {
            String RollNo = (String)(periodTimeTable.get("rollno")+"");
            String Name = (String)periodTimeTable.get("name");
            String Class = (String)periodTimeTable.get("class");
            String Period = (String)periodTimeTable.get("period");
            String Date = periodTimeTable.get("date").toString();
            model.addRow(new Object[] {RollNo,Name,Class,Period,Date});
        }
    }
    
    public void getAbsentList(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            List<Map<String, Object>> timetableData = applicationController.getApplicationDao().getbroadAbsentList();
            setTableData(timetableData, model);
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     
    }

   
    private void getSelectedClassAbsentList(String selectedClass){
        if(selectedClass !="-Select-"){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            List<Map<String, Object>> timetableData = applicationController.getApplicationDao().getAbsentListOfClass(selectedClass);
                setTableData(timetableData, model);
            if(model.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"There Were No Students Absent From This Class");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      }
        else{
            //JOptionPane.showMessageDialog(null,"Please Select a Class");
        }
    }
     private void getSelectedPeriodAbsentList(String selectedClass,String selectedPeriod){
        if(selectedPeriod !="-Select-"){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            List<Map<String, Object>> timetableData = applicationController.getApplicationDao().getAbsentListOfPeriod(selectedClass,selectedPeriod);
                setTableData(timetableData, model);
            if(model.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"There Were No Students Absent From This Class");
                jComboBox1.setSelectedItem("-Select-");
                jComboBox2.setSelectedItem("-Select-");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      }
        else{
            JOptionPane.showMessageDialog(null,"Please Select a Class");
        }
    }
     
   private void getSelectedAbsentListOfDate(Date date){
       
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            List<Map<String, Object>> timetableData = applicationController.getApplicationDao().getAbsentListOfDate(date);
            System.out.print(timetableData.size());
            setTableData(timetableData, model);
           if(model.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"There Were No Students Absent From This Class");
                
                
            }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
       
    }
     
     private void getSelectedAbsentListOfAllFilters(String selectedClass,Date date,String period){
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            List<Map<String, Object>> timetableData = applicationController.getApplicationDao().getAbsentListOfAllFilters(selectedClass,date,period);
                setTableData(timetableData, model);
            if(model.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"There Were No Students Absent From This Class");
                
                
           }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
       jDateChooser1.setDate(date);
    }
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RollNo", "Name", "Class/Section", "Period", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(670, 90, 646, 600);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "-Select-", "11a", "11b", "11c", "11d", "12a", "12b", "12c", "12d" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(50, 120, 110, 32);

        jLabel1.setFont(new java.awt.Font("NanumMyeongjo", 2, 15)); // NOI18N
        jLabel1.setText("Select Class");
        add(jLabel1);
        jLabel1.setBounds(60, 80, 100, 17);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("You Can Apply Filters For The Attendance Report Given Below");
        add(jLabel2);
        jLabel2.setBounds(70, 20, 560, 30);

        jLabel3.setFont(new java.awt.Font("NanumMyeongjo", 2, 15)); // NOI18N
        jLabel3.setText("Select Period");
        add(jLabel3);
        jLabel3.setBounds(250, 80, 110, 18);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "-Select-", "1", "2", "3", "4", "5", "6" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2);
        jComboBox2.setBounds(240, 120, 100, 32);

        jLabel4.setFont(new java.awt.Font("NanumMyeongjo", 2, 15)); // NOI18N
        jLabel4.setText("Select Date");
        add(jLabel4);
        jLabel4.setBounds(450, 80, 90, 18);

        jButton1.setText("Show All Absent List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(190, 360, 180, 25);

        jCheckBox1.setText("Apply Class And Date Filter");
        add(jCheckBox1);
        jCheckBox1.setBounds(230, 220, 240, 23);

        jCheckBox2.setText("Apply Class , Date And Period");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(230, 250, 280, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/light-background-design-website-9.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(-1, -3, 1350, 840);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code her
        String selectedClass=(jComboBox1.getSelectedItem()).toString();
        getSelectedClassAbsentList(selectedClass);
        jComboBox2.setEnabled(true);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       jComboBox1.setSelectedItem("-Select-");
       jComboBox2.setSelectedItem("-Select-");
       jComboBox2.setEnabled(false);
        getAbsentList();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String selectedClass=(jComboBox1.getSelectedItem()).toString();
       String selectedPeriod =jComboBox2.getSelectedItem().toString();
        getSelectedPeriodAbsentList(selectedClass, selectedPeriod);
         
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jDateChooser1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusGained
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jDateChooser1FocusGained

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected()==true){
           getSelectedAbsentListOfAllFilters(jComboBox1.getSelectedItem().toString(),jDateChooser1.getDate(),jComboBox2.getSelectedItem().toString());
             }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
        // TODO add your handling code here:
          if ("date".equals(evt.getPropertyName())) {
            getSelectedAbsentListOfDate((Date)evt.getNewValue());
        }
    }//GEN-LAST:event_jDateChooser2PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
