package dsa.algorithms.searching;

public class BinarySearch {

    /* O(logN) time complexity */

    /* divide & conquer mantıgıyla calısır */

    /* sıralı dizilerde calısır */

    /* ortadaki elemanı alır, aradığı sayıdan küçükse sağ yarıma,
     * büyükse sol yarıma gider. aynı şeyi (ortadakini alma) tekrar eder.
     * bulana kadar böyle devam eder */

    /* iki şekilde de yapılabilir
     * iteratif (fazla stacki yormaz, hızlı çalışır)
     * recursif (stacki yorar, less performative ama daha yavaş) */

    public static int binarySearchIterative(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1; // ilk ve son indisleri belirledik

        while (left <= right) {
            int mid = left + (right - left) / 2; // ortadaki indis

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1; // sağ tarafa bakmak için öteledik
            else
                right = mid - 1; // sol tarafa bakmak için gerilettik

        }

        return -1; // eleman bulunamadı
    }

    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return binarySearchRecursive(arr, mid + 1, right, target);
        else
            return binarySearchRecursive(arr, left, mid - 1, target);
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};
        int targetIndice = binarySearchIterative(nums, 30);
        int targetIndice2 = binarySearchRecursive(nums, 0, nums.length - 1, 30);
        System.out.println(targetIndice);
        System.out.println(targetIndice2);

    }
}
