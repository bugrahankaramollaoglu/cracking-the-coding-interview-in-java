package solutions.string_questions;

public class ReverseString {

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left= 0, right = chars.length - 1;
        while (left < right) {
            char tmp = chars[right];
            chars[right] = chars[left];
            chars[left] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static String reverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("reality"));
        System.out.println(reverseString2("reality"));
    }


}
