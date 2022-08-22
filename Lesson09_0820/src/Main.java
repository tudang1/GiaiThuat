import javax.swing.plaf.IconUIResource;

public class Main {
    static Node head;
    public static void main(String[] args) {
        Node n1 =new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

//        print(n1);
        head = n1;
        print();
        addAtHead(0);
        print();

        addAtTail(4);
        print();

        addAtIndex(3,5);
        print();

        deleteAtIndex(3);
        print();

        System.out.println(get(4));
    }

    public static void print(){
        if (head == null){
            System.out.println("empty");
        }else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null){
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }

    public static void print(Node headNode){
        if (headNode == null){
            System.out.println("empty");
        }else {
            Node temp = headNode;
            while(temp != null){
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null){
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }

    }

    public static int get(int index) {
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == index){
                return temp.val;
            }else {
                count++;
                temp = temp.next;
            }
        }
        return -1;
    }
    public static void addAtHead(int val){
        // kiểm tra xem head mình có null hay k?


        //b1: tạo node mới
        Node newNode = new Node(val);
        //b2:trỏ node mới vào head
        newNode.next = head;
        head = newNode;

    }
    public static void addAtTail(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next; // tìm địa chỉ node cuối
        }
        temp.next = newNode;
    }

    public static void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (index == 0){
            newNode.next = head;
            head = newNode;
        }else {
            int count = 0;
            Node temp = head;
            while (temp.next != null){
                count ++;
                if(count == index){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                // để cho vòng lặp while chạy giá trị bình thường
                temp = temp.next;
            }
        }
    }

    public static void deleteAtIndex(int index) {
        if (index == 0){
            head = head.next;
            return;
        }
        if (head != null){
            Node currNode = head;
            Node preNode = null;
            int count = 0;

            while(currNode != null){
                if (count == index){
                    preNode.next = currNode.next;
                    break;
                }else {
                    count ++;
                    preNode = currNode;
                    currNode = currNode.next;
                }
            }
        }
    }
}
