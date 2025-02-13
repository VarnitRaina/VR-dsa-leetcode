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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode temp=l1;
        ListNode prev=null;
        while(temp!=null && l2!=null){
            if(temp.val>l2.val){
                if(prev==null){
                    l1=l2;
                    l2=l2.next;
                    l1.next=temp;
                    temp=l1;
                }
                else{
                    prev.next=l2;
                    l2=l2.next;
                    prev.next.next=temp;
                    prev=prev.next;
                }
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
        if(temp==null){
            prev.next=l2;
        }
        return l1;
    }
}