package tree;
//
//public class tree1 {
//}


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class tree1 {
    Node root;

    public static void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(" " + node.key);
            traverseTree(node.right);
        }
    }

    public static void main(String[] args) {

        Node tree = new Node(1);

        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);

        System.out.print("\nBinary Tree: ");
        traverseTree(tree);
    }
}
