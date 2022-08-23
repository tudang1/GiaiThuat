public class _206_Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode curr = null;
        ListNode prev = null;
        while(temp != null){
            curr = temp;
            temp = temp.next;
            curr.next = prev;
            prev = curr;

        }
        return curr;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        ListNode head = n1;
        n1.next =n2;
        n2.next =n3;
        n3.next =n4;
        n4.next =n5;

        print(head);

        print(reverseList(head));
    }
    public static void print(ListNode headNode){
        if(headNode == null){
            System.out.println("List is empty");
        }else {
            ListNode temp = headNode;
            while (temp != null){
                System.out.print(temp.val); // in ra giá trị hiện tại
                temp = temp.next;
                if(temp != null){
                    System.out.print(" -> ");
                }else {
                    System.out.println();
                }
            }
        }
    }
}
