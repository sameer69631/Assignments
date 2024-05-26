package GreedyAlgorithmAssignment;

public class MinProductSum {

	public static void arrayModification(int a[],int b[],int k) {
		int minProductIdx = -1;
		int product = 0;
		int minProduct = 0;
		for(int i=0;i<a.length;i++) {
			if (a[i] >= 0 && b[i] >=0) {
				int temp = a[i] - k*2;
				product = temp*b[i];
			}else if (a[i]<0 && b[i]<0) {
				int temp = a[i] + k*2;
				product = temp*b[i];
			}else if (a[i]>=0 && b[i]<0) {
				int temp = a[i] + k*2;
				product = temp * b[i];
			}else {
				int temp = a[i] - k*2;
				product = temp * b[i];
			}
			if (product < minProduct) {
				minProduct = product;
				minProductIdx = i;
			}else if (product == minProduct) {
				if (a[i]*b[i] > a[minProductIdx]*b[minProductIdx]) {
					minProduct = product;
					minProductIdx = i;
				}
			}
		}
		if (a[minProductIdx] >= 0) {
			a[minProductIdx] -= k*2;
		}else {
			a[minProductIdx] += k*2;
		}
	}
	
	public static void main(String[] args) {
		int a[] = {2,3,4,5,4};
		int b[] = {3,4,2,3,2};
		int k = 3; // k is modification
		arrayModification(a,b,k);
		int minSum = 0;
		for(int i=0;i<a.length;i++) {
			minSum += a[i]*b[i];
		}
		System.out.println("min sum is : " + minSum);
	}
}
