package helloWorld;

import java.util.*;

public class ReverseString {

    

	public static void main(String[] args) {
		int count=0;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /*char[] arr=A.toCharArray();
       int temp=arr.length-1;
       for (int i = 0; i < arr.length/2; i++) {
    		   if(arr[i]==arr[temp--]) {
	    			  count++;
	    			  }
       }
       if(arr.length/2 == count) {
    	   System.out.println("YES");
       }
       else {
    	   System.out.println("NO");
       }*/
        int temp=A.length()-1;
        for (int i = 0; i < A.length()/2; i++) {
			if(A.charAt(i)==A.charAt(temp--)) {
				 count++;
			}
		}
        if(A.length()/2 == count) {
     	   System.out.println("YES");
        }
        else {
     	   System.out.println("NO");
        }
        
    }
}
