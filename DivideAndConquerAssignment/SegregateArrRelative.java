package DivideAndConquerAssignment;

import java.util.Arrays;

public class SegregateArrRelative {

	public static void segregateArr(int arr[]) {
		int resArr[] = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<0) {
				resArr[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
				resArr[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(resArr));
	}
	
	public static void main(String[] args) {
		int arr[] = {19, -20, 7, -4, -13, 11, -5, 3};
		segregateArr(arr);
	}
}
