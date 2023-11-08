package RecursionAssignment;

import java.util.ArrayList;
import java.util.List;

public class AnagramIndices {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] pCharCounts = new int[26];
        int[] windowCharCounts = new int[26];

        for (char c : p.toCharArray()) {
            pCharCounts[c - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            windowCharCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isAnagram(pCharCounts, windowCharCounts)) {
                result.add(i);
            }

            windowCharCounts[s.charAt(i) - 'a']--;
            if (i + p.length() < s.length()) {
                windowCharCounts[s.charAt(i + p.length()) - 'a']++;
            }
        }

        return result;
    }

    private boolean isAnagram(int[] pCharCounts, int[] windowCharCounts) {
        for (int i = 0; i < 26; i++) {
            if (pCharCounts[i] != windowCharCounts[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        AnagramIndices anagramIndices = new AnagramIndices();
        List<Integer> indices = anagramIndices.findAnagrams(s, p);

        System.out.println(indices);
    }
}

