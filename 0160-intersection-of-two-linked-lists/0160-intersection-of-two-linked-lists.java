/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)return null;
        int sizeA=size(headA);
        int sizeB=size(headB);
        while(sizeA>sizeB){
            headA=headA.next;
            sizeA--;
        }
        while(sizeB>sizeA){
            headB=headB.next;
            sizeB--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    public int size(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
}