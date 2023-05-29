package NumberSystemAssignment;

import java.util.Scanner;

public class NumberOfSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int setBit = 0;
		
		while(n>0) {
			int unitDigit = n%2;
			if(unitDigit == 1) {
				setBit++;
			}
			n/=2;
		}
		System.out.println("number of set bits are : "+setBit);
	}
}
