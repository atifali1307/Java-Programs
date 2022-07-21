// Leetcode 92

// Reverse Linked List II

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=null;
        ListNode curr=head;
        int i=1;
        while(i<left){
            prev=curr;
            curr=curr.next;
            i++;
        }
        ListNode end=curr;
        ListNode pre=null;
        while(i<=right){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
            i++;
        }
        end.next=curr;
        if(prev!=null) prev.next=pre;
        return prev==null?pre:head;
    }
}
