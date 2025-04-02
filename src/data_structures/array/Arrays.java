package data_structures.array;

/*
*   int[] numbers;   // Preferred
    int numbers2[];   // Also valid, but less common

    // memory allocated array
    int[] numbers3 = new int[5];

    // Initialization (At Declaration)
    int[] numbers4 = {10, 20, 30, 40, 50};

    System.out.println(numbers4[2]); // 30
    System.out.println(numbers4.length); // 5

    for (int i = 0; i < numbers4.length; i++) {
        System.out.print(numbers4[i] + " ");
    }

    for (int num : numbers4) {
        System.out.print(num + " ");
    }

    // multi dimensional array
    int[][] matrix = new int[3][3];

    // library methods for arrays
    Arrays.sort(numbers4);

    int index = Arrays.binarySearch(numbers4, 50);

    Arrays.fill(numbers4, 100); // 100, 100, 100, 100

    int[] numbers4_copy = numbers4.clone();

    // Since Java arrays have fixed sizes, we use ArrayList for dynamic resizing.
    ArrayList<Character> list = new ArrayList<>();
    list.add('a');
    list.add('c');
    list.add('b');
*
* */

public class Arrays {

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

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        reverseArray(arr);

        System.out.println(java.util.Arrays.toString(arr));

    }
}
