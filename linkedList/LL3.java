
public class LL3 {

    public static void main(String[] args) {
        // ListNode a = new ListNode(468);
        // a.next = new ListNode(335);
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = (new ListNode(4));
        a.next.next.next.next = (new ListNode(5));
        a.next.next.next.next.next = (new ListNode(6));
        System.out.println(solve(a, 2));
    }
   // 1 2 3 4 5 6
    private static ListNode solve(ListNode A, int B) {
        ListNode curr = A;
        ListNode prev = null;
        ListNode first = null;
        int count = 0;
        while (curr != null) {
            if (count == 0) {
                first = curr;
            }
            if (count == B) {
                first.next = curr;
                curr = first;
                first = curr.next;
                // prev = curr;
                count = 0;
            } else {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                count++;
            }
        }
        return prev;
    }

}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }
}