x/**
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preptr = dummy;

        // 1) move preptr to the node just BEFORE position `left`
        for (int i = 1; i < left; i++) {
            preptr = preptr.next;
        }

        // 2) ptr points to the FIRST node of the sublist to reverse
        ListNode ptr = preptr.next;

        // 3) head-insertion inside the sublist
        for (int i = 0; i < right - left; i++) {
            ListNode temp = ptr.next;     // node to move forward
            ptr.next = temp.next;         // detach temp from after ptr
            temp.next = preptr.next;      // plug temp right after preptr
            preptr.next = temp;           // move sublist head to temp
        }

        return dummy.next;
    }
}

