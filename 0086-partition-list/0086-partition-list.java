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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode large=new ListNode(0);
        ListNode shead=small,lhead=large;
        while(head!=null){
            if(head.val<x){
                shead.next=head;
                shead=shead.next;
            }
            else{
                lhead.next=head;
                lhead=lhead.next;
            }
            head=head.next;
        }
        lhead.next=null;
        shead.next=large.next;
        return small.next;
    }
}