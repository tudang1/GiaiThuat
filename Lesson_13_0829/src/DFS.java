import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {//LIFO

    public static void main(String[] args) {
        int[][] graph = {
                {0,1,0,0,0,0,0},
                {1,0,1,0,0,0,1},
                {0,1,0,1,1,1,1},
                {0,0,1,0,1,1,0},
                {0,0,1,1,0,1,0},
                {0,0,1,1,1,0,0},
                {0,1,1,0,0,0,0},
        };

        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();

        //chọn đỉnh đầu là dỉnh 0
        stack.add(0);
        set.add(0);

        while (!stack.isEmpty()){
            int u = stack.pop();
            System.out.print(u + "\t");

            //add tất cả các đỉnh kề với đỉnh u mà chưa được duyệt vào stack
            for (int i =0; i < graph.length;i++){
                if (graph[u][i] == 1 && !set.contains(i)){
                    stack.add(i);
                    set.add(i);
                }
            }
        }
    }
}
