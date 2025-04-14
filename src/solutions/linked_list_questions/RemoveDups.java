package solutions.linked_list_questions;

/*  Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed? */


import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDups {

    // önce sembolik bir node yaratalim
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /* duplicateleri track etmek icin hashtable kullanacagiz. */

    public void removeDups(Node head) {

        if (head == null) return;

        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDups llist = new RemoveDups();

        // kreate a list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);

        // Print original list
        System.out.print("Original List: ");
        llist.printList(head);

        // Remove duplicates
        llist.removeDups(head);

        // Print modified list
        System.out.print("List after removing duplicates: ");
        llist.printList(head);
    }

}
