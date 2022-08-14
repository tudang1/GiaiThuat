import java.util.ArrayList;
import java.util.Arrays;

public class _704_Binary_Search {
    public static int search(int[] nums, int target) {
//        for (int i = 0; i<nums.length;i++){
//            if (nums[i] == target ){
//                return i;
//            }
//        }
//        return -1;
        int n = nums.length;
        int ileft = 0;
        int iright = n-1;
        while (ileft <= iright){
            int imid = (ileft + iright) / 2;
            if (target == nums[imid]){
                return imid;
            } else if (target < nums[imid]) {
                iright = imid - 1;
            }else {
                ileft = imid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr,7));
    }
}
