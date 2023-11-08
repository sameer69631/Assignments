package StringAssignmentPPT2;

import java.util.HashMap;

public class StrobogramaticNumber {

	public static boolean isStrobogramatic(String num) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('6', '9');
		map.put('9', '6');
		map.put('8', '8');
		
		int start = 0, end = num.length()-1;
		while (start <= end) {
			if (num.charAt(start++) != map.getOrDefault(num.charAt(end--), ' ')) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String num = "69";
		System.out.println(isStrobogramatic(num));
	}
}
