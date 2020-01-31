package helloWorld;

import java.util.Calendar;

public class Calender {
	
		public static void main(String[] args) {
			String res=findDay(5, 25, 2020);
			System.out.println(res);
		}

		public static String findDay(int month, int day, int year){

		    Calendar cal = Calendar.getInstance();
		    String[] strDays = new String[] 
		    {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

		    cal.set(year, month-1, day);

		    return strDays[cal.get(Calendar.DAY_OF_WEEK)-1];

		}
		
}
