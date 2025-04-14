package solutions.string_questions;

public class URLify {
    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "bugra kara molla";
        System.out.println(replaceSpaces(s)); // Output: "bugra%20kara%20molla"
    }
}
