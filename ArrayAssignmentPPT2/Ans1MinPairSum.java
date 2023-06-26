package ArrayAssignmentPPT2;

import java.util.Arrays;

public class Ans1MinPairSum {

	// minimum pair sum
	public static int minPairSum(int nums[]) {
		Arrays.sort(nums);
		int maxSum = 0;
		for(int i=0;i<nums.length;i+=2) {
			maxSum += nums[i];
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,4,3,2};
		int result = minPairSum(nums);
		System.out.println(result);
	}
}
