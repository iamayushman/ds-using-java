
public class LL2 {

    public static void main(String[] args) {
        ListNode a = new ListNode(468);
        a.next = new ListNode(335);
        // ListNode a = new ListNode(1);
        // a.next = new ListNode(2);
        // a.next.next = new ListNode(3);
        // a.next.next.next = (new ListNode(4));
        // a.next.next.next.next = (new ListNode(5));
        System.out.println(solve(a, 1));
    }

    private static int solve(ListNode A, int B) {
        ListNode fast = A;
        ListNode slow = A;
        int distance = 0;
        // find middle
        // 123456789
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            distance++;
        }

        // reverse
        ListNode curr = A;
        ListNode prev = null;

        while (slow != null) {
            ListNode temp = slow.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        int count = 0;
        while (prev != null) {
            if (count == B) {
                return prev.val;
            }
            count++;
        }
        return -1;
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