package dsa.concepts.recursion;

public class Fibonacci {

    /* hem iteratif, hem recursive solution */

    // O(n)
    public static int fiboIteratif(int n) {

        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }

        return b;

    }

    // O(2^n)
    public static int fiboRecursive(int n) {
        if (n <= 1) return n;

        return fiboRecursive(n - 1) + fiboRecursive(n - 2);
    }


}
