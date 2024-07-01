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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy.next;
        ListNode max=temp;
        while(temp!=null && temp.next!=null){
            if(temp.next.val<max.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
                max=temp;
            }
        }
        return reverse(dummy.next);
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        ListNode next;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}