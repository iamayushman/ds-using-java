public class DeleteNthFromEnd {
    public static void main(String[] args) {
        ListNode a = Utils.create(1, 2, 3, 4, 5, 6);
        Utils.print(a);
        ListNode listNode = deleteNthNodeFromEnd(a, 6);
        Utils.print(listNode);

    }

    static ListNode deleteNthNodeFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (head == null) {
            return null;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
