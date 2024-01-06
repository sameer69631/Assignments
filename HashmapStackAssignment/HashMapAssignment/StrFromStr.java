package HashMapAssignment;

import java.util.HashMap;
import java.util.Map;

public class StrFromStr {

	// checking ransomeNote string can be create from magazine or not
	public static void main(String[] args) {
		String rn = "aa";
		String mg = "aabc";
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		
		for(int i=0;i<rn.length();i++) {
			if(hm1.containsKey(rn.charAt(i))) hm1.put(rn.charAt(i), hm1.get(rn.charAt(i))+1);
			else hm1.put(rn.charAt(i), 1);
		}
		
		for(int i=0;i<mg.length();i++) {
			if(hm2.containsKey(mg.charAt(i))) hm2.put(mg.charAt(i), hm2.get(mg.charAt(i))+1);
			else hm2.put(mg.charAt(i), 1);
		}
		int answer = 1;
		for(Map.Entry<Character, Integer> e:hm1.entrySet()) {
			if (e.getValue() > hm2.get(e.getKey())) {
				System.out.println(false);
				answer = -1;
				break;
			}
		} 
		if(answer == 1) System.out.println(true);
	}
}
