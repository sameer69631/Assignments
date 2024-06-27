package DivideAndConquerAssignment;

import java.util.Arrays;

public class SortingSwapEleInArray {

	public static void main(String[]args) {
		int arr[] = {3, 8, 6, 7, 5, 9, 10};
		int x=-1,y=-1,prev=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[prev] > arr[i]) {
				if (x==-1) x=prev;
				else y=i;
			}
			prev = i;
		}
		if (x>-1 && y>-1 && x!=y) {
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
