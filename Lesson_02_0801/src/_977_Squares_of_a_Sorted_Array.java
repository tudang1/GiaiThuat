import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
            for (int i =0; i < nums.length;i++){
                nums[i] = nums[i] * nums[i];
            }
            Arrays.sort(nums);
        return nums;
    }
}
