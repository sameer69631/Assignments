package MockTest;

import java.util.HashSet;

public class UniqueCharacter {

	public static int firstUniqueChar(String str) {
		HashSet<Character> set = new HashSet<>();
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(int i=0; i<set.size(); i++) {
			if (set.contains(str.charAt(i))) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "leetcode";
		int result = firstUniqueChar(str);
		System.out.println(result);
	}
}
