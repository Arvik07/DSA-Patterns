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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode temp = head;
        while(temp!=null){
            if(temp.next != null && temp.val==temp.next.val){
                while(temp.next != null && temp.val == temp.next.val){
                    temp=temp.next;
                }
                temp=temp.next;
            }
            else{
                ans.next = temp;
                ans=ans.next;
                temp=temp.next;
            }
            
        }
        ans.next = null;
        return dummy.next;

    }
}