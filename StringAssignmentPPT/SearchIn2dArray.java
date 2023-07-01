package StringAssignmentPPT;

public class SearchIn2dArray {
	
	public static boolean binary2DSearch(int arr[][],int target) {
		boolean result = false;
		
		int r=arr.length,  c=arr[0].length;
		int low=0,high=r*c-1;
		
		while(low<=high) {
			int midIdx = low+(high-low)/2;
			int rowIdx = midIdx/c;
			int colIdx = midIdx%c;
			int midElement = arr[rowIdx][colIdx];
			if (midElement==target) {
				result = true;
			}
			if(midElement<target) {
				low=midIdx+1;
			}else {
				high=midIdx-1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[][] = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60}};
		int target = 3;
		boolean result = binary2DSearch(arr,target);
		System.out.println(result);
	}
}

