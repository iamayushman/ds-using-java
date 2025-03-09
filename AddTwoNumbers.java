import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = addTwoNumbers(l1, l2);

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number1 = numberFromNode(l1);
        System.out.println(number1);
        int number2 = numberFromNode(l2);
        System.out.println(number2);
        int result = number1 + number2;
        return nodeFromNumber(result);
    }

    static int numberFromNode(ListNode l) {
        List<Integer> a = new ArrayList<>();

        do {
            a.add(l.val);
            l = l.next;
        } while (l.next != null);
        a.add(l.val);

        Collections.reverse(a);
        String s = String.join(",", a.stream().map(String::valueOf).collect(Collectors.toList()));
        s = s.replaceAll(",", "");
        return Integer.parseInt(s);
    }

    static ListNode nodeFromNumber(int number) {
        ListNode l1 = null;
        String str = String.valueOf(number);
        List<String> lst = Arrays.asList(str.split(""));
        Collections.reverse(lst);
        lst.stream().map(Integer::parseInt).forEach(i -> {
            if (l1 == null) {
                l1 = new ListNode(i);
            }
            l1.next = new ListNode(i);

        });
        return l1;
    }

}