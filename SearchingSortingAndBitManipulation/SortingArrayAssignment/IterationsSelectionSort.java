package SortingArrayAssignment;

import java.util.Arrays;

public class IterationsSelectionSort {

	public static void main(String[] args) {
		int arr[] = {3,5,1,6,0};
		int iterations=0;
		for(int i=0;i<arr.length-1;i++) {
			int maxVal=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[maxVal]<arr[j]) {
					maxVal=j;
					iterations++;
				}
			}
			if(maxVal!=i) {
				int temp = arr[i];
				arr[i] = arr[maxVal];
				arr[maxVal] = temp;
				
			}
		}
		
		System.out.println("no of iterations taken to sort the array in decreasing order is : "+iterations);
		
	}
}
