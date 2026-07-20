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
    public ListNode getmid(ListNode head) {

         ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;



        }
     return slow;

        
        
        
    } 
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        
        while(present!=null){
            ListNode up = present.next;

            present.next = prev;
            prev = present;
            present = up;
            
            


        }
       
        return prev;
        
        
    }
    public void reorderList(ListNode head) {
        ListNode mid = getmid(head);

        ListNode second = reverse(mid.next);
        mid.next = null;          
        
  while (second != null) {

            ListNode temp1 = head.next;
            ListNode temp2 = second.next;

            head.next = second;
            second.next = temp1;

            head = temp1;
            second = temp2;
        }
        

        
    }
}