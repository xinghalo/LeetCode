class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class C0002 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 存储进位数据
        int temp = 0;

        ListNode head = null;
        ListNode tail = null;

        // 当l1和l2不为null时，执行加法操作；如果两位，则进一位
        while(l1 !=null || l2 != null){
            ListNode current;
            if(l1 != null){
                temp += l1.val;
                l1 = l1.next;
            }


            if(l2 != null){
                temp += l2.val;
                l2 = l2.next;
            }

            if(temp > 9){
                current = new ListNode(temp-10);
                temp = 1;
            }else{
                current = new ListNode(temp);
                temp = 0;
            }

            if(head == null){
                head = current;
                tail = current;
            }else{
                tail.next = current;
                tail = current;
            }
        }

        if(temp == 1){
            tail.next = new ListNode(1);
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);

        l4.next = l5;
        l5.next = l6;

        ListNode r = addTwoNumbers(l1, l4);
        while(r!=null){
            System.out.println(r.val);
            r = r.next;
        }

        ListNode l7 = new ListNode(5);
        ListNode l8 = new ListNode(5);
        ListNode r2 = addTwoNumbers(l7, l8);
        while(r2!=null){
            System.out.println(r2.val);
            r2 = r2.next;
        }

    }
}
