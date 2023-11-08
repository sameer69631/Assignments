package BacktrackingAssignment;
import java.util.*;

public class AllPossiblePermutations {

	public static List<List<Integer>> allPermutations(int arr[],List<List<Integer>> res,List<Integer>temp){
		if (temp.size() == arr.length) {
			res.add(new ArrayList<>(temp));
		}
		for(int i=0;i<arr.length;i++) {
			if (temp.contains(arr[i])) {
				continue;
			}
			temp.add(arr[i]);
			allPermutations(arr, res, temp);
			temp.remove(temp.size()-1);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,3};
		List<List<Integer>> result = new ArrayList<>();
		result = allPermutations(arr, result, new ArrayList<>());
		System.out.println(result);
	}
}
