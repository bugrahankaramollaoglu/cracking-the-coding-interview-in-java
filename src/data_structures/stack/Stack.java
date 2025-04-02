package data_structures.stack;

public class Stack {


    public static void main(String[] args) {

        /* javanin stack kütüphanesi vardir */

        /* Stackler LIFO mantıgı calısır (bulasık) */

        java.util.Stack<Integer> myStack = new java.util.Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack);

        myStack.peek(); // en son itemi verir
        myStack.pop(); // en son itemi siler
        myStack.size();
        myStack.isEmpty();

        /* ama eğer kendin implement etmek istersen ya) array ya) ll ile edebilirsin */

    }


}
