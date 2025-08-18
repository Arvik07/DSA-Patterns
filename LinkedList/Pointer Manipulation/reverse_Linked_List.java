class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pointer = head;
        ListNode prepointer = null;
        ListNode temp;

        while (pointer != null) {
            temp = pointer.next;       // save next
            pointer.next = prepointer; // reverse link
            prepointer = pointer;      // move prepointer up
            pointer = temp;            // move pointer forward
        }

        return prepointer; // new head
    }
}
