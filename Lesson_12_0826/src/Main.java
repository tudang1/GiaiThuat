import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);

        n6.left =n2;    n6.right=n9;
        n2.left =n1;    n2.right=n4;
        n4.left =n3;    n4.right=n5;
        n9.left =n7;    n9.right=n10;
        System.out.println();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.preOrder(n6);
        System.out.println();

        binarySearchTree.inOrder(n6);
        System.out.println();

        binarySearchTree.postOder(n6);
        System.out.println();

        _144_Binary_Tree_Preorder_Traversal.preorderTraversal(n2);
        System.out.println();
        _145_Binary_Tree_Postorder_Traversal.postorderTraversal(n2);
        System.out.println();

        binarySearchTree.insert(n6,8);
        binarySearchTree.inOrder(n6);
        System.out.println();

        binarySearchTree.insertbydeQue(n6,0);
        binarySearchTree.inOrder(n6);
        System.out.println();

        _104_Maximum_Depth_of_Binary_Tree.maxDepth(n6);
    }
}
