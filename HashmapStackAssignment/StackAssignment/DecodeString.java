package StackAssignment;

import java.util.*;
import java.util.Stack;

import javax.swing.plaf.synth.SynthProgressBarUI;

public class DecodeString {
	
	public static String decodeString(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			if (ch!=']') {
				stack.push(ch);
			}
			else {
				StringBuilder sb = new StringBuilder();
				while (stack.peek()!='[') {
					sb.append(stack.pop());
				}
				stack.pop();
				int k = 0;
				int base = 1;
				while (!stack.empty() && Character.isDigit(stack.peek())) {
					k=stack.pop()-'0'*base+k;
					base*=10;
				}
				while (k-->0) {
					for(int i=sb.length()-1;i>=0;i--) {
						stack.push(sb.charAt(i));
					}
				}
			}
		}
		char[]result = new char[stack.size()];
		for(int i=stack.size()-1;i>=0;i--) {
			result[i]=stack.pop();
		}
		return new String(result);
	}
	
	public static void main(String[] args) {
		String str = "3[ab2[cd]]";
		System.out.println(decodeString(str));
	}
}
