package solutions.string_questions;

/*  Detect If Linked List Has A Loop
* An easy way to detect if a linked list has a loop is through the FastRunner / SlowRunner approach.
FastRunner moves two steps at a time, while SlowRunner moves one step.  */

public class LoopDetect {
    public static class ReverseString {

        public static String reverseString(String s) {
            return new StringBuilder(s).reverse().toString();
        }

        // two pointer technique
        // O(n) complexity (n is the length of string)
        public static String reverseString2(String s) {
            char[] chars = s.toCharArray();
            int left = 0, right = chars.length - 1;

            while (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }

            return new String(chars);
        }

        public static void main(String[] args) {
            System.out.println("reversed: " + reverseString("bugrahan"));
            System.out.println("reversed: " + reverseString2("bugrahan"));
        }

    }
}
