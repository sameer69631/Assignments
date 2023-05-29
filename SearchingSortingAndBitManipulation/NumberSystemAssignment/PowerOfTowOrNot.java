package NumberSystemAssignment;

import java.util.Scanner;

public class PowerOfTowOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int num=1;
		while(num<n) {
			num*=2;
		}
		if(num==n) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
