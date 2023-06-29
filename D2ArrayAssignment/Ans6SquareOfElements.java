package D2ArrayAssignment;

import java.util.Arrays;
import java.util.Iterator;

public class Ans6SquareOfElements {

	public static void squareOfElements(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			nums[i]*=nums[i];
		}
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			boolean swap = false;
			for (int j = 0; j < n-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {-4,-1,0,3,10};
		squareOfElements(nums);
		System.out.println(Arrays.toString(nums));
	}
}
