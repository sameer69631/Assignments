<<<<<<< HEAD
package BacktrackingAssignment;

import java.util.*;

public class PermutationsWithDuplicates {

	public static void printAllPermutations(int arr[]) {
		if (arr == null || arr.length == 0) return;
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		boolean used[] = new boolean[arr.length];
		Arrays.sort(arr);
		dupPermutations(arr,used,result,list);
		for(List<Integer> li : result) {
			for(Integer i : li) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void dupPermutations(int arr[],boolean used[],List<List<Integer>> res,List<Integer> temp) {
		if (temp.size() == arr.length) {
			res.add(new ArrayList<>(temp));
		}
		for(int i=0;i<arr.length;i++) {
			if(used[i]) continue;
			if(i>0 && arr[i-1] == arr[i] && !used[i-1]) continue;
			used[i] = true;
			temp.add(arr[i]);
			dupPermutations(arr, used, res, temp);
			used[i] = false;
			temp.remove(temp.size()-1);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,2};
		printAllPermutations(arr);
	}
}
=======
package BacktrackingAssignment;

import java.util.*;

public class PermutationsWithDuplicates {

	public static void printAllPermutations(int arr[]) {
		if (arr == null || arr.length == 0) return;
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		boolean used[] = new boolean[arr.length];
		Arrays.sort(arr);
		dupPermutations(arr,used,result,list);
		for(List<Integer> li : result) {
			for(Integer i : li) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void dupPermutations(int arr[],boolean used[],List<List<Integer>> res,List<Integer> temp) {
		if (temp.size() == arr.length) {
			res.add(new ArrayList<>(temp));
		}
		for(int i=0;i<arr.length;i++) {
			if(used[i]) continue;
			if(i>0 && arr[i-1] == arr[i] && !used[i-1]) continue;
			used[i] = true;
			temp.add(arr[i]);
			dupPermutations(arr, used, res, temp);
			used[i] = false;
			temp.remove(temp.size()-1);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,2};
		printAllPermutations(arr);
	}
}
>>>>>>> 65e5b2cfe88fb188bf2338e58af447bf901517d7
