package ArrayAssignmentPPT2;

public class Ans7MonotonicArray {

	public static boolean isMonotonic(int nums[]) {
		boolean increasing = true;
		boolean decreasing = true;
		boolean monotonic = false;
		for(int i=0; i<nums.length-1; i++) {
			if (nums[i] < nums[i+1]) {
				decreasing = false;
				break;
			}
		}
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] > nums[i+1]) {
				increasing = false;
				break;
			}
		}
		if (increasing == true || decreasing == true) {
			monotonic = true;
		}
		return monotonic;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,2,2,3};
		boolean monotonic = isMonotonic(nums);
		System.out.println(monotonic);
	}
}
