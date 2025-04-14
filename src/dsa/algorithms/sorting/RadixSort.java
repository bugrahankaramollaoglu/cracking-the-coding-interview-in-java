package dsa.algorithms.sorting;

import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[]arr){
        int max = getMax(arr);
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    



    public static void main(String[] args) {
        int[] arr = {10, 4, 32, 35, 25, 42, 2, 600, 3};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
