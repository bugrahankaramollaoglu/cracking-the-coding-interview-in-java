package data_structures.tree;

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree(int value) {
        root = new Node(value);
    }

    public static void main(String[] args) {
        System.out.println("aa");
    }
}



