import java.util.Arrays;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        return sort(nums,0,nums.length-1);
    }
    public static int[] merge(int[] nums1,int[] nums2){
        // gộp mảng
        int n = nums1.length + nums2.length;
        int[] result = new int[n];

        int i =0;//chạy mảng result
        int i1 =0;//chạy mảng nums1
        int i2 =0;// chạy mảng nums2
        while (i<n){
            if (i1<nums1.length && i2<nums2.length){// 2 mảng != rỗng
                if(nums1[i1] <= nums2[i2]){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else{
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }else{// 1 trong 2 mảng rỗng
                if(i1 < nums1.length){//nums2 rỗng
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else {
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }
        }
//        System.out.println("kết quả Result" +Arrays.toString(result));
        return result;
    }

    public static int[] sort(int[] nums,int iL, int iR){
        //điều kiện dừng
        if (iL == iR){
            int[] singleEl = {nums[iL]};
            return singleEl;
        }
        if (iL > iR) return new int[0];
        //chia ra
        int iM = (iL + iR)/2;
//        System.out.println("chia "+iL+" - "+ iR);
//        System.out.println("imid" + iM);
        int[] nums1 = sort(nums,iL,iM);
        int[] nums2 = sort(nums,iM +1,iR);
//        System.out.println("nums1" + Arrays.toString(nums1));
//        System.out.println("nums2" + Arrays.toString(nums2));
        return merge(nums1,nums2);

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,2,8,7,6,4};

        System.out.println(Arrays.toString(sort(nums,0,nums.length-1)));
    }
}
