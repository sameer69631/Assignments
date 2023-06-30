package D2ArrayAssignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Ans4DistinctIntegerList {

	public static List<List<Integer>> distinctIntList(List<List<Integer>> ans,int arr1[],int arr2[]){
		HashSet<Integer> set = new HashSet<>();
		List<Integer> temp1 = new ArrayList<>();
		List<Integer> temp2 = new ArrayList<>();
		for (int i : arr2) {
			set.add(i);
		}
		for (int i = 0; i < arr1.length; i++) {
			if (!set.contains(arr1[i])) {
				temp1.add(arr1[i]);
			}
		}
		ans.add(temp1);
		set.clear();
		for (int i : arr1) {
			set.add(i);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (!set.contains(arr2[i])) {
				temp2.add(arr2[i]);
			}
		}
		ans.add(temp2);
		return ans;
	}
	
	public static void main(String[] args) {
		int nums1[] = {1,2,3};
		int nums2[] = {2,4,6};
		List<List<Integer>> ans = new ArrayList<>();
		System.out.println(distinctIntList(ans, nums1, nums2));
	}
}
