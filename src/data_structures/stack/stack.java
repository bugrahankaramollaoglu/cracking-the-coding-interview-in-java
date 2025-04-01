package data_structures.stack;

import java.util.Stack;

public class stack {


    public static void main(String[] args) {

        /* javanin stack kütüphanesi vardir */

        /* Stackler LIFO mantıgı calısır (bulasık) */

        Stack<Integer> myStack = new Stack<>();

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
