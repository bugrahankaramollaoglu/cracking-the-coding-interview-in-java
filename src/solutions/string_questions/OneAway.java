package solutions.string_questions;

/* There are three types of edits that can be performed on strings:
insert a character,remove a character, or replace a character.
Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bae -> false */

public class OneAway {

    public static boolean isOneAway(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // If the length difference is greater than 1, more than one edit is required
        if (Math.abs(len1 - len2) > 1) return false;

        // If lengths are the same, check for one replacement
        if (len1 == len2) {
            return oneReplacementAway(str1, str2);
        }

        // If lengths differ by 1, check for one insertion/deletion
        if (len1 + 1 == len2) {
            return oneInsertionAway(str1, str2);
        } else if (len1 - 1 == len2) {
            return oneInsertionAway(str2, str1); // Ensure str1 is always the shorter one
        }

        return false;
    }

    // Check if we can convert str1 to str2 by replacing exactly one character
    private static boolean oneReplacementAway(String str1, String str2) {
        boolean foundDifference = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (foundDifference) {
                    return false; // More than one replacement needed
                }
                foundDifference = true;
            }
        }
        return true; // Either zero or one replacement was made
    }

    // Check if we can convert shorter to longer by inserting exactly one character
    private static boolean oneInsertionAway(String shorter, String longer) {
        int i = 0, j = 0;
        boolean foundDifference = false;

        while (i < shorter.length() && j < longer.length()) {
            if (shorter.charAt(i) != longer.charAt(j)) {
                if (foundDifference) {
                    return false; // More than one insertion/deletion required
                }
                foundDifference = true;
                j++; // Move the longer string index forward
            } else {
                i++;
                j++;
            }
        }
        return true; // Either zero or one insertion was needed
    }

    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));  // true
        System.out.println(isOneAway("pales", "pale")); // true
        System.out.println(isOneAway("pale", "bale"));  // true
        System.out.println(isOneAway("pale", "bae"));   // false
    }
}
