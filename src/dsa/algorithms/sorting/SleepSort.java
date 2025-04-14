package dsa.algorithms.sorting;

public class SleepSort {

    public static void sleepSort(int[] nums) {
        for (int num : nums) {
            new Thread(() -> {
                try {
                    Thread.sleep(num * 10L);
                    System.out.print(num + " ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 12, 16, 5, 2};

        sleepSort(arr);

    }

}
