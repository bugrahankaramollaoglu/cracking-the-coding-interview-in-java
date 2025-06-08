package solutions.array_questions;

/*  Calculate the sum of all elements in an array. */

public class SumOfElements {

    public static int sumOfElements(int[] arr) {
        int total = 0;
        if (arr.length == 0) return -1;
        for (int nb : arr) {
            total += nb;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] ar = {10, 30, 2, -2};
        System.out.println(sumOfElements(ar));
    }

}
