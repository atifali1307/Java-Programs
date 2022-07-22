// Leetcode 86
// Partition List

class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
 
        ListNode fhead1 = new ListNode(0);
        ListNode fhead2 = new ListNode(0);
        fhead1.next = head;
        ListNode p = head;
        ListNode prev = fhead1;
        ListNode p2 = fhead2;
 
        while(p != null){
            if(p.val < x){
                p = p.next;
                prev = prev.next;
            }
            else{
                p2.next = p;
                prev.next = p.next;
                p = prev.next;
                p2 = p2.next;
            } 
        }
 
        // close the list
        p2.next = null;
 
        prev.next = fhead2.next;
 
        return fhead1.next;
    }
}