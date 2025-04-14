package dsa.data_structures.tree;

class BinarySearchTree {
    Node root;

    // Insert a new node
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Search a node
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    public static void main(String[] args) {

    }
}
