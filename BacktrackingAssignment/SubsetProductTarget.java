<<<<<<< HEAD
package BacktrackingAssignment;

import java.util.ArrayList;
import java.util.List;

public class SubsetProductTarget {

	public static boolean subsetProductTarget(int arr[],int target,int product,int start) {
		if(start == arr.length) return (target == product);
		boolean answer = false;
		product *= arr[start];
		answer |= subsetProductTarget(arr, target, product, start+1);
		product /= arr[start];
		answer |= subsetProductTarget(arr, target, product, start+1);
		return answer;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,2,5,4};
		int target = 16;
//		boolean result = subsetProductTarget(arr,target,1,0);
		System.out.println(subsetProductTarget(arr,target,1,0)? "yes":"no");
	}
}
=======
package BacktrackingAssignment;

import java.util.ArrayList;
import java.util.List;

public class SubsetProductTarget {

	public static boolean subsetProductTarget(int arr[],int target,int product,int start) {
		if(start == arr.length) return (target == product);
		boolean answer = false;
		product *= arr[start];
		answer |= subsetProductTarget(arr, target, product, start+1);
		product /= arr[start];
		answer |= subsetProductTarget(arr, target, product, start+1);
		return answer;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,2,5,4};
		int target = 16;
//		boolean result = subsetProductTarget(arr,target,1,0);
		System.out.println(subsetProductTarget(arr,target,1,0)? "yes":"no");
	}
}
>>>>>>> 65e5b2cfe88fb188bf2338e58af447bf901517d7
