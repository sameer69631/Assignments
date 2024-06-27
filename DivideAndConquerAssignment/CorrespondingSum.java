package DivideAndConquerAssignment;

import java.util.Arrays;
import java.util.Comparator;

public class CorrespondingSum {

	public static void checkCorrespSum(Integer a[],Integer b[],int k) {
		Arrays.sort(a);
		Arrays.sort(b,Comparator.reverseOrder());
		for(int i=0;i<a.length;i++) {
			if (a[i]+b[i]<k) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	
	public static void main(String[] args) {
		Integer a[] = {2, 0, 3};
		Integer b[] = {7, 8, 9};
		int k=10;
		checkCorrespSum(a,b,k);
	}
}
