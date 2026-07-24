/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

        /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(1);
        dummy.next = head;
        ListNode prevgroup = dummy;

        while (true) {
            ListNode kth = prevgroup;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            if (kth == null) {
                break;
            }

            ListNode nextg = kth.next;
            ListNode current = prevgroup.next;
            ListNode prev = nextg;

            while (current != nextg) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            ListNode temp = prevgroup.next;
            prevgroup.next = kth;
            prevgroup = temp;
        }

        return dummy.next;
    }
}