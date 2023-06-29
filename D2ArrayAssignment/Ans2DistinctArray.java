package D2ArrayAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ans2DistinctArray {

	public static List<List<Integer>> distinctArray(List<List<Integer>> ans,int nums1[],int nums2[]){
		HashSet<Integer> set = new HashSet<>();
		List<Integer> temp = new ArrayList<>();
		List<Integer> temp2 = new ArrayList<>();
		for (int num : nums1) {
			set.add(num);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (!set.contains(nums2[i]) && temp.size()<=2) {
				temp.add(nums2[i]);
			}
		}
		ans.add(temp);
		set.clear();
		for (int num : nums2) {
			set.add(num);
		}
		for (int i = 0; i < nums1.length; i++) {
			if (!set.contains(nums1[i]) && temp2.size()<=2) {
				temp2.add(nums1[i]);
			}
		}
		ans.add(temp2);
		return ans;
	}
	
	public static void main(String[] args) {
		int nums1[] = {1,2,3};
		int nums2[] = {2,4,6};
		List<List<Integer>> ans = new ArrayList<>();
		ans = distinctArray(ans, nums1, nums2);
		System.out.println(ans);
	}
}
