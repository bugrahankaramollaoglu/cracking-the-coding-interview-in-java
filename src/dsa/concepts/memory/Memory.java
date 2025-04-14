package dsa.concepts.memory;

public class Memory {


    /* iki tür memory var
    * stack memory:
        * method çağrıları ve yerel değişkenleri tutar (int, boolean vs)
        * hızlıdır
        * kapasitesi azdır (thread başına ~1mb)
        * metot bitince otomatik temizlenir
        *
        * void calculate() {
            int x = 5;  // Stored in stack
            String s = "hello";  // Reference in stack, object in heap
        }
        *
        *
    * heap memory
        * diğer her şeyi tutar
        * stackin aksine threadler arası info paylaşılır
        * GC tarafından yönetilir (garbage collector)
        * larget but slower
        * int[] numbers = new int[1000];  // Array stored in heap
        * arrayler heapte tutulur (sıralı memory blocks)
    * */

    /* memory tips
    * prefer primitive types for less storage (int instaed of Integer)
    * stack overflow'a dikkat et
        void infiniteRecursion() {
            infiniteRecursion();
        }
    * heap overflow'a dikkat et
    List<BigObject> list = new ArrayList<>();
    while(true) {
        list.add(new BigObject());  // Eventually OOM
    }
    * memory leaklere dikkat et

    public class SimpleLeak {
        static List<String> bucket = new ArrayList<>(); // The leaky bucket

        public static void main(String[] args) {
            while (true) {
                bucket.add("This string will leak!"); // Keeps filling the bucket
            }
        }
    }

    *
    *
    *
    *
    *
    *  */



}
