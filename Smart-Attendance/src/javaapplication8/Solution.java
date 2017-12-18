package javaapplication8;

import java.util.*;
public class Solution {
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        Calender cal = Calender.getInstance();
        cal.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        switch(dayOfWeek){
            case 0:
                System.out.print("SUNDAY");
                break;
            case 1:
                System.out.print("MONDAY");
                break;
            case 2:
                System.out.print("TUESDAY");
                break;
            case 3:
                System.out.print("WEDNESDAY");
                break;
    }
  }
  
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
