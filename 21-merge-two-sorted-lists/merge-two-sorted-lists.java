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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode main = temp;
        while(list1 != null && list2!=null){
            if(list1.val<=list2.val){
                main.next = list1;
                list1=list1.next;

            }
            else{
                main.next = list2;
                list2 = list2.next;
            }
            main = main.next;
            
        }
        if(list1!=null){
            main.next = list1;
            

        }
        else{
            main.next = list2;
      
        }
        return temp.next;
    }
}