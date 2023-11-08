package StringAssignmentPPT2;

import java.awt.RenderingHints.Key;

public class ReverseWordsInString {

	public static String reverseWords(String s) {
		String words[] = s.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word : words) {
			String revesedWord = reverseString(word);
			result.append(revesedWord).append(" ");
		}
		return result.toString().trim();
	}
	
	public static String reverseString(String str) {
		char chars[] = str.toCharArray();
		int left = 0;
		int right = chars.length-1;
		while(left<right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}
	
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String reversed = reverseWords(s);
		System.out.println(reversed);
	}
}
