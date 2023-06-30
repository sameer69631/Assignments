package D2ArrayAssignment2;

import java.util.*;
public class Ans8DoubledArray {

	public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 == 1) {
            return new int[0];
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : changed) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> original = new ArrayList<>();
        for (int num : changed) {
            if (freq.get(num) == 0) {
                continue;
            }
            freq.put(num, freq.get(num) - 1);
            int doubleNum = num * 2;
            if (!freq.containsKey(doubleNum) || freq.get(doubleNum) == 0) {
                return new int[0];
            }
            freq.put(doubleNum, freq.get(doubleNum) - 1);
            original.add(num);
        }

        if (original.size() * 2 != changed.length) {
            return new int[0];
        }

        int[] result = new int[original.size()];
        for (int i = 0; i < original.size(); i++) {
            result[i] = original.get(i);
        }

        return result;
    }
	
	public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}
