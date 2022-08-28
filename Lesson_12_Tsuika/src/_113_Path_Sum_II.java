import java.util.ArrayList;
import java.util.List;

public class _113_Path_Sum_II {
    public static  List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        timNhanh(root,0,targetSum,arr,list);
        return list;

    }
    public static void timNhanh(TreeNode root,int currSum,int targetSum,List<Integer> arr,List<List<Integer>> list){
        if (root == null){
            return;
        }
        currSum += root.val;
        System.out.println("currSum " + currSum);
        arr.add(root.val);
        System.out.println("arr: ");
        arr.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        if(root.left == null && root.right ==null){
            // khi đến node lá thì trả về lun kết quả là (so sánh với tagetsum)
            if (currSum == targetSum){
                list.add(new ArrayList<>(arr));
                System.out.println("done");
            }
        }else {
            timNhanh(root.left, currSum, targetSum, arr, list);
            timNhanh(root.right, currSum, targetSum, arr, list);
        }
        System.out.println("arr.size " + arr.size());
        arr.remove(arr.size() - 1);

        System.out.println("arr.remove ");
        arr.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        list.forEach(i-> System.out.print(i + "\t"));
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(11);
        TreeNode n5 = new TreeNode(13);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(5);
        TreeNode n10 = new TreeNode(1);

        n1.right = n3; n1.left = n2;
        n2.left = n4; n2.right =null;
        n4.left = n7;n4.right = n8;
        n3.left =n5;n3.right = n6;
        n6.left = n9; n6.right =n10;


        pathSum(n1,22);



    }

}
