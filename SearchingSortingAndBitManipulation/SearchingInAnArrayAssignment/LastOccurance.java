package SearchingInAnArrayAssignment;

import java.util.Scanner;

//Answer-2
public class LastOccurance {
	
	public static void lastOccurance(int arr[],int target) {
		int result=-1;
		int low = 0, high = arr.length-1;
		
		for(int i=0;low<=high;i++) {
			int midIndex = low+(high-low)/2;
			if(arr[midIndex]==target) {
				result=midIndex;
				low = midIndex+1;
			}
			else if(arr[midIndex]<target) {
				low=midIndex+1;
			}
			else {
				high=midIndex-1;
			}
				
		}
		
		if(result != -1) {
			System.out.println("last occurance of given element is :" +result);
		}else {
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter target element");
		int target = sc.nextInt();
		
		lastOccurance(arr,target);
	}
}
