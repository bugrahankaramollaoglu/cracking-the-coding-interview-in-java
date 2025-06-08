package solutions.stack_questions;

/* Describe how you could use a single array to implement three stacks */



class ThreeInOne {

    /* bunu yapmanın ilk akla gelen yolu bir n-sized arrayi üce bölüp stacklere
     * kendi sınırlarını vermek. bu yöntemle çok sofistike stackler elde edemiyoruz
     * yalnızca allocate space etmiş oluyoruz. */
    
    int n = 9;

    int[] arr = new int[n];
    int stackSize = n / 3;
    int[] tops = {-1, stackSize - 1, 2 * stackSize - 1};  // top pointers

    void push(int stackNum, int value) {
        int base = stackNum * stackSize;
        int top = tops[stackNum];

        if (top < base + stackSize - 1) {
            tops[stackNum]++;
            arr[tops[stackNum]] = value;
        } else {
            // throw err
        }
    }

}