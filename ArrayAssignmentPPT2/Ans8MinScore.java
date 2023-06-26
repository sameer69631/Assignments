package ArrayAssignmentPPT2;

import java.util.Arrays;

public class Ans8MinScore {

	public static int minScore(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int minScore = nums[n - 1] - nums[0];
        for (int i = 1; i < n - 1; i++) {
            int max = Math.max(nums[i] + k, nums[n - 1] - k);
            int min = Math.min(nums[0] + k, nums[i] - k);
            minScore = Math.min(minScore, max - min);
        }
        
        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int result = minScore(nums, k);
        System.out.println("Minimum score: " + result);
    }
}
