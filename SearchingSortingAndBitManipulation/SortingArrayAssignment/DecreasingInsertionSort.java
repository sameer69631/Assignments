package SortingArrayAssignment;

import java.util.Arrays;
import java.util.Iterator;

public class DecreasingInsertionSort {

	public static void main(String[] args) {
		
		int arr[] = {3,5,1,6,0};
		
		for(int i=1;i<arr.length;i++) {
			int j = i;
			while(j>0 && arr[j]>arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}

		}
		
//		for(int i=1;i<arr.length;i++) {
//			for(int j=i;j<arr.length;j--) {
//				if(j>0 && arr[j]>arr[j-1]) {
//					int temp = arr[j];
//					arr[j] = arr[j-1];
//					arr[j-1] = temp;
//				}
//			}
//		}
		
		
		System.out.println(Arrays.toString(arr));
	}
}
