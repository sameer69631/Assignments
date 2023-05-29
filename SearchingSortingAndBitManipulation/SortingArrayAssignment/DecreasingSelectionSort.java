package SortingArrayAssignment;

import java.util.Arrays;

public class DecreasingSelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {3,5,1,6,0};
		
		for(int i=0;i<arr.length;i++) {
			int minVal = i;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[minVal]<arr[j]) {
					int temp = arr[minVal];
					arr[minVal] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

		
	}
}
