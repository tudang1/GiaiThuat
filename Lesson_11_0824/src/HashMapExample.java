import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"PHP");
        map.put(3,"JS");
        map.put(4,"HTML");
        map.put(5,"Java");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.put(1,"e");
        treeMap.put(4,"a");
        treeMap.put(2,"t");
        treeMap.put(6,"b");
        System.out.println(treeMap);
    }
}
