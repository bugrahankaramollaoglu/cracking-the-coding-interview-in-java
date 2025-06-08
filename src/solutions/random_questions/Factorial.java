package solutions.random_questions;

/* find factorial of a number */

public class Factorial {

    public static int factorialIteratif(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialIteratif(5));
        System.out.println(factorialRecursive(5));
    }

}
