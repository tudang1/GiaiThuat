public class _1_Two_Sun {
    public static void main(String[] args) {
        int[] num = {1,5,3,6,7};
        int[] result = twoSum(num,12);
        for (int i:result){
            System.out.print(i + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length;i++){
            for (int j = i+1; j< nums.length;j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
