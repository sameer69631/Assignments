package D2ArrayAssignment2;

import java.util.Arrays;

public class Ans1ArrayToMatrix {

	public static int[][] arrayToMatrix(int arr[], int m, int n){
		int matrix[][] = new int[m][n];
		int ind = 0;
		if (arr.length == m*n) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = arr[ind];
					ind++;
				}
			}
		}
		else {
			return matrix;
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		int original[] = {1,2,3,4};
		int m = 2, n = 2;
		for (int i[] : arrayToMatrix(original, m, n)) {
			System.out.println(Arrays.toString(i));
		}
	}
}
