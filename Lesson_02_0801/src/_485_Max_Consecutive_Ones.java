public class _485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;

        for(int i : nums){
            if(i == 1) {
                sum++;
                max = Math.max(sum, max);
            }else { // i == 0
                sum = 0;
            }
        }
        return max;
    }
}