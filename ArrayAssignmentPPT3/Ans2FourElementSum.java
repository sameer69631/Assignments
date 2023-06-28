package ArrayAssignmentPPT3;

import java.util.*;
public class Ans2FourElementSum {

	public static List<List<Integer>> fourElementSum(int nums[] , int target , List<List<Integer>> result){
		Arrays.sort(nums);
		int n = nums.length;
		
		for(int i=0; i<n-3; i++) {
			if (i>0 && nums[i] == nums[i-1]) {
				continue;
			}
			for(int j=i+1; j<n-2; j++) {
				int left = j+1;
				int right = n-1;
				
				while(left < right) {
					int currentSum = nums[i] + nums[j] + nums[left] + nums[right];
					if (currentSum == target) {
						result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
						left++;
						right--;
						
						while(left<right && nums[left] == nums[left-1]) {
							left++;
						}
						while(left < right && nums[right] == nums[right+1]) {
							right--;
						}
					}
					else if (currentSum < target) {
						left++;
					}else if (currentSum > target) {
						right--;
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,0,-1,0,-2,2};
		int target = 0;
		List<List<Integer>> resList = new ArrayList<>();
		resList = fourElementSum(nums, target, resList);
		System.out.println(resList);
	}
}
