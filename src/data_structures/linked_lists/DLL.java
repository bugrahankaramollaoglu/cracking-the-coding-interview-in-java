package data_structures.linked_lists;

class NodeDLL {

    int data;
    NodeDLL prev;
    NodeDLL next;

    public NodeDLL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {

    NodeDLL headNode;

    public void addFront(int data) {
        NodeDLL newNode = new NodeDLL(data);

        if (headNode != null) {
            newNode.next = headNode;
            headNode.prev = newNode;
        }
        headNode = newNode;
    }

    public void addBack(int data) {

        NodeDLL newNode = new NodeDLL(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }

        NodeDLL currentNode = headNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        newNode.prev = currentNode;

    }

    public void printList() {
        NodeDLL currentNode = headNode;
        if (currentNode == null) {
            System.out.println("[]");
            return;
        }
        while (currentNode != null) {
            System.out.print("[" + currentNode.data + "] ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void delete(int data) {
        if (headNode == null) return ;

        if (headNode.data == data) {
            headNode = headNode.next;
            if (headNode != null) headNode.prev = null;
            return;
        }

        NodeDLL current = headNode;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) return;

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        NodeDLL currentNode = headNode;
    }

    public static void main(String[] args) {

        DLL myList = new DLL();

        myList.printList();

        myList.addBack(10);
        myList.addBack(20);
        myList.addFront(30);

        myList.printList();

        myList.delete(20);
        myList.printList();

    }
}
