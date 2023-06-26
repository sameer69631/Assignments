package ArrayAssignmentPPT2;

import java.awt.RenderingHints.Key;
import java.util.HashMap;

public class Ans3HarmoniousSubsequence {

	public static int harmoniousSubSeq(int nums[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxSubSeq = 0;
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		for(int i : map.keySet()) {
			if (map.containsKey(i+1)) {
				maxSubSeq = Math.max(maxSubSeq, map.get(i)+map.get(i+1));
			}
		}
		return maxSubSeq;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,3,2,2,5,3,2,7};
		int result = harmoniousSubSeq(nums);
		System.out.println(result);
	}
}
