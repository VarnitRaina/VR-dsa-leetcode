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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp!=null){
            int sum=0;
            ListNode then=temp.next;
            while(then!=null){
                sum+=then.val;
                if(sum==0){
                    temp.next=then.next;
                }
                then=then.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}