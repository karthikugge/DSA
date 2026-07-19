/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
             ListNode slow = head;
        ListNode fast = head;
        ListNode first = head;
        int length =0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                while(first!=slow){
                    first = first.next;
                    slow = slow.next;
                 

                }
                return first;
            }
        }

       return null;
    }
            

}


