package helloWorld;

import java.text.DecimalFormat;

public class PercentageOfNumberInArray {

	

	public static void main(String[] args) {
		int arr[]= {-4,3, -9, 0, 4, 1};
		int countPositive=0;
		int countNegative=0;
		int countZeros=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>0){
	                countPositive++;
	            }
	            else if(arr[i]<0){
	                countNegative++;
	            }
	            else{
	                countZeros++;
	            }
	         }
	         double positive=(double)countPositive/arr.length;
	         double negative=(double)countNegative/arr.length;
	         double neutral=(double)countZeros/arr.length;
	         System.out.println(new DecimalFormat("00.000000").format(positive));
	         System.out.println(new DecimalFormat("00.000000").format(negative));
	         System.out.println(new DecimalFormat("00.000000").format(neutral));

	}

}
