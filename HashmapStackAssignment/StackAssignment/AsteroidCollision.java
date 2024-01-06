package StackAssignment;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

	public static int[] allCollisions(int []asteroid) {
		Stack<Integer> stack = new Stack<>();
		stack.push(asteroid[0]);
		for(int i=1;i<asteroid.length;i++) {
			if (asteroid[i]<0) {
				if (stack.peek() > Math.abs(asteroid[i])) {
					continue;
				}
				else {
					if (Math.abs(asteroid[i]) == stack.peek()) {
						stack.pop();
						continue;
					}
					while (!stack.empty() && stack.peek() > 0 && Math.abs(asteroid[i]) > stack.peek()) {
						stack.pop();
					}
				}
			}
			else {
				stack.push(asteroid[i]);
			}
		}
		
		int arr[] = new int[stack.size()];
		int n = arr.length;
		for(int i=n-1;i>=0;i--) {
			arr[i] = stack.pop();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int []asteroid = {5,10,-5};
		int[]result = allCollisions(asteroid);
		System.out.println(Arrays.toString(result));
	}
}
