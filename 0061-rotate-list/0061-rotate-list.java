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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        int n=0;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        temp.next=head;
        k=k%(n+1);
        int jump=n-k;
        temp=head;
        while(jump>0){
            temp=temp.next;
            jump--;
        }
        ListNode resulthead=temp.next;
        temp.next=null;
        return resulthead;
    }
}