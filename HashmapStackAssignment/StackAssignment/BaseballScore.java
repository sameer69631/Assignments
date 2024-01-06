package StackAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballScore {

	public static int calPoints(String[] opr) {
		int sum = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<opr.length;i++) {
			if(opr[i].equals("+")) {
				int temp = stack.pop();
				int temp2 = stack.pop();
				int tempSum = temp+temp2;
				sum+=tempSum;
				stack.push(temp2);
				stack.push(temp);
				stack.push(tempSum);
			}
			else if (opr[i].equals("D")) {
				int temp = stack.pop();
				int prDouble = 2*temp;
				sum+=prDouble;
				stack.push(temp);
				stack.push(prDouble);
			}
			else if (opr[i].equals("C")) {
				int cancel = stack.pop();
				sum-=cancel;
			}
			else {
				int temp = Integer.parseInt(opr[i]);
				stack.push(temp);
				sum+=temp;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String []opr = {"5" , "2" , "C" , "D" , "+"};
		int result = calPoints(opr);
		System.out.println(result);
	}
}
