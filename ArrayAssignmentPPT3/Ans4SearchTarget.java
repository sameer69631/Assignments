package ArrayAssignmentPPT3;

public class Ans4SearchTarget {

	public static void searchTarget(int arr[],int target) {
		int low = 0;
		int high = arr.length-1;
		int index = -1;
		while(low <= high) {
			int mid = low+(high-low)/2;
			if (arr[mid] == target) {
				index = mid;
				break;
			}
			else if (arr[mid] > target) {
				high = mid-1;
			}
			else if (arr[mid] < target) {
				low = mid+1;
			}
		}
		if (index >= 0) {
			System.out.println("the element is present at inded : "+index);
		}
		else if (index < 0) {
			System.out.println("element is not present if inserted it would be at : "+low);
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		int target = 5;
		searchTarget(nums, target);
	}
}
