import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int low = i+1, high = nums.length-1;
                while (low < high) {
                    int  sum = nums[i] + nums[low] + nums[high];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low+1]) low++;
                        while (low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;

                    } else if(sum < 0) low++;
                    else high--;

                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = {1,-1,-1,0};
        threeSum(nums);
        System.out.println(threeSum(nums));
        List<List<Integer>> res = new LinkedList<>();


    }
}
