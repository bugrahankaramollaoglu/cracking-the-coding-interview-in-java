package solutions.array_questions;

/* remove duplicate elements from a list */

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> unique = new ArrayList<>();

        for (int num : arr) {
            if (!unique.contains(num)) unique.add(num);
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 30, 30, 50, 60, 70, 10, 60, 80};
        System.out.println(removeDuplicates(arr));
    }

}
