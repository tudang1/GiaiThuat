import java.util.ArrayList;
import java.util.List;

public class _145_Binary_Tree_Postorder_Traversal {
    public static List<Integer> postorderTraversal(Node root) {
        List<Integer> listArray = new ArrayList<>();
        postorder(root, listArray);
        return listArray;
    }

    private static void postorder(Node root, List<Integer> listArray) {
        if (root == null)
            return;

        //trái
        postorder(root.left, listArray);
        //phải
        postorder(root.right, listArray);
        //gốc root
        listArray.add(root.value);
        //debug
        for (int i:listArray){
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
