public class Partition {

    public static void main(String[] args) {
        ListNode a = Utils.create(1, 2, 3, 4, 5, 6);
        Utils.print(a);
        ListNode listNode = partition(a, 6);
        Utils.print(listNode);
    }

    public static ListNode partition(ListNode A, int B) {
        ListNode small = new ListNode(0);
        ListNode high = new ListNode(0);
        ListNode smaller = small;
        ListNode heigher = high;

        while (A != null) {
            if (A.val < B) {
                smaller.next = A;
                smaller = smaller.next;
            } else {
                heigher.next = A;
                heigher = heigher.next;
            }
            A = A.next;
        }
        heigher.next = null;
        smaller.next = heigher;

        return small.next;
    }
}

