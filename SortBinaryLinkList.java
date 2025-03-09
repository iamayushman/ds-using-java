public class SortBinaryLinkList {
    public static void main(String[] args) {
        ListNode head = Utils.create(1, 1, 0, 0, 0, 1, 1, 0, 0);
        Utils.print(head);
        ListNode sorted = sortBinary(head);
        Utils.print(sorted);

    }

    private static ListNode sortBinary(ListNode head) {
        ListNode temp = head;
        int count0 = 0;
        int count1 = 0;
        while (temp != null) {
            if (temp.val == 0) {
                count0++;
            } else {
                count1++;
            }
            temp = temp.next;
        }
        temp = head;
        while (count0-- > 0) {
            temp.val = 0;
            temp = temp.next;
        }
        while (count1-- > 0) {
            temp.val = 1;
            temp = temp.next;
        }

        return head;
    }
}
