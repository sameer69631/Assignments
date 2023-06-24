package ArrayAssignmentPPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Answer1 {
	
	public static int[] targetSumTwoIndices(int nums[] , int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
			int tempNum = target - nums[i];
			if (map.containsKey(tempNum) && tempNum!=nums[i]) {
				return new int[] {map.get(tempNum),i};
			}
		}
		throw new IllegalArgumentException("No Pair Found");
	}

	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(targetSumTwoIndices(nums, target)));
	}
}
