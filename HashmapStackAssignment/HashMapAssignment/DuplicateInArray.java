package HashMapAssignment;

import java.util.HashMap;

public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4};
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean temp = false;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				temp = true;
				break;
			}
			map.put(arr[i], i);
		}
		if (temp == true) System.out.println("yes");
		else System.out.println("no");
	}
}
