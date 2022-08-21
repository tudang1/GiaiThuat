import java.text.CollationElementIterator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Tư","Ly","Hồng","Hương"};
        List<String> list = new ArrayList<>();
        list = Arrays.asList(arr);

//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(Collections.binarySearch(list,"Ly"));

        System.out.println(list);
       int sea = Collections.binarySearch(list, "Tư", new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(sea);
    }
}
