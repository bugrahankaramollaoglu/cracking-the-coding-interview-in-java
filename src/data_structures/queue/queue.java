package data_structures.queue;

public class queue {  // Renamed to "Queue" (Java convention: class names start with uppercase)

    /* Queue follows FIFO principle */

    static class Node {  // Make Node static so it can be used in static QueueLL
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class QueueLL {  // Make QueueLL static
        private Node front, rear;

        public QueueLL() {
            this.front = null;
            this.rear = null;
        }

        // enqueue() (add back)
        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // dequeue() (remove from front)
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            int removedData = front.data;
            front = front.next;

            if (front == null) rear = null; // if queue becomes empty

            return removedData;
        }

        // peek() (return front element)
        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return front == null;
        }

        // Print the queue elements
        public void printQueue() {
            if (front == null) {
                System.out.println("queue is empty euehue");
                return;
            }

            Node current = front;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        QueueLL myQueue = new QueueLL();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        myQueue.printQueue();
    }

}
