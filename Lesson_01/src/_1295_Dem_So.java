public class _1295_Dem_So {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
    public static int countDigit(int number){
        int count = 0;
        while (number != 0){
            number = number/10;
            // System.out.println(number);
            count++;
        }
        return count;
//        String s = String.valueOf(number);
//        return s.length();
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(countDigit(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
