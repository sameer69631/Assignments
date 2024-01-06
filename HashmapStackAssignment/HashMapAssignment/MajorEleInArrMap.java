package HashMapAssignment;

import java.util.TreeMap;

public class MajorEleInArrMap {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		int arr[] = {4,2,7,1,9};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			treeMap.put(arr[i],i);
		}
		System.out.println("the major element in array is : "+treeMap.lastEntry().getKey());
	}
}
