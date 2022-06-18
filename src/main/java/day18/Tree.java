package day18;

public class Tree {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    class Node {
        private int value;
        Node leftRoot;
        Node rightRoot;

        Node (int value) {
            this.value = value;
            this.leftRoot = null;
            this.rightRoot = null;
        }
    }

    public void insertNode (int value) {
        root = insert (root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node (value);
        }
        if (value < node.value) {
            node.leftRoot =  insert(node.leftRoot, value);
        } else if (value > node.value) {
            node.rightRoot = insert(node.rightRoot, value);
        }
        return node;
    }

    public void dfs(Node node) {
        if (node != null) {
            dfs(node.leftRoot);
            System.out.print(" " + node.value);
            dfs(node.rightRoot);
        }
    }
}
