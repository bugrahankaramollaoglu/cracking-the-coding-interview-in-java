package solutions.array_questions;

/* reverse an array, that's it */


import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }


}
