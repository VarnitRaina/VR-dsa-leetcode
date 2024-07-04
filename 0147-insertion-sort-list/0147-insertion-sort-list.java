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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode sorted=head;
        while(sorted.next!=null){
            if(sorted.val<=sorted.next.val){
                sorted=sorted.next;
            }
            else{
                ListNode temp=sorted.next;
                sorted.next=sorted.next.next;
                ListNode prev=dummy;
                while(prev.next.val<=temp.val){
                    prev=prev.next;
                }
                temp.next=prev.next;
                prev.next=temp;
            }
        }
        return dummy.next;
    }
}