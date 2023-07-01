package StringAssignmentPPT;

import java.util.Arrays;

public class MinimumProductSum {
    public static int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int minSum = 0;

        for (int i = 0; i < n; i++) {
            minSum += nums1[i] * nums2[n - i - 1];
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 3, 4, 2};
        int[] nums2 = {4, 2, 2, 5};
        int minSum = minProductSum(nums1, nums2);
        System.out.println(minSum);
    }
}
