
package javaapplication8;

import dao.ApplicationDao;
import java.awt.BorderLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ApplicationController {
    private ApplicationDao applicationDao;
    private JFrame applicationFrame;
    private String loggedInUsername = null;
    private Date sessionStartTime = null;
    private LoginPanel loginPanel;
    private HeaderPanel headerPanel;
    private TimetablePanel timetablePanel;
    private ChangePasswordPanel changePasswordpanel;
    private HomePage homepage;
    private Attendance attendancePanel;
    
   
    public ApplicationController(ApplicationDao applicationDao, JFrame applicationFrame) {
        this.applicationDao = applicationDao;
        this.applicationFrame = applicationFrame;
    }
    
    public ApplicationDao getApplicationDao() {
        return this.applicationDao;
    }
    
    public void startApplication() {
        applicationFrame.getContentPane().add(getLoginPanel(), BorderLayout.CENTER);
        applicationFrame.setVisible(true);
    }
    
    public void userLoggedIn(String username) {
        loggedInUsername = username;
        sessionStartTime = new Date();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        String hhmmStr = (sdf.format(cal.getTime()));
        int hhmm = Integer.parseInt(hhmmStr);
        if( hhmm<800 || hhmm>1420 ) {
            JOptionPane.showMessageDialog(applicationFrame, "You Cant Update The Attendace As The School Has Not Started Yet, You are Bieng Redirected......");
            applicationFrame.getContentPane().removeAll();
            applicationFrame.getContentPane().add(getHeaderPanel(), BorderLayout.PAGE_START);
            showLoggedInTeacherTimetable();
        } else {
           applicationFrame.getContentPane().removeAll();
           applicationFrame.getContentPane().add(getHeaderPanel(), BorderLayout.PAGE_START);
           showLoggedInTeacherClass();
        }
        applicationFrame.revalidate();
        applicationFrame.repaint();
    }
    
    public void userLoggedOut() {
        applicationDao.logUserLogOff(loggedInUsername, sessionStartTime, new Date());
        loggedInUsername = null;
        applicationFrame.getContentPane().removeAll();
        applicationFrame.getContentPane().add(getLoginPanel(), BorderLayout.CENTER);
       applicationFrame.revalidate();
        applicationFrame.repaint();
    }
    
    public void showMyTimetable(){
        showLoggedInTeacherTimetable();
         applicationFrame.revalidate();
        applicationFrame.repaint();
    }
    
    public String getLoggedInUsername() {
        return loggedInUsername;
    }

    public void sendAbsentData(String rollno ,String name,int period){
        applicationDao.updateAttendance(rollno, name, HomePage.Classname, new Date(),period);
    }
   
    
    void showLoggedInTeacherTimetable() {
        ensureTimetablePanelAtCenter();
        getTimetablePanel().showTeacherTimetable(loggedInUsername);
    }

    private void ensureTimetablePanelAtCenter() {
        BorderLayout layout = (BorderLayout)applicationFrame.getContentPane().getLayout();
        Component atCenter = layout.getLayoutComponent(BorderLayout.CENTER);
        if (atCenter != getTimetablePanel()) {
            if (atCenter != null)
                applicationFrame.getContentPane().remove(atCenter);
            applicationFrame.getContentPane().add(getTimetablePanel(), BorderLayout.CENTER);
            applicationFrame.revalidate();
            applicationFrame.repaint();
        }
    }
    
    void showLoggedInTeacherClass() {
        applicationFrame.getContentPane().add(getHomePagePanel(), BorderLayout.CENTER);
        getHomePagePanel().showStudentData();
    }
   
    
    void showSelectedTeacherTimetable(String value) {
        ensureTimetablePanelAtCenter();
        getTimetablePanel().showTeacherTimetable(value);
    }
   
    void showSelectedClassTimetable(String classname) {
        ensureTimetablePanelAtCenter();
        getTimetablePanel().showStudentTimetable(classname);
    }
    
   public  void getchangePassword(){
        applicationFrame.getContentPane().removeAll();
        applicationFrame.getContentPane().add(getchangePasspanel(), BorderLayout.CENTER);
       applicationFrame.revalidate();
        applicationFrame.repaint();
   }
   public void changePassword(String username,String pass1,String pass2){
        if( pass1.equals (pass2) ){
            applicationDao.changePassword(username, pass1);
            JOptionPane.showMessageDialog(null,"Your Password Has Been Changed Successfully , Please Login Again");
            userLoggedOut();
       } else
            JOptionPane.showMessageDialog(null,"Passwords Donot Match");   
    }

    public ChangePasswordPanel getchangePasspanel() {
        
        if (changePasswordpanel ==  null) changePasswordpanel = new ChangePasswordPanel(this);
        return changePasswordpanel;
    }
    
    public void  Dispose(){
        applicationFrame.getContentPane().removeAll();
        applicationFrame.dispose();
    }
    
 
   
  public void insertAttendancePanel() {
        removeCenterComponent();
        applicationFrame.getContentPane().add(getAttendancePanel(), BorderLayout.CENTER);
        getAttendancePanel().getAbsentList();
        applicationFrame.revalidate();
        applicationFrame.repaint();        
  }

    private void removeCenterComponent() {
        BorderLayout layout = (BorderLayout)applicationFrame.getContentPane().getLayout();
        if (layout.getLayoutComponent(BorderLayout.CENTER) != null)
            applicationFrame.getContentPane().remove(layout.getLayoutComponent(BorderLayout.CENTER));
    }
  
   private LoginPanel getLoginPanel() {
        if (loginPanel ==  null) loginPanel = new LoginPanel(this);
        return loginPanel;
    }

    private HeaderPanel getHeaderPanel() {
        if (headerPanel ==  null) headerPanel = new HeaderPanel(this);
        return headerPanel;
    }

    private TimetablePanel getTimetablePanel() {
        if(timetablePanel == null) timetablePanel = new TimetablePanel(this);
        return timetablePanel;
    }
   private HomePage getHomePagePanel() {
        if (homepage ==  null) homepage = new HomePage(this);
        return homepage;
  }
  
  private Attendance getAttendancePanel(){
      if(attendancePanel == null) attendancePanel = new Attendance(this);
      return attendancePanel;
  }
  
}
