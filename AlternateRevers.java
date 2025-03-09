public class AlternateRevers {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {
        public ListNode solve(ListNode A, int B) {
            ListNode temp = A, newNode = null, last = null;
            while(temp!=null){
                ListNode curr = null, pre = null, temp1 = temp;
                int count = 0;
                while(temp!=null && count<B){
                    curr = temp ;
                    temp = temp.next;
                    curr.next = pre;
                    pre = curr;
                    count++;
                }
                temp1.next = temp;
                if(newNode == null) newNode = pre;
                else last.next = pre;
                if(temp==null) return newNode;
                count = 1;
                while(count < B){
                    temp = temp.next;
                    count++;
                }
                last = temp;
                temp = temp.next;
            }
            return newNode;
        }
    }
}
