package HashMapAssignment;

import java.util.TreeMap;

public class SortedValMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> tMap = new TreeMap<>();
		tMap.put("apple", 4);
		tMap.put("samsung", 3);
		tMap.put("oppo", 1);
		tMap.put("vivo", 2);
		System.out.println(tMap);
	}
}
