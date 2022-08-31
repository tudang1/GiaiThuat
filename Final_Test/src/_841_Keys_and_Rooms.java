import java.util.List;
import java.util.Stack;

public class _841_Keys_and_Rooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        int count = 1;
//        Stack<Integer> st = new Stack<>();
//        int n = rooms.size();
//        st.push(0);
//        for (int i =0 ; i < n; i++){
//            for (int j =0;j<rooms.get(i).size();j++){
//                int temp = rooms.get(i).get(j);
//                if (!st.contains(temp) && temp != i){
//                    st.push(temp);
//                    count++;
//                }
//            }
//        }
//
//    return st.size() == rooms.size();

        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0] = true;
        while(!stack.isEmpty()){
            int currRoom = stack.pop();
            for(int key : rooms.get(currRoom)){
                if(!visited[key]){
                    visited[key] = true;
                    stack.push(key);
                }
            }
        }
        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        return true;
    }
}
