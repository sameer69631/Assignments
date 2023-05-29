package NumberSystemAssignment;

import java.util.Scanner;

public class OddDublicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int xor=0;
		for(int i:arr) {
			xor^=i;
		}
		
		
		System.out.println("the odd occurring element is : "+xor);
	}
}
