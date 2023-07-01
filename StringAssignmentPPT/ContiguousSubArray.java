package StringAssignmentPPT;

import java.util.*;
public class ContiguousSubArray {
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);

            if (countMap.containsKey(count)) {
                // If we have seen this count before, update the maximum length
                maxLength = Math.max(maxLength, i - countMap.get(count));
            } else {
                // Store the count ,corresponding index
                countMap.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        int maxLength = findMaxLength(nums);
        System.out.println(maxLength);         // Output is: 2
    }
}
