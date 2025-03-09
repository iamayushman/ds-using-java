public class ReverseAlternateNNodes {
    public static void main(String[] args) {
        ListNode nodes = Utils.create(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Utils.print(nodes);
        ListNode nodes1 = reverseAlternateKNodes(nodes, 3);
        Utils.print(nodes1);

    }

    public static ListNode reverseAlternateKNodes(ListNode head, int k) {
        int count = 0;
        ListNode prev = null;
        ListNode curr = head;

        while (count < k) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }
        if (curr != null) {
            head.next = reverseAlternateKNodes(curr, k);
        }

        return prev;
    }


}
