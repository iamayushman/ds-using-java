//public class Intersection {
//    public static void main(String[] args) {
//        ListNode a = Utils.create(1, 1, 3, 4, 5, 6);
//        ListNode b = Utils.create(0, 3, 4, 5, 6);
//        Utils.print(a, "a");
//        Utils.print(b, "b");
//        ListNode listNode = intersectionNode(a, b);
//        Utils.print(listNode);
//
//    }
//
//    static ListNode intersectionNode(ListNode a, ListNode b) {
//        int sizeA = Utils.count(a);
//        int sizeB = Utils.count(b);
//
//        int diff = Math.abs(sizeA - sizeB);
//
//        ListNode small = sizeA > sizeB ? b : a;
//        ListNode big = sizeA > sizeB ? a : b;
//
//        for (int i = 0; i < diff; i++) {
//            fast = fast.next;
//        }
//
//        while (fast != slow) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//        return slow;
//    }
//}
