package solutions.random_questions;

/* find the second largest number in an array */

public class SecondLargest {

    public static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return (secondLargest != Integer.MIN_VALUE) ? secondLargest : null;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{5, 1, 8, 7, 8}));
    }

}
