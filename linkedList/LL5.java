
public class LL5 {

    public static void main(String[] args) {
        // ListNode a = new ListNode(468);
        // a.next = new ListNode(335);
        ListNode a = new ListNode(1);
        a.next = new ListNode(1);
        a.next.next = new ListNode(3);
        a.next.next.next = (new ListNode(4));
        a.next.next.next.next = (new ListNode(5));

        ListNode b = new ListNode(0);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);
        b.next.next.next = (new ListNode(5));
        System.out.println(sortList(a));
    }

    public static ListNode sortList(ListNode A) {
        if (A == null || A.next == null)
            return A;
        ListNode tail = A;
        ListNode slow = A;
        ListNode fast = A;

        while (fast != null && fast.next != null) {
            tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        tail.next = null;

        ListNode left = sortList(A);
        ListNode right = sortList(slow);

        return merge(left, right);
    }

    public static ListNode merge(ListNode left, ListNode right) {
        ListNode merged = new ListNode(0);
        ListNode curr = merged;

        while (left != null && right != null) {
            if (left.val < right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if (left != null) {
            curr.next = left;
        }
        if (right != null) {
            curr.next = right;
        }
        return merged.next;
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