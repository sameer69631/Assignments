package RecursionAssignment;

import java.util.Scanner;

public class AlternateSignSum {
	
	public static int alternateSignSum(int n) {
		int result = 0;
		if(n==1) {
			return n;
		}
		if (n%2==0) {
			result = alternateSignSum(n-1)-n;
		}
		else {
			result = alternateSignSum(n-1)+n;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number n :");
		int n=sc.nextInt();
		
		int result = alternateSignSum(n);
		System.out.println(result);
	}
}
