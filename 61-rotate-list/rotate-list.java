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
    public ListNode rotateRight(ListNode head, int k) {
                if (head == null || head.next == null) {
            return head;
        }

 int length = 1;
ListNode temp = head;

while (temp.next != null) {
    length++;
    temp = temp.next;
}

        k = k % length;


        for(int i =0;i<k;i++){
            ListNode prev = head;
            ListNode last = head.next;
            while(last.next!=null){
                prev = prev.next;
                last = last.next;
            }
        
            
            last.next = head;
            prev.next = null;
            head = last;
        }
        return head;
    }
}