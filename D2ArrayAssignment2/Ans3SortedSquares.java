package D2ArrayAssignment2;

import java.util.Arrays;

public class Ans3SortedSquares {

	public static int[] sortedSquares(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (arr[min] != arr[i]) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int nums[] = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}
}
