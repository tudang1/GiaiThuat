import java.util.HashSet;

public class _349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> temp1 = new HashSet<>();
        for (int i =0; i < nums1.length;i++){
            temp1.add(nums1[i]);
        }
        HashSet<Integer> temp2 = new HashSet<>();
        for (int i =0; i < nums2.length;i++){
            temp2.add(nums2[i]);
        }
        temp1.retainAll(temp2);

        int [] arr = temp1.stream().mapToInt(Integer :: intValue).toArray();
        return arr;
    }
}
