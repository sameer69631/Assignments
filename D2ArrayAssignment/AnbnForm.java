package D2ArrayAssignment;

import java.util.Arrays;

public class AnbnForm {

	public static void anbnForm(int nums[],int n) {
		int arr[] = new int[2*n];
		for(int i=0; i<n; i++) {
			int ind1 = i;
			int ind2 = n+i;
			arr[i*2] = nums[ind1];
			arr[i*2+1] = nums[ind2];
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int nums[] = {2,5,1,3,4,7};
		int n = 3;
		anbnForm(nums, n);
	}
}
