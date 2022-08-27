public class _104_Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(Node root) {
        if (root == null){
            return 0;
        }
        int chieucaobentrai = maxDepth(root.left);
        System.out.println("chieucaobentrai " + chieucaobentrai);
        int chieucaobenphai = maxDepth(root.right);
        System.out.println("chieucaobenphai " + chieucaobenphai);
        int result = Math.max(chieucaobenphai,chieucaobentrai)+ 1;
        System.out.println("result " + result);
        return result;
    }
}
