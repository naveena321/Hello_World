package helloWorld;

import java.text.ParseException;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		String s="07:05:45 PM";
		String[] time = s.split(":");

        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0, 2);
        String dayEve = time[2].substring(2, 4);
        if (dayEve.equals("AM")) {
            System.out.println(((hours.equals("12") ? "00" : hours) + ":" + minutes + ":" + seconds));
        } else {
            System.out.println(((hours.equals("12") ? hours : (Integer.parseInt(hours) + 12)) + ":" + minutes + ":" + seconds));
        }
		    }
		}


