package solutions.string_questions;

import java.util.ArrayList;

public class CommonElementsNumber {

    /* Given two sorted arrays, find the number of elements in common.
    The arrays are the same length and each has all distinct elements. */

    public static int commonElementsNumber(int[] arr1, int[] arr2) {

        ArrayList<Integer> commons = new ArrayList<>();
        int commonNum = 0;
        int i = 0, j = 0; // i will traverse arr1, j traverses arr2

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                commonNum++;
                i++;
                j++; // moves both pointers
            } else if (arr1[i] < arr2[j]) { // ? bc sorted
                i++; // Move i to catch up with arr2[j]
            } else {
                j++; // Move j to catch up with arr1[i]
            }
        }
        return commonNum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {3, 4, 5, 8, 9};


        int commons = commonElementsNumber(arr1, arr2);
        System.out.println(commons);


    }

}
