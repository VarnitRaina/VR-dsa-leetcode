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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null)return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
        for(int i=1;i<left;i++){
            temp=temp.next;
        }
        ListNode start=temp.next;
        ListNode then=start.next;
        for(int i=0;i<right-left;i++){
            start.next=then.next;
            then.next=temp.next;
            temp.next=then;
            then=start.next;
            
        }
        return dummy.next;
    }
}