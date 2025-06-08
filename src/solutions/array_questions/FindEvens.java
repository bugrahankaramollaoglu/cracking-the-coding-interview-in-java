package solutions.array_questions;

/* find even numbers in a given list */

import java.util.ArrayList;
import java.util.List;

public class FindEvens {

    public static List<Integer> findEvens(int[] arr) {
        List<Integer> evens = new ArrayList<>();

        for (int nb : arr) {
            if (nb % 2 == 0) evens.add(nb);
        }

        return evens;

    }

    public static void main(String[] args) {
        System.out.println(findEvens(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    }

}
