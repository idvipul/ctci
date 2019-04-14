package ch1_arrays_and_strings;

public class URLify {

    private static String replaceSpaces(String str, int length) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        String replacement = "%20";
        StringBuilder sb = new StringBuilder();

        for (char ch: str.toCharArray()) {
            if (ch == ' ') {
                sb.append(replacement);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Mr John Smith";
        String res = replaceSpaces(str, str.length());
        System.out.println(res);
    }
}