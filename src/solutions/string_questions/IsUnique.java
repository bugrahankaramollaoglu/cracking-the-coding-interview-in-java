package solutions.string_questions;

public class IsUnique {

    /* Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? */

    /* ilk olarak
     * ascii mi unicode mu karakter setinden oldugu bilinmeli
     * ascii 128, unicode 1,114,000 farklı karakter barındırır.
     *
     * */


    /* O(n) time, O(1) space complexity.
     * O(n) bc worst str uzunlugu kadar calısır
     * O(1) bc extra ds kullanılmıyor
     * */

    public static boolean isUnique(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }

        return true;
    }

    public static boolean isUnique2(String str) {

        if (str.length() > 128)
            return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isUnique2("bugra"));
        System.out.println(isUnique2("bugrahan"));
        System.out.println(isUnique2("bb"));
    }


}
