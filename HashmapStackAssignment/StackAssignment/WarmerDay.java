package StackAssignment;

import java.util.Arrays;
import java.util.Stack;

public class WarmerDay {

	public static int[] nxtWarmDay(int []tem) {
		Stack<Integer> stack = new Stack<>();
		int n = tem.length;
		int [] nge = new int[n];
		
		for(int i=0;i<n;i++) nge[i] = 0;
		
		for(int i=n-2;i>=0;i--) {
			while(!stack.empty() && tem[stack.peek()] <= tem[i]) stack.pop();
			if(!stack.empty()) nge[i] = stack.peek()-i;
			stack.push(i);
		}
		return nge;
	}
	
	public static void main(String[] args) {
		int[] temperature = {73,74,75,71,69,72,76,73};
		int[] ans = nxtWarmDay(temperature);
		System.out.println("required output is : " + Arrays.toString(ans));
	}
}
