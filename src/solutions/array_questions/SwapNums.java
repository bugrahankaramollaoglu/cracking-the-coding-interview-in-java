package solutions.array_questions;

/* javada meşhur swapNumbers() kullanmak kolay değil, çünkü java
 * referans olarak değil value olarak tutuyor. o yüzden tmp kullanarak
 * bir fonksiyonda swap etmek işe yaramıyor. javada iki sayıyı gerçekten
 * swap etmenin iki yolu var
 * 1) wrapper class kullanmak
 * 2) swapped değerleri bir fonksiyonla return etmek */

public class SwapNums {

//    ÇALIŞMIYOR ÇÜNKÜ PASS BY VALUE
//    public static void swapNums(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }

    // birinci yol
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void swapNums(Pair pair) {
        int tmp = pair.first;
        pair.first = pair.second;
        pair.second = tmp;
    }


    // ikinci yol
    public static int[] swapNums2(int a, int b) {


        int[] result = new int[2];
        result[0] = b;
        result[a] = a;
        return result;

    }


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // birinci yol kullanımı
        Pair pair = new Pair(10, 20);
        swapNums(pair);

        // ikinci yol kullanımı
        int[] swappedNums = swapNums2(a, b);

        System.out.println("a: " + swappedNums[0]);
        System.out.println("b: " + swappedNums[1]);
    }

}
