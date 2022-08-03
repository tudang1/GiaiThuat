public class _905_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        // int index=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]%2==0){
        //         int temp=nums[index];
        //         nums[index++]=nums[i];
        //         nums[i]=temp;
        //     }
        // }return nums;
        int index =0;
        int temp;
        for(int i = 0;i < nums.length; i++){
            if(nums[i]%2 == 0){
                temp = nums[i];
                nums[i]= nums[index];
                nums[index] = temp;
                index++;
            }
        }
        return nums;
    }
}
