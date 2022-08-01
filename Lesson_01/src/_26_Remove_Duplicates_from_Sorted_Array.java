public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int n = 1;
        for (int i=0; i < nums.length-1;i++){
            if (nums[i] != nums[i+1]){
                nums[n] = nums[i+1];
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int x = removeDuplicates(nums);
        System.out.println(x);
    }
}
