import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [][] nums = {
                {1,2,3},
                {3,2,1}
        };
//        System.out.println(_1672_Richest_Customer_Wealth.maximumWealth(nums));
//        String[] arr = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
//        _609_Find_Duplicate_File_in_System.findDuplicate(arr);
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(3);
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(2);
        rooms.add(new ArrayList<>(nums1));
        rooms.add(new ArrayList<>(nums2));
        rooms.add(new ArrayList<>(3));
        System.out.println(rooms.get(0).get(0));
    }
}
