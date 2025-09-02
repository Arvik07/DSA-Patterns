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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode dummyeven = new ListNode(-1);
        ListNode dummyodd = new ListNode(-1);
        ListNode even = dummyeven;
        ListNode odd = dummyodd;
        int count=0;
        while(temp!=null){        
            if(count%2==0){
                even.next=temp;
                even = even.next;
            }
            else{
                odd.next=temp;
                odd = odd.next;
            }
            temp = temp.next;
            count++;
        }
        odd.next=null;
        even.next=dummyodd.next;
        return dummyeven.next;

    }
}