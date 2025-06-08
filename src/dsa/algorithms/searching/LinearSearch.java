package dsa.algorithms.searching;

public class LinearSearch {

    public static boolean linearSearch(int[] arr, int target) {
        for (int nb : arr) {
            if (nb == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 2, 3, 4, 5, 6, 7}, 0));
        System.out.println(linearSearch(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
    }

}
