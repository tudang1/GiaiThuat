import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        // không cho tạo , lưu các phần tử trùng lặp.
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(3));
        System.out.println(hashSet.add(4));
        System.out.println(hashSet.add(3));

        System.out.println("---");
        hashSet.forEach(i-> System.out.print(i + "\t"));
        System.out.println();
        //kiểm tra phần tử đã tồn tại chưa
        System.out.println(hashSet.contains(3));
        System.out.println(hashSet.hashCode());

        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(4);

        //xóa cá phần tử k trung lặp với (set)
        hashSet.retainAll(set);
        hashSet.forEach(i-> System.out.print(i + "\t"));
        System.out.println();

        //treeSet hỗ trợ sắp xếp theo thứ tự tăng dần
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(2);

        treeSet.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        System.out.println("sắp xếp theo thứ tự giảm dần");
        System.out.println(treeSet.descendingSet());
    }
}
