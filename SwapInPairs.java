public class SwapInPairs {

    public static void main(String[] args) {
        ListNode a = Utils.create(1, 2, 3, 4);
        ListNode re = swapInPairs(a, 2);
        Utils.print(re, "result");
    }

    public static ListNode swapInPairs(ListNode A, int number) {
        ListNode a = A;
        int count = 0;
        Utils.print(a, "aaaa");
        ListNode res = new ListNode(0);
        while (a != null) {
            ListNode b = Utils.getNElements(a, 2);
            Utils.print(b, "before reverse");
            Utils.reverse(b);
            Utils.print(a, "a");
            Utils.print(b, "b");
            if (count == number) {
                res.next = b;
                count = 0;
            }
            a = a.next;
            count++;
        }
        Utils.print(A, "A");
        return res.next;
    }


}
