package StringAssignmentPPT2;

import java.nio.file.WatchKey;

public class ReverseKChar {

	public static String reverseChar(String s , int k) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i+=2*k) {
			int left = i;
			int right = (i+k)-1;
			if (right > ch.length) {
				right = ch.length;
			}
			while(left < right) {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String s = "abcdefg";
		System.out.println(reverseChar(s, 2));
	}
}
