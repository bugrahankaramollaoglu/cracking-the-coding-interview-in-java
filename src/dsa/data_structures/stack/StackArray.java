package dsa.data_structures.stack;

public class StackArray {

    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        }

        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size(){
        return top + 1;
    }

    public static void main(String[] args) {
        StackArray myStackArr = new StackArray(4);

        myStackArr.push(10);
        myStackArr.push(20);
        myStackArr.push(30);
        myStackArr.push(40);

        System.out.println("top element: " + myStackArr.peek());
        System.out.println("popped element: " + myStackArr.pop());
        System.out.println("new stack size: " + myStackArr.size());
        System.out.println("top element: " + myStackArr.peek());
        System.out.println("top element: " + myStackArr.toString());

    }

}
