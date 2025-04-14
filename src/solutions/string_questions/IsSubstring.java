package solutions.string_questions;

public class IsSubstring {

    public boolean isSubstring(String s1, String s2) {

        if ((s1 == null) || (s2 == null) || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        return s1.contains(s2);
    }
}
