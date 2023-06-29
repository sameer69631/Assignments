package D2ArrayAssignment;

import java.util.Arrays;

public class Ans3TransposeMatrix {

	public static void transpose(int matrix[][]) {
		int n = matrix.length;
		for(int i=0; i<n; i++) {
			for (int j =i+1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int matrix[][] = {{2,4,-1},
				          {-10,5,11},
				          {18,-7,6}};
		transpose(matrix);
		for (int[] i : matrix) {
			System.out.println(Arrays.toString(i));
			System.out.println();
		}
	}
}
