
package dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javaapplication8.ApplicationController;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author ma
 */
public class ApplicationDao extends JdbcDaoSupport {

   public boolean validateUser(String username, String password) {
       String sql="select count(*) > 0 as 'valid' from login where Userid= ? and Password=?";
       return getJdbcTemplate().queryForMap(sql, username, password).get("valid").toString().equals("1");
   }

   public void logUserLogOff(String username, Date startTime, Date endTime) {
       String sql = "insert into Log values(?,?,?)";
       getJdbcTemplate().update(sql, username, startTime, endTime);
   }
   
   public List<Map<String, Object>> getTeacherTimetable(String username){
       String query="select * From staff_timetable where teacher=? order by period";
       return getJdbcTemplate().queryForList(query, username);
   }
    
  public List<Map<String, Object>> getStudentTimetable(String classname){
     String query="select * From student_timetable where class=? order by period";
     return getJdbcTemplate().queryForList(query, classname);

  }
     
  public int  changePassword(String username,String password){
   String query="Update login Set Password=? where Userid=?";
      int update = getJdbcTemplate().update(query,password,username);
      return update;
  }
  
   public int  updateAttendance(String rollno,String name,String classname,Date startTime,int period){            
         String query="Insert into student_Absent values(?,?,?,?,?)";
         int update=getJdbcTemplate().update(query,rollno,name,classname,startTime,period);
         return update;
       }
   
   public List<Map<String, Object>> teacherClass(String period,String username){
       String query="Select * From staff_timetable where period=? and teacher=?;";
        return getJdbcTemplate().queryForList(query, period,username);
   }
   
   public List<Map<String, Object>> studentList(String classname){
       String query="Select * From Student_list where class=? ;";
        return getJdbcTemplate().queryForList(query, classname);
   }
   
   public List<Map<String , Object>> getbroadAbsentList(){
       String query="Select * from student_Absent";
       return getJdbcTemplate().queryForList(query);
   }
   
   public List<Map<String , Object>> getAbsentListOfClass(String selectedClass){
       String query="Select * from student_Absent where class=?";
       return getJdbcTemplate().queryForList(query,selectedClass);
   }
   
    public List<Map<String , Object>> getAbsentListOfPeriod(String selectedClass,String selectedPeriod){
       String query="Select * from student_Absent where class=? and period=?";
       return getJdbcTemplate().queryForList(query,selectedClass,selectedPeriod);
   }
    
    public List<Map<String , Object>> getAbsentListOfDate(Date date){
       String query="Select * from student_Absent where date=?";
       return getJdbcTemplate().queryForList(query, new java.sql.Date(date.getTime()));
   }
    
     public List<Map<String , Object>> getAbsentListOfAllFilters(String selectedClass,Date date,String selectedPeriod){
       String query="Select * from student_Absent where class=? and date=? and period=?";
       return getJdbcTemplate().queryForList(query,selectedClass, new java.sql.Date(date.getTime()),selectedPeriod);
   }
}

