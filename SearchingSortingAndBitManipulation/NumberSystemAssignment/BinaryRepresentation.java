package NumberSystemAssignment;

import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int decimalNumber = sc.nextInt();
		int binary = 0;
		int power=1;
		
		while(decimalNumber>0) {
			int parity = decimalNumber%2;
			binary+=parity*power;
			power*=10;
			decimalNumber/=2;
		}
		
		System.out.println("binary representation of given number is : "+binary);
	}
}
