package dsa.data_structures.linked_lists;

/* kendi sll'ni yaratmak yerine varolan java kütüphanesinden de
* kullanaiblirsin

LinkedList<Integer> hazirSLL = new LinkedList<>();
hazirSLL.add(), hazirSLL.delete() [...]

* */

class NodeSLL {
    int data;
    NodeSLL next;

    public NodeSLL(int data) {
        this.data = data;
        this.next = null; // initially null
    }
}

public class SLL {

    NodeSLL headNode;

    public void addBack(int data) {
        NodeSLL newNode = new NodeSLL(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        NodeSLL current = headNode;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public void addFront(int data) {
        NodeSLL newNode = new NodeSLL(data);

        newNode.next = headNode;
        headNode = newNode;
    }

    public void delete(int data) {
        if (headNode == null) return;

        if (headNode.data == data) {
            headNode = headNode.next;
            return;
        }

        NodeSLL currentNode = headNode;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void printList() {
        NodeSLL currentNode = headNode;
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

    public void addAfter(int dataAfter, int newData) {

        NodeSLL newNode = new NodeSLL(newData);

        // for traversing the list
        NodeSLL currentNode = headNode;

        if (headNode == null) {
            System.out.println("list is empty, cannot add after.");
            return;
        }

        while (currentNode.next != null) {
            if (currentNode.data == dataAfter) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

        System.out.println("data: " + dataAfter + " not found in the list.");

    }

    public void deleteAll() {
        headNode = null;
    }

    public boolean search(int data) {
        NodeSLL currentNode = headNode;

        while (currentNode.next != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        int _size = 0;

        NodeSLL currentNode = headNode;
        while (currentNode != null) {
            currentNode = currentNode.next;
            _size++;
        }
        return _size;
    }

    public void reverse() {
        NodeSLL prevNode = null;
        NodeSLL nextNode = null;
        NodeSLL currentNode = headNode;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        headNode = prevNode;
    }

    public static void main(String[] args) {
        SLL myList = new SLL();

        myList.printList();

        myList.addFront(30);
        myList.addFront(20);
        myList.addFront(10);

        myList.printList();

        myList.addBack(50);
        myList.addBack(60);

        myList.printList();

        myList.delete(40);
        myList.printList();

        myList.addAfter(50, 99);
        myList.printList();

        System.out.println(myList.search(99));

        myList.deleteAll();
        myList.printList();

        myList.addFront(10);
        myList.addFront(20);
        myList.addFront(30);

        System.out.println(myList.size());

        myList.printList();
        myList.reverse();
        myList.printList();

    }

}

