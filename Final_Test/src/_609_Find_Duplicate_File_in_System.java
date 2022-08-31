import java.util.*;

public class _609_Find_Duplicate_File_in_System {
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> duplicates = new HashMap<>();

        for (String path : paths) {
            String[] splits = path.split(" ");
            System.out.println("splits");
            System.out.print(path + "\t");
            System.out.println();
            for (int i = 1; i < splits.length; i++) {
                String[] splits2 = splits[i].split("\\(");
                System.out.println("splits2");
                System.out.println(Arrays.toString(splits2));
                System.out.println();
                if (!duplicates.containsKey(splits2[1])) {
                    duplicates.put(splits2[1], new ArrayList<String>());

                }

                duplicates.get(splits2[1]).add(splits[0] + "/" + splits2[0]);
                System.out.println("dup");
                System.out.println(duplicates);
            }
        }

        List<List<String>> res = new ArrayList<>();

        for (List<String> duplicate: duplicates.values()) {
            if (duplicate.size() > 1) {
                res.add(duplicate);
            }
        }

        return res;
    }
}
