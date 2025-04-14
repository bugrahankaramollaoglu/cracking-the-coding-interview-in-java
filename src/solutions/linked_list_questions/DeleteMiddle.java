package solutions.linked_list_questions;

/*  Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node */

import java.util.LinkedList;

public class DeleteMiddle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void deleteMiddle(Node node) {
        if (node == null || node.next == null) return;

        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

        // Example list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        Node toDelete = head.next; // Let's delete 20
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
    }


}
