public class _724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i< nums.length;i++){
            sum += nums[i];
        }
        int leftSum = 0 ;

        for (int i = 0; i < nums.length;i++){
            sum -= nums[i];
            if (sum == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
