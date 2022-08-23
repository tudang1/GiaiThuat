import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(4);
        stack.add(1);
        stack.add(2,5);
        stack.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        System.out.println("phần từ cuối cùng "+ stack.peek());

        System.out.println("phần tử cuối cùng "+ stack.pop());
        // stack.pop lấy phần tử cuối và tiện xóa luôn khỏi chuỗi
        stack.forEach(i -> System.out.print(i + "\t"));
    }
}
