import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.offer(2);

        queue.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("phần tử đầu tiên: "+ queue.element());
        // giống nhau peek - element
        System.out.println("phần tử đầu tiên "+ queue.peek());

        System.out.println("Xóa phần tử đầu "+ queue.remove());
        queue.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("bỏ phần đầu của hàng đợi. Trả về null nếu hàng đợi trống. "+ queue.poll());
        queue.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        Deque<Integer> deque = new LinkedList<>();
        deque.add(5);
        deque.add(7);
        deque.add(1);
        deque.add(4);
        deque.addFirst(0);
        deque.addLast(12);
        deque.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
    }
}
