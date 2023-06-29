package D2ArrayAssignment;

import java.util.*;

public class Ans1ThreeArrayInteger {

	public static void intIn3Arrays(int arr1[],int arr2[],int arr3[],List<Integer> result) {
		int n = arr1.length;
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		while(p1<n && p2<n && p3<n) {
			if (arr1[p1] == arr2[p2] && arr1[p1] == arr3[p3] && arr2[p2] == arr3[p3]) {
				result.add(arr1[p1]);
				p1++;
				p2++;
				p3++;
			}
			else if (arr1[p1] < arr2[p2] || arr1[p1] < arr3[p3]) {
				p1++;
			}
			else if (arr2[p2] < arr1[p1] || arr2[p2] < arr3[p3]) {
				p2++;
			}
			else if (arr3[p3] < arr1[p1] || arr3[p3] < arr2[p2]) {
				p3++;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,5,7,9};
		int arr3[] = {1,3,4,5,8};
		intIn3Arrays(arr1, arr2, arr3, new ArrayList<>());
	}
}
