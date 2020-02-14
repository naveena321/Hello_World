package helloWorld;

public class MinMaxSumInArray {

	public static void main(String[] args) {
			//Birthday Cake Candles
		//Return the number of candles that can be blown out on a new line
		int arr[] = { 1, 3, 7, 9, 4, 2 };
		long max = arr[0];
		long total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				total = total+1;
			}
		}
		System.out.println(total);
	}

}
