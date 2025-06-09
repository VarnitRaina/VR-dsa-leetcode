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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevGrouptail=dummy;
        ListNode curr=head;
        while(hasKnodes(curr,k)){
            ListNode groupHead=curr;
            ListNode prev=null;
            int count=0;
            while(count<k && curr!=null){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            prevGrouptail.next=prev;
            groupHead.next=curr;
            prevGrouptail=groupHead;
        }
        return dummy.next;
    }
    public boolean hasKnodes(ListNode head,int k){
        int count=0;
        while(head!=null && count<k){
            head=head.next;
            count++;
        }
        return count==k;
    }
}