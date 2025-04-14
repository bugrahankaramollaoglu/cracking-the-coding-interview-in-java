package dsa.concepts.recursion;

public class Factorial {

    /* recursion is widely used in divide-and-conquer dsa.algorithms,
    backtracking, tree/graph traversal, and dynamic programming.*/

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    /* peki, recursion NASIL çalışır?
    * her fonksiyon çağrısı stackte biriktirilir
    * rekürsif fonksiyondan çıkış koşulu sağlandığında,
    * bu biriktirilen çağrılar teker teker, LIFO olarak execute edilir.
    * mesela factorial(4) fonksiyonu şöyle çalışır:
    * factorial(4) → factorial(3) → factorial(2) → factorial(1) → Return
    * factorial 1 1 döndürür, o 2 döndürür, 3 6 döndürür vs...
    * */

    /* 2 çeşit recursion fonksiyon vardır
    * tail recursion: The recursive call is the last operation before returning.
    * non-tail recursion: More computation is needed after the recursive call. */


}
