package SortingArrayAssignment;

import java.util.Arrays;

public class DecreasingOrderBubbleSort {
// sorting array in decreasing order using bubble sort
	public static void main(String[] args) {
		
		int arr[] = {3,5,1,6,0};
		
		boolean swap = false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
					swap=true;
				}
			}
			if (!swap) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
