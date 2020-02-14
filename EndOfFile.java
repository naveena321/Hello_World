package helloWorld;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int i = 1;
		    while (sc.hasNextLine()) {
		        String str = sc.nextLine();
		        if(str.isEmpty())
		            break;
		        System.out.println(i + " " +  str);
		        i++;
		    }
		sc.close();
	}

}
