package solutions.string_questions;

import java.util.Arrays;

public class CheckPermutation {

    /*  Given two strings, write a method to decide
    if one is a permutation of the other.
    assume it is case-sensitive and whitespace matters */

    // solution 1) sort the strings

    static String sortStrings(String s) {
        char[] letters = s.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    static boolean checkPermutation(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        return sortStrings(s1).equals(sortStrings(s2));
    }


    // solution 2) check if strings have identical character counts
    public static boolean checkPermutation2(String s1, String s2) {

        // strings of different length cannot be permutations
        if (s1.length() != s2.length())
            return false;


        int[] char_set = new int[128];

        char[] s1_chars = s1.toCharArray();

        for (char c : s1_chars) {
            char_set[c]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int ch = (int) s2.charAt(i);
            char_set[ch]--;
            if (char_set[ch] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "bugra";
        String s2 = "gruba";
        String s3 = "bugab";

        System.out.print(checkPermutation(s1, s2));
        System.out.print(" = " + checkPermutation2(s1, s2) + "\n");

        System.out.print(checkPermutation(s1, s3));
        System.out.print(" = " + checkPermutation2(s1, s3) + "\n");

    }


}
