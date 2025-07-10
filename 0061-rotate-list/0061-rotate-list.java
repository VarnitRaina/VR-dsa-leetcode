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
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail=head,temp=head;
        int size=0;
        while(tail.next!=null){
            size++; 
            tail=tail.next;
        }
        k%=size;
        if(k==0){
            return head;
        }
        tail.next=head;
        int len=1;
        while(temp!=null){
            if(len==size || len==size-k)break;
            len++;
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}