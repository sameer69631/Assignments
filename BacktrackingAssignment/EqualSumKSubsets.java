<<<<<<< HEAD
package BacktrackingAssignment;

public class EqualSumKSubsets {

	public boolean canPartitionKSubset(int nums[],int k) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		if(sum % k != 0) {
			return false;
		}
		int target = sum/k;
		boolean used[] = new boolean[nums.length];
		return canSubset(nums, used, k, 0, 0, target);
	}
	
	private boolean canSubset(int nums[],boolean used[], int k,int start,int currSum,int target) {
		if (k == 0) {
			return true;
		}
		if (currSum == target) {
			return canSubset(nums, used, k-1, 0, 0, target);
		}
		for(int i=start;i<nums.length;i++) {
			if (!used[i] && currSum+nums[i] <= target) {
				used[i] = true;
				if(canSubset(nums, used, k, i+1, currSum+nums[i], target)) {
					return true;
				}
				used[i] = false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,3,2,2};
		int k = 2;
		
		EqualSumKSubsets e = new EqualSumKSubsets();
		boolean result = e.canPartitionKSubset(nums, k);
		System.out.println(result);
	}
}
=======
package BacktrackingAssignment;

public class EqualSumKSubsets {

	public boolean canPartitionKSubset(int nums[],int k) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		if(sum % k != 0) {
			return false;
		}
		int target = sum/k;
		boolean used[] = new boolean[nums.length];
		return canSubset(nums, used, k, 0, 0, target);
	}
	
	private boolean canSubset(int nums[],boolean used[], int k,int start,int currSum,int target) {
		if (k == 0) {
			return true;
		}
		if (currSum == target) {
			return canSubset(nums, used, k-1, 0, 0, target);
		}
		for(int i=start;i<nums.length;i++) {
			if (!used[i] && currSum+nums[i] <= target) {
				used[i] = true;
				if(canSubset(nums, used, k, i+1, currSum+nums[i], target)) {
					return true;
				}
				used[i] = false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,3,2,2};
		int k = 2;
		
		EqualSumKSubsets e = new EqualSumKSubsets();
		boolean result = e.canPartitionKSubset(nums, k);
		System.out.println(result);
	}
}
>>>>>>> 65e5b2cfe88fb188bf2338e58af447bf901517d7
