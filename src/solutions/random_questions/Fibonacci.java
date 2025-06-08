package solutions.random_questions;

/* print the first n numbers in the fibonacci
 * fibonacci yapmak için 2 temel yol vardır
 * recursive
 * iteratif
 * */

public class Fibonacci {


    public static void fibonacciRecursive(int n, int a, int b) {
        if (n == 0) return;


        System.out.print(a + " ");
        fibonacciRecursive(n - 1, b, a + b);

    }

    public static void fibonacciIteratif(int n) {

        if (n <= 0) return;

        int a = 0, b = 1;

        System.out.print(a + " ");

        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        fibonacciIteratif(10);
        fibonacciRecursive(10, 0, 1);
    }

}
