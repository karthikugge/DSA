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
    public boolean isPalindrome(ListNode head) {

         ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;



        }
        ListNode mid = slow;
        ListNode secondhead = reverse(mid);
        while(head!=null&&secondhead!=null){
            if(head.val!=secondhead.val){
                return false;
            }
                head = head.next;
                secondhead=secondhead.next;
            
        }
        return true;

        
        
        
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

        
    
}