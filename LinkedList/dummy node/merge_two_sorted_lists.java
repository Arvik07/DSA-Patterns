class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // dummy node to simplify pointer handling
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        // walk through both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        // attach the remaining part (only one of them is non-null)
        while(list1!=null){
            temp.next = list1;
            list1=list1.next;
        }
        while(list2!=null){
            temp.next = list2;
            list2=list2.next;
        }

        return dummy.next; // skip dummy and return actual head
    }
}
