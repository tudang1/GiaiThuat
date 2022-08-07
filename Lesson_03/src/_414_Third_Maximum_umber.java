import java.util.Arrays;

public class _414_Third_Maximum_umber {
    public static int thirdMax(int[] nums) {
        int count = 0;
        int n = nums.length;
        int thirdMax;
        if (n==1){
            return nums[0];
        } else if (n==2) {
            return Math.max(nums[0],nums[1]);
        }else{
            Arrays.sort(nums);

        }
        return 0;
    }
}
