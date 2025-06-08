package solutions.string_questions;

/* Implement a function to check if a linked list is a palindrome.
 *
 * bunu yapmanın 2 temel yolu var
 * birincisi listi ters çevirip compare'lemek (first half enough)
 * ikincisi two pointer çözüm
 * */

import java.util.Collections;
import java.util.LinkedList;

public class IsPalindrome {


    public static boolean isPalindrome(LinkedList<Integer> list) {

        if (list == null || list.isEmpty()) return true;

//        LinkedList<Integer> tmp = list.reversed(); // javada listeler böyle çevrilmez

        LinkedList<Integer> tmp = list;
        Collections.reverse(tmp);
        for (int i = 0; i < list.size(); i++) {

            /* javada != operatörü referansları ya da primitif tipleri
            karşılaştırırken kullanılır (int, char gibi). Objectleri
            karşılaştırmak için != kullanamazsın. çünkü != referans
            kontrolü yapar (aynı adrese mi işaret ediyor diye, actual
            valuesları kıyaslamaz). bunun için equals kullanmalısın  */

            if (!list.get(i).equals(tmp.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(LinkedList<Integer> list) {

        if (list == null || list.isEmpty()) return true;

        int left = 0, right = list.size() - 1;

        while (left++ < right--) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println(isPalindrome(list));
        System.out.println(isPalindrome2(list));
    }


}
