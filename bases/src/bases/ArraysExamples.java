package bases;

import java.util.Arrays;

public class ArraysExamples {
	public static void main(String[] args) {
		int[] arr = new int [2];
		
		arr[0] = 5;
		arr[1] = 6;
		
		System.out.println(arr[1]);
		
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int value: arr) {
			System.out.println(value);
		}
}
}
