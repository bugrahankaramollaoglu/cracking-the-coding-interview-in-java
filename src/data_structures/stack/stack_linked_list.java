package data_structures.stack;

public class stack_linked_list {

    /* stackleri linked list olarak implement etme */

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class StackLL {
        private Node top;

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int popped = top.data;
            top = top.next;
            return popped;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public class Main {
        public void main(String[] args) {
            StackLL stack = new StackLL();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element: " + stack.peek()); // 30
            System.out.println("Popped: " + stack.pop()); // 30
            System.out.println("Stack empty? " + stack.isEmpty()); // false
        }
    }

}
