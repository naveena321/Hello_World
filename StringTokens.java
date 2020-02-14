package helloWorld;
import java.util.*;

public class StringTokens {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	       // s.replaceAll("\\s+", "");
	        String delims = "[ \\t+.,?!'_@]+";
            String[] res=s.trim().split(delims);
            
	        if(s.isEmpty()||s.trim().equals("")||s == null) {
                System.out.println("0");
            }
	        else if(s.length()>400000){ }
	         else { 
	        System.out.println(res.length);
	        }
	        for (String string : res) {
                System.out.println(string);
            }
	        scan.close();
	    } 		
	}
