package D2ArrayAssignment2;

import java.util.ArrayList;
import java.util.List;

public class Ans6AppearsTwice {

	public static List<Integer> appearsTwice(int arr[]){
		List<Integer> list = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (temp.contains(arr[i])) {
				list.add(arr[i]);
			}
			temp.add(arr[i]);
		}
		return list;
	}
	
	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(appearsTwice(nums));
	}
}
