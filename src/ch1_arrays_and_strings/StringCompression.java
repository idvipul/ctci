package ch1_arrays_and_strings;

public class StringCompression {

    private static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        StringBuilder compressedStr = new StringBuilder();
        int count = 1;
        char current = 0;

        for(int i = 0; i < str.length() - 1; i++) {
            current = str.charAt(i);
            char next = str.charAt(i + 1);

            if (current != next) {
                compressedStr.append(current);
                compressedStr.append(count);
                count = 1;
            } else {
                count++;
            }
        }

        // appending last set of characters
        compressedStr.append(current);
        compressedStr.append(count);

        if (str.length() > compressedStr.length()) {
            return compressedStr.toString();
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        String res = compressString(str);
        System.out.println(res);
    }
}
