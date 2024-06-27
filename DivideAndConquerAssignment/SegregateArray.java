package DivideAndConquerAssignment;

import java.util.Arrays;

public class SegregateArray {

	public static void main(String [] args) {
		int arr[] = {19, -20, 7, -4, -13, 11, -5, 3};
		int i = 0,j = arr.length-1;
		while(i<j) {
			if(arr[i]>0 && arr[j]<0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			else if(arr[i]<0) i++;
			else if(arr[j]>0) j--;
		}
		System.out.println(Arrays.toString(arr));
	}
}