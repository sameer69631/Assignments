package ArrayAssignmentPPT2;

import java.util.HashSet;

public class Ans2MaximumCandies {

	public static int maxTypeOfCandy(int candyType[]) {
		HashSet<Integer> set = new HashSet<>();
		int n = candyType.length;
		for (int i = 0; i < n; i++) {
			if (!set.contains(candyType[i])) {
					set.add(candyType[i]);
					if (set.size() == n/2) {
						break;
					}
			}
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		int candyType[] = {1,1,2,2,3,3};
		int result = maxTypeOfCandy(candyType);
		System.out.println("the maximum type candies alice can eat is : " + result);
	}
}
