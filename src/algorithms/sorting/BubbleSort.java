package algorithms.sorting;

public class BubbleSort {

    /* O(nsquare) */

    /* sol baştan ikili ikili kontrol eder, swap eder */

    public static void bubbleSort(int[] nums) {
        boolean swapped;

        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // if no swap in the first run, arr is already sorted
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 3, 15, 21, 20};
        bubbleSort(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

}
