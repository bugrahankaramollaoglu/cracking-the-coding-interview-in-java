package solutions.array_questions;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public static List<Integer> minMax(int[] arr) {
        List<Integer> result = new ArrayList<>();

        int min = arr[0], max = arr[0];

        for (int nb : arr) {
            if (nb < min) {
                min = nb;
            }
            if (nb > max) {
                max = nb;
            }
        }

        result.add(min);
        result.add(max);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 36, 42, -99, 0, 25, -55, 42, 20};
        System.out.println(minMax(arr));
    }
}
