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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode rev=reverse(slow);
        merge(head,rev);
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode next;
        ListNode prev=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
     private void merge(ListNode first, ListNode second) {
        while (first != null && second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            if (firstNext == null) break;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }
}