package solutions.string_questions;

public class StrLen {

    public static int strLen(String s) {
        if (s != null && !s.isBlank()) {
            return s.length();
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("length: " + strLen(""));
    }
}
