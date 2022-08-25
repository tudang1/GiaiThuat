import java.util.HashSet;

public class _136_Single_Number {
    public static int singleNumber(int[] nums) {
//        int i=0;
//        for(int a: nums){
        //toán tử XOR
//            i = i ^a;
//        }
//        return i;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if (!set.contains(num)) set.add(num);
            else set.remove(num);
        }
        // chuyển thành int ||   iterator().next()
        System.out.println(set.iterator().next());
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
        singleNumber(arr);
    }
}
