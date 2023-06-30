package D2ArrayAssignment2;

public class Ans5DifferenceValue {

	public static int differenceValue(int arr1[],int arr2[],int d) {
		int difference = -1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				int sub = Math.abs(arr1[i]-arr2[j]);
				if (sub <= d && sub > difference) {
					difference = sub;
					if (difference == d) {
						return difference;
					}
				}
			}
		}
		return difference;
	}
	
	public static void main(String[] args) {
		int arr1[] = {4,5,8};
		int arr2[] = {10,9,1,8};
		int d = 2;
		System.out.println(differenceValue(arr1, arr2, d));
	}
}
