package NumberSystemAssignment;

import java.util.Scanner;

public class OddEvenBitManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		
		if((number & 1) == 1) {
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
	}
}
