public class _112_Path_Sum {
    public boolean hasPathSum(Node root, int targetSum) {
        return check(root,0,targetSum);
    }
    public boolean check(Node root, int currSum,int targetSum){
        if (root == null){
            return false;
        }
        currSum += root.value;
        if(root.left == null && root.right ==null){
            // khi đến node lá thì trả về lun kết quả là (so sánh với tagetsum)
            return currSum == targetSum;
        }
        return check(root.right,currSum,targetSum) || check(root.left,currSum,targetSum);
    }
}
