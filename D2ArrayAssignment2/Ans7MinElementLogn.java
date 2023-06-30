package D2ArrayAssignment2;

public class Ans7MinElementLogn {

	public static int minElement(int arr[]) {
		int n = arr.length;
		int left = 0;
		int right = n-1;
		while(left < right) {
			int mid = left+(right-left)/2;
			if (arr[mid] > arr[mid+1]) {
				left = mid+1;
			}
			else if (arr[mid] < arr[mid+1]) {
				right = mid;
			}
		}
		if (arr[left] < arr[right]) {
			return arr[left];
		}else {
			return arr[right];
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {3,4,5,1,2};
		System.out.println(minElement(nums));
	}
}
