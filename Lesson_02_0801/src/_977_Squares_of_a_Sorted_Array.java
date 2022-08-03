import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
            for (int i =0; i < nums.length;i++){
                nums[i] = nums[i] * nums[i];
            }
            Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] arr ={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
