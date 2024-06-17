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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode l1=head;
        ListNode l2=l1.next;
        while(l1!=null && l2!=null){
            ListNode temp=l2.next;
            l2.next=l1;
            l1.next=temp;
            prev.next=l2;
            prev=l1;
            l1=temp;
            if(l1!=null){
                l2=l1.next;
            }
        }
        return dummy.next;
    }
}