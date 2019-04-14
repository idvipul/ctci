package ch1_arrays_and_strings;

public class IsRotation {

    private static boolean isSubstring(String larger, String smaller) {
        return larger.contains(smaller);
    }

    private static boolean isRotation(String str1, String str2) {
        if (str1.length() == str2.length() && str1.length() > 0) {
            String contatenatedString = str1 + str1;
            return isSubstring(contatenatedString, str2);
        }

        return false;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};

        for (String[] pair: pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean isRotation = isRotation(word1, word2);
            System.out.println(word1 + "," + word2 + " -> " + isRotation);
        }
    }
}
