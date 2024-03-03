package ey.utilityclasses;
import java.util.TimeZone;   
import java.util.Locale;   
import java.util.Calendar;   
import java.util.GregorianCalendar; 


public class Gregorian_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String months[] = { "January", "February", "March", "April","May", "June", "July", "August","September", "October", "November", "December" };   
	      String arr[] = { "AM", "PM" };   
	      GregorianCalendar obj = new GregorianCalendar(); 
	      
	      
	      System.out.print("Today's date = " + obj.get(Calendar.DATE) + " "+ months[obj.get(Calendar.MONTH)] + ", "+ obj.get(Calendar.YEAR) + "\n");
	      System.out.print("Current time = "+ obj.get(Calendar.HOUR) + "-"+ obj.get(Calendar.MINUTE) + "-"+ obj.get(Calendar.SECOND) + " "+ arr[obj.get(Calendar.AM_PM)] );
	      System.out.print("\n"+ "Current Time Zone = " + obj.getTimeZone().getDisplayName()+ "\n" + "Locale = " + Locale.getDefault().getDisplayName());
	}

}
 
