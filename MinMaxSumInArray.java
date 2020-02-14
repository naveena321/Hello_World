package helloWorld;

public class MinMaxSumInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 9, 4, 2 };
		long min = arr[0];
		long max = arr[arr.length - 1];
		long total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println((total - max) + " " + (total - min));
		}

}
