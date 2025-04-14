package dsa.concepts.functional_programming;

import java.util.function.Function;

public class FunctionalProgramming {

    /* there are 2 main programming paradigms
     * OOP
     * Functional programming
     *
     * */

    /* in functional programming
     * the data is immutable (created only once unlike OOP)
     * first-class functions (fonksiyonlar degiskenlere atanabiliyosa)
     * pure functions (always returns the same output for the same input.)
     * higher-order function (bir başka fonksiyonu arguman olarak alan/donduren fonksiyon)
     * */

    /* first class function example */
    public class FirstClassFunctionExample {
        public static void main(String[] args) {
            Function<Integer, Integer> square = x -> x * x;
            System.out.println(square.apply(5)); // Output: 25
        }
    }

    // pure function example (same causes produces same outcomes)
    public class PureFunctionExample {
        static int add(int a, int b) {
            return a + b; // No side effects, only depends on inputs
        }

        public static void main(String[] args) {
            System.out.println(add(3, 5)); // Output: 8
        }
    }

    // impure function example (same causes produces different outcomes)
    public class ImpureFunctionExample {
        static int count = 0;

        static int increment(int x) {
            count++; // bu sonucun aynı olmasını engelliyor
            return x + count;
        }

        public static void main(String[] args) {
            System.out.println(increment(2));
        }
    }


    // higher order function example that takes a function as parameter
    public class HigherOrderFunctionExample {
        static int applyFunction(int x, Function<Integer, Integer> func) {
            return func.apply(x);
        }

        public static void main(String[] args) {
            Function<Integer, Integer> doubleIt = n -> n * 2;
            System.out.println(applyFunction(10, doubleIt)); // Output: 20
        }
    }

    // higher order function example that returns a function
    class HigherOrderFunc2 {
        static Function<Integer, Integer> multiplier(int factor) {
            return n -> n * factor;
        }

        public static void main(String[] args) {
            Function<Integer, Integer> triple = multiplier(3);
            System.out.println(triple.apply(5)); // Output: 15
        }
    }


    public static void main(String[] args) {


    }


}
