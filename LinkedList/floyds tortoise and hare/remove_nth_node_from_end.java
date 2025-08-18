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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1 = head;
        int size = 0 ;
        while(temp1 != null){
            temp1 = temp1.next;
            size++;
        }
        if(n==size){
            return head.next;
        }

        int i = size - n;
        ListNode temp2 = head;
        for(int j = 0; j<i-1; j++){
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}