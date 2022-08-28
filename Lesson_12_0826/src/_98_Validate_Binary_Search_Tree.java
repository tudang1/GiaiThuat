public class _98_Validate_Binary_Search_Tree {
    public boolean isValidBST(Node root) {
        return check(root,null,null);
    }
    public boolean check(Node root,Integer min,Integer max){
        if (root == null){
            return true;
        }
        if ((min != null && root.value <= min)|| (max != null &&root.value >= max)){
            return false;
        }
        return check(root.left,min,root.value) &&check(root.right,root.value,max);
    }
}
