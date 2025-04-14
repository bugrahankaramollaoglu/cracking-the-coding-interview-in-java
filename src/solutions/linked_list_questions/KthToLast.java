package solutions.linked_list_questions;

/* Implement an algorithm to find the kth to last element of a singly linked list. */

/* önce listenin eleman sayısını hesaplayip n-k'den bulabiliriz, but thats too easy.
 *
 *  if (ll == null || k <= 0 || k > ll.size()) return -1;
 *  int indeks = ll.size() - k;
 *  return ll.get(indeks);
 *
 *  */

/* recursive cözelim: sondan basa dogru k kadar traverse edelim. */

import java.util.LinkedList;

public class KthToLast {

    static class ListNode {
        int data;
        ListNode next;

        // Constructor to create a new node
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode findKthElem(ListNode head, int k, int[] count) {
        if (head == null) return null;

        ListNode node = findKthElem(head.next, k, count);

        count[0]++;

        if (count[0] == k) return head;

        return node;
    }


    public int kthToLast(ListNode head, int k) {
        if (head == null || k <= 0) {
            return -1;  // Return -1 if the list is empty or k is invalid
        }

        int[] count = {0};  // Array to store the count of nodes visited during recursion
        ListNode result = findKthElem(head, k, count);

        if (result != null) {
            return result.data;
        }
        return -1;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        KthToLast list = new KthToLast();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        System.out.print("Original List: ");
        list.printList(head);

        // Find the 2nd to last element
        int k = 2;
        int result = list.kthToLast(head, k);
        System.out.println("The " + k + "th to last element is: " + result);
    }
}
