package ArrayAssignmentPPT3;

import java.util.*;
public class Ans1ClosestSum {
	
	public static int findClosestSum(int nums[],int target) {
		 int n=nums.length;
		 int closestSum = Integer.MAX_VALUE;
		 Arrays.sort(nums);
		 
		 for(int i=0; i<n-2; i++) {
			 int left = i+1;
			 int right = n-1;
			 while(left<right) {
				 int currentSum = nums[i] + nums[left] + nums[right];
				 if (Math.abs(currentSum-target)<Math.abs(closestSum-target)) {
					closestSum = currentSum;
				}
				 if (currentSum > target) {
					right--;
				}else if (currentSum > target) {
					left++;
				}else {
					return target;
				}
			 }
		 }
		 return closestSum;
	}

	public static void main(String[] args) {
		int nums[] = {-1,2,1,-4};
		int target = 2;
		int result = findClosestSum(nums, target);
		System.out.println(result);
	}
}
