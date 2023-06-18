package RecursionAssignment;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static int digitCount(int n) {
		if(n<=9) {
			return 1;
		}
		return 1 + digitCount(n/10);
	}
	
	public static boolean findArmstrong(int n) {
		int temp=n;
		double sum=0;
		int numOfDigits=digitCount(n);
		while(temp>0) {	
			int unitDigit=temp%10;
			sum += Math.pow(unitDigit, numOfDigits);
			temp=temp/10;
		}

		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		boolean result = findArmstrong(n);
		System.out.println(result);
		
	}
}
