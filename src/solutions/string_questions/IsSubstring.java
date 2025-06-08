package solutions.string_questions;

import java.util.HashSet;

public class IsSubstring {

    public boolean isSubstring(String s1, String s2) {

        if ((s1 == null) || (s2 == null) || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        return s1.contains(s2);
    }

    public static class LongestSubstr {

        public static int longestSubstr(String s) {
            HashSet<Character> mySet = new HashSet<>();
            int left = 0, maxLength = 0;

            for (int right = 0; right < s.length(); right++) {
                // Move the left pointer to avoid duplicates
                while (mySet.contains(s.charAt(right))) {
                    mySet.remove(s.charAt(left));
                    left++;
                }

                // Add current character to the set
                mySet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);

            }
            return maxLength;
        }

        public static void main(String[] args) {
            System.out.println("max substr: " + longestSubstr("abcabcbb"));
            System.out.println("max substr: " + longestSubstr("abccabbabcdee"));
        }

    }
}
