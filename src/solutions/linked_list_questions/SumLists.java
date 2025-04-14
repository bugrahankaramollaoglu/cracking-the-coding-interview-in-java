package solutions.linked_list_questions;

/* You have two numbers represented by a linked list,where each node contains a single
digit. The digits are stored in reverse order,such that the 1's digit is at the head of the list.
Write a function that adds the two numbers and returns the sum as a linked list.
EXAMPLE
Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is,912. */

import java.util.LinkedList;


public class SumLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static public Node sumLists(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node l1 = new Node(7);
        l1.next = new Node(1);
        l1.next.next = new Node(6); // 617

        Node l2 = new Node(5);
        l2.next = new Node(9);
        l2.next.next = new Node(2); // 295

        Node result = sumLists(l1, l2);
        printList(result); // Expected output: 2 -> 1 -> 9 -> null (which is 912)
    }
}