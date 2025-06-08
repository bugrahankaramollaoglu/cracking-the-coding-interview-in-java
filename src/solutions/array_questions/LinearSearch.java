package solutions.array_questions;

/*  Given an array and an element, determine if the element exists in the array.  */

public class LinearSearch {

    public static boolean linearSearch(int[] arr, int key) {
        for (int nb : arr) {
            if (nb == key) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(linearSearch(arr, 30));
        System.out.println(linearSearch(arr, 80));
    }

}
