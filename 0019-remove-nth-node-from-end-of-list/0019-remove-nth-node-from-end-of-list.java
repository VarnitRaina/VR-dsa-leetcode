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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int size=size(head);
        ListNode temp=dummy;
        for(int i=0;i<size-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return dummy.next;
    }
    public int size(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}