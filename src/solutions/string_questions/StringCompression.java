package solutions.string_questions;

/*  Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z). */


public class StringCompression {

    public static String stringCompression(String str) {

//        "aabcccccaaa"
//        "a2b1c5a3"

        if (str == null || str.isEmpty() || str.isBlank()) return str;


        StringBuilder returnStr = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char currentChar = str.charAt(i);
            int kounter = 1;

            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                kounter++;
                i++;
            }

            returnStr.append(currentChar).append(kounter);
            i++;

        }

        return returnStr.length() < str.length() ? returnStr.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbbbbbbcc"));
        System.out.println(stringCompression(""));
    }


}
