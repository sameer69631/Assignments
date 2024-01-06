package HashMapAssignment;

import java.util.HashMap;
import java.util.TreeMap;

public class SortedKeysMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(5, "mi");
		map.put(4, "oppo");
		map.put(3, "vivo");
		map.put(2, "samsung");
		map.put(1, "apple");
		System.out.println(map);
	}
}
