import java.util.LinkedList;
import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public _232_Implement_Queue_using_Stacks() {
        st1=new Stack<>();
        st2=new Stack<>();
    }

    public void push(int x) {
        st1.push(x);
    }
    public int pop() {
        while (!st1.isEmpty()){
            // nếu st1 k trống thì sẽ POP và đồng thời thêm các ptu bị xóa vào st2
            st2.push(st1.pop());
        }
        int temp = st2.pop();
        while (!st2.isEmpty()){
            // nếu st2 k trống thì sẽ POP và đồng thời thêm các ptu bị xóa vào st1
            st1.push(st2.pop());
        }
        return temp;
    }

    public int peek() {
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int temp = st2.peek();
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return temp;
    }

    public boolean empty() {
        return st1.isEmpty();
    }
}
