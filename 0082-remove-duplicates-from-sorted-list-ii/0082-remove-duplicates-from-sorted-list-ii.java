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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode prev=dummy;
        while(temp!=null){
            boolean dup=false;
            while(temp.next!=null && temp.val==temp.next.val){
                dup=true;
                temp=temp.next;
            }
            if(dup){
                prev.next=temp.next;
            }
            else{
                prev=prev.next;
            }
            temp=temp.next;
        }
    return dummy.next;
    }
}