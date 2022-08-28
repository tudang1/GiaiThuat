import java.util.ArrayList;
import java.util.List;

public class _144_Binary_Tree_Preorder_Traversal {
    public static  List<Integer> preorderTraversal(Node root) {
        List<Integer> list =  new ArrayList();
        preorderTraverHelper(root, list);
        return list;
    }

    public static void preorderTraverHelper (Node node, List<Integer> arr){
        if(node!=null){
            //gốc
            arr.add(node.value);
            //debug
            for (int i:arr){
                System.out.print(i + "\t");
            }
            System.out.println();
            // trái
            preorderTraverHelper (node.left, arr);
            //phải
            preorderTraverHelper (node.right, arr);

        }
    }
}
