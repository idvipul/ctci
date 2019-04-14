package ch1_arrays_and_strings;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsUnique {

    // using additional ds
    private static boolean isUniqueChars(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // convert str to arr
        char[] chars = str.toCharArray();

        // using set -- better approach
        Set<Character> set = new HashSet<>();

        for (char ch: chars) {
            if (set.contains(ch)) {
                return false;
            } else {
                set.add(ch);
            }
        }

        // using hash map
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char ch : chars) {
//            if (map.containsKey(ch)) {
//                return false;
//            } else {
//                map.put(ch, 1);
//            }
//        }

        return true;
    }

    // without using additional ds
    private static boolean isUniqueChar(String str) {
        if (str == null || str.isEmpty() || str.length() > 256) {
            return false;
        }

        boolean[] charSet = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int asciiVal = str.charAt(i);

            if (charSet[asciiVal]) {
                return false;
            } else {
                charSet[asciiVal] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};

        for (String word: words) {
            System.out.println(word + ": " + isUniqueChars(word) + ", " + isUniqueChar(word));
        }
    }

}
