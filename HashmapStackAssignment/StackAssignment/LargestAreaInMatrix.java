package StackAssignment;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaInMatrix {

	public static void main(String[] args) {
		int matrix[][] = {{1,0,1,0,0},
		                  {1,0,1,1,1},
		                  {1,1,1,1,1},
		                  {1,0,0,1,0}};
		int curArr[] = matrix[0];
		int maxArea = maxAreaHist(curArr);
		for(int i=1;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==1) curArr[j]+=1;
				else if(matrix[i][j]==0) curArr[j]=0;
			}
			maxArea = Math.max(maxArea, maxAreaHist(curArr));
		}
		System.out.println("max area int matrix containing 1 is : "+maxArea);
	}
	
	public static int maxAreaHist(int arr[]) {
		Stack<Integer> stack = new Stack<>();
		int n = arr.length;
		int nse[] = new int[n];
		int pse[] = new int[n];
		
		for(int i=1;i<n;i++) {
			while(!stack.empty() && arr[stack.peek()] > arr[i]) {
				nse[stack.pop()] = i;
			}
			stack.push(i);
		}
		while(!stack.empty()) {
			nse[stack.pop()] = n;
		}
		
		for(int i=n-1;i>=0;i--) {
			while(!stack.empty() && arr[stack.peek()] > arr[i]) {
				pse[stack.pop()] = i;
			}
			stack.push(i);
		}
		while(!stack.empty()) {
			pse[stack.pop()] = -1;
		}
		
		int max = 0;
		for(int i=0;i<n;i++) {
			int breadth = nse[i] - pse[i] - 1;
			max = Math.max(breadth*arr[i], max);
		}
		return max;
	}
}
