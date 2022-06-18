package day18;

public class Task3 {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.setRoot(tree1.new Node(20));
        tree1.insertNode(18);
        tree1.insertNode(24);
        tree1.insertNode(14);
        tree1.insertNode(8);
        tree1.insertNode(5);
        tree1.insertNode(11);
        tree1.insertNode(15);
        tree1.insertNode(27);
        tree1.insertNode(22);
        tree1.insertNode(24);
        tree1.insertNode(16);
        tree1.insertNode(23);
        tree1.insertNode(29);
        tree1.insertNode(28);

        tree1.dfs(tree1.getRoot());
    }
}