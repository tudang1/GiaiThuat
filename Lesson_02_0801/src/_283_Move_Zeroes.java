import java.util.Arrays;

public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int m = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[m] = nums[i];
                m++;
            }
        }
        while(m < nums.length){
            nums[m] = 0;
            m++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i: nums){
            System.out.println(i);
        }
    }
}
