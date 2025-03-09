/**
 * Definition for singly-linked list.
 * class ListNode {
 * public int val;
 * public ListNode next;
 * ListNode(int x) { val = x; next = null; }
 * }
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode temp1 = A;
        ListNode temp2 = B;
        ListNode result;

        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }

        if (temp1.val > temp2.val) {
            result = temp2;
            result.next = mergeTwoLists(temp1, temp2.next);
        } else {
            result = temp1;
            result.next = mergeTwoLists(temp1.next, temp2);
        }

        return result;
    }
}
