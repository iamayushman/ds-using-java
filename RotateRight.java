public class RotateRight {

    public static void main(String[] args) {
        ListNode a = Utils.create(1, 2, 3, 4);
        ListNode re = rotateRight(a, 2);
        Utils.print(re, "result");
    }

    public static ListNode rotateRight(ListNode A, int B) {
        int length = 0;
        ListNode curr = A;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        B = B % length;
        if (B == 0) {
            return A;
        }

        int num = length - B;
        curr = A;
        while (num > 1) {
            curr = curr.next;
            num--;
        }

        ListNode head = curr.next;
        curr.next = null;

        curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = A;

        return head;
    }
}
