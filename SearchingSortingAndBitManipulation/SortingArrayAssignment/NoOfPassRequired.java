package SortingArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;
// no of pass required to sort array by bubble sort
public class NoOfPassRequired {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {3,5,1,6,0};
		int noOfPass=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean swap = false;
			for(int j=1;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
					swap=true;
				}
			}
			
			noOfPass++;
			if (!swap) {
			break;	
			}
		}
		
		System.out.println("the sorted array in decreasing order is :" + Arrays.toString(arr));
		System.out.println("No of pass taken to sort the array is : "+noOfPass);

	}
}
