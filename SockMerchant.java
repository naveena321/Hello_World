package helloWorld;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		int[] ar= {10,20,10,30,10,50,20,10};
		int n=ar.length;
		int result = sockMerchant(n, ar);
		System.out.println("result="+result);
	}
	 static int sockMerchant(int n, int[] ar) {
	        int j=1;
	        double res=0;
	        int temp;
	       Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int i=0;i<ar.length;i++){
	            if(map.get(ar[i])==null){
	                map.put((Integer) ar[i],j);
	            }
	            else{
	                map.put(ar[i],map.get(ar[i])+j);
	            }
	        }
	    for (Integer m : map.keySet()) {
	             temp = map.get(m);
	             System.out.println(temp);
	             res=res+Math.floor((temp/2));
	             
	    }
	        return (int) (res);
	    }
	
}
