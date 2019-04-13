package ch1_arrays_and_strings;

import java.util.HashMap;

public class isPermutation {

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch: str1.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch: str2.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};

        for (String[] pair: pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = isAnagram(word1, word2);
            System.out.println(word1 + ", " + word2 + " -> " + anagram);
        }
    }
}
