public class Utils {

    public static void print(ListNode a) {
        print(a, "");
    }

    public static void print(ListNode a, String name) {
        System.out.print(name + ": ");
        while (a != null) {
            System.out.print(a.val);
            if (a.next != null) {
                System.out.print(" -> ");
            }
            a = a.next;
        }
        System.out.println();
    }

    public static ListNode create(int... a) {
        ListNode b = null;
        for (int j : a) {
            b = insert(b, new ListNode(j));
        }
        return b;
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

    public static ListNode getNElements(ListNode a, int numberOfElements) {
        ListNode res = new ListNode(0);
        while (a != null && numberOfElements > 0) {
            res.next = a;
            a = a.next;
            numberOfElements--;
        }
        return res.next;
    }

    public static int count(ListNode a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }


}
