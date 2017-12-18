/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ma
 */
public class TimetablePanel extends JPanel {
private ApplicationController applicationController;
    public TimetablePanel(ApplicationController applicationController) {
        this.applicationController = applicationController;
        initComponents();
    }
    private void initComponents() {
        setMinimumSize(new java.awt.Dimension(1352, 840));
        setLayout(null);
        jTable1=new javax.swing.JTable();
        jLabel1=new javax.swing.JLabel();
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "period/day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setEditingColumn(1);
        jTable1.setEditingRow(1);
        jTable1.setFillsViewportHeight(true);
        jTable1.setIntercellSpacing(new java.awt.Dimension(20, 20));
        jTable1.setRowHeight(50);
        jScrollPane2=new JScrollPane();
        jScrollPane2.setViewportView(jTable1);
        add(jScrollPane2);
        jScrollPane2.setBounds(280, 110, 700, 450);
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/ma/Desktop/Screenshot from 2016-09-23 08:58:18.png")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(30, 0, 230, 200);
        jLabel2=new JLabel();
        jLabel2.setForeground(new java.awt.Color(195, 166, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/light-background-design-website-9.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1350, 860);

    }
    
    public void showTeacherTimetable(String username){
        
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            List<Map<String, Object>> timetableData = applicationController.getApplicationDao().getTeacherTimetable(username);
            for (Map<String, Object> periodTimeTable: timetableData) {                
                String period = (String)(periodTimeTable.get("period")+"");
                String monday = (String)periodTimeTable.get("monday");
                String tuesday = (String)periodTimeTable.get("tuesday");
                String wednesday = (String)periodTimeTable.get("wednesday");
                String thursday = (String)periodTimeTable.get("thursday");
                String friday = (String)periodTimeTable.get("friday");
                String saturday = (String)periodTimeTable.get("saturday");
                model.addRow(new Object[] {period, monday,tuesday,wednesday,thursday,friday,saturday});
            }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
        public void showStudentTimetable(String classname){
        
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            List<Map<String, Object>> timetableData = applicationController.getApplicationDao().getStudentTimetable(classname);
            for (Map<String, Object> periodTimeTable: timetableData) {                
                String period = (String)(periodTimeTable.get("period")+"");
                String monday = (String)periodTimeTable.get("monday");
                String tuesday = (String)periodTimeTable.get("tuesday");
                String wednesday = (String)periodTimeTable.get("wednesday");
                String thursday = (String)periodTimeTable.get("thursday");
                String friday = (String)periodTimeTable.get("friday");
                String saturday = (String)periodTimeTable.get("saturday");
                model.addRow(new Object[] {period, monday,tuesday,wednesday,thursday,friday,saturday});
            }
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
    
    
    
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
}
