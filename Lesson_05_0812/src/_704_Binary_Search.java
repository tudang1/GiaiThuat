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
    // binarySearch using Đệ Quy
    public static int search2(int[] nums,int target){
        return search2(nums,target,0,nums.length-1);
    }
    public static int search2(int[] nums,int target,int iLeft,int iRight){
        // điều kiện dừng
        if (iLeft > iRight){
            return -1;
        }
        int iMid = (iLeft + iRight)/2;
        if (nums[iMid] == target){
            return iMid;
        } else if (nums[iMid] < target) {
            return search2(nums,target,iMid +1,iRight);
        }else{
            return search2(nums,target,iLeft,iMid -1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr,7));
        System.out.println(search2(arr,7));
    }
}
