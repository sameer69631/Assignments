package GreedyAlgorithmAssignment;

import java.util.*;

public class NoOfIntervalToRemove {

	public static int getNoOfIntervalToRemove(int arr[][]) {
		Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));
		int curr[] = {arr[0][0],arr[0][1]};
		int count = 0;
		int maxCap = 1;
		for(int i=1;i<arr.length;i++) {
			if (arr[i][0] < curr[1]) continue;
			curr[0]=arr[i][0];
			curr[1]=arr[i][1];
			maxCap++;
		}
		return arr.length-maxCap;
	}
	
	public static void main(String[] args) {
		int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
		int res = getNoOfIntervalToRemove(intervals);
		System.out.println("no of intervals to remove : "+ res);
		for(int a[] : intervals) {
			System.out.print(Arrays.toString(a));
		}
	}
}
