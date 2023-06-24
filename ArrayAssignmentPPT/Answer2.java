package ArrayAssignmentPPT;

import java.util.Arrays;

public class Answer2 {
	
	public static void removeValOccurance(int nums[],int val) {
			int start = 0;
			int end = nums.length-1;
			while(start<end) {
				if (nums[start] == val && nums[end] == val) {
					end--;
				}
				else if(nums[start]==val && nums[end] != val) {
					int temp = nums[start];
					nums[start++] = nums[end];
					nums[end--] = temp;
				}
				else if (nums[start]!=val && nums[end]!=val) {
					start++;
				}
			}
			System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		int nums[] = {3,2,2,3};
		int val = 3;
		removeValOccurance(nums, val);
		int k=0;
		for(int i=0;i<nums.length;i++) {
			if (nums[i]!=val) {
				k++;
			}
		}
		System.out.println("Number of elements which are not equal to val are : "+k);
	}
}
