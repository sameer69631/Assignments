package ArrayAssignmentPPT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ans7MissingRange {

	public static void missingRange(int nums[] ,int lower, int upper, List<List<Integer>> result){
		if (nums[0] > lower) {
			result.add(Arrays.asList(lower,nums[0]-1));
		}
		for(int i=0; i<nums.length-1; i++) {
			int sub = nums[i+1] - nums[i];
			if (sub > 1) {
				result.add(Arrays.asList(nums[i]+1,nums[i+1]-1));
			}
		}
		if (upper > nums[nums.length-1]) {
			result.add(Arrays.asList(nums[nums.length-1]+1,upper));
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int nums[] = {0,1,3,50,75};
		missingRange(nums, 0, 99, new ArrayList<>());
	}
}
