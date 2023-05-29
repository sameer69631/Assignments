package SearchingInAnArrayAssignment;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check it is perfect square or not");
		int num = sc.nextInt();
		
		int low=0,high=num/2;
		int result = -1;
		while(low<=high) {
			int midVal = low+(high-low)/2;
			
			if(midVal*midVal==num) {
				result=midVal;
				break;
			}
			else if (midVal*midVal<num) {
				low=midVal+1;
			}
			else {
				high=midVal-1;
			}
		}
		
		if(result!=-1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
			
	}
}
