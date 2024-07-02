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
    public ListNode mergeNodes(ListNode head) {
       ListNode dummy=new ListNode(0);
       ListNode prev=dummy;
       ListNode temp=head.next;
       int sum=0;
       while(temp!=null){
        while(temp.val!=0){
            sum+=temp.val;
            temp=temp.next;
        }
        prev.next=new ListNode(sum);
        prev=prev.next;
        temp=temp.next;
        sum=0;
       }
    return dummy.next;
    }
}