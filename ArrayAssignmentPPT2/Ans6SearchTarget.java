package ArrayAssignmentPPT2;

import javax.swing.text.Highlighter.Highlight;

public class Ans6SearchTarget {

	public static int searchInArray(int nums[],int target) {
		int result = -1;
		int left = 0;
		int right = nums.length-1;
		while(left <= right) {
			int mid = left+(right-left)/2;
			if (nums[mid] == target) {
				result = mid;
				break;
			}
			else if (nums[mid] < target) {
				left = mid+1;
			}
			else if (nums[mid] > target) {
			    right = mid-1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int nums[] = {-1,0,3,5,9,12};
		int target = 9;
		int result = searchInArray(nums, target);
		System.out.println(result);
	}
}
