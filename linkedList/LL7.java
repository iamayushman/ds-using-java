public class LL7 {

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
        ListNode r = getIntersectionNode(a, b);
        while (r != null) {
            System.out.println(r.val + " -> ");
        }
    }

    public static ListNode getIntersectionNode(ListNode a, ListNode b) {
        a = reverse(a);
        b = reverse(b);
        int countA = count(a);
        int countB = count(b);

        ListNode ret = null;
        if (countA > countB) {
            while (b != null) {
                if (a.val == b.val) {
                    ret = insert(ret, a);
                    a = a.next;
                    b = b.next;
                } else {
                    break;
                }
            }
        } else {
            while (a != null) {
                if (a.val == b.val) {
                    ret = insert(ret, a);
                    a = a.next;
                    b = b.next;
                } else {
                    break;
                }
            }
        }

        return reverse(ret);
    }

    public static int count(ListNode a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }

    public static ListNode insert(ListNode a, ListNode b) {
        ListNode newNode = new ListNode(b.val);

        if (a == null) {
            a = newNode;
            return a;
        }

        ListNode last = a;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;

        return a;
    }

    public static ListNode reverse(ListNode a) {
        ListNode curr = a;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
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