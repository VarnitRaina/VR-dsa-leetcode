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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode nextNode=null,prevTail=null;
        while(temp!=null){
            ListNode kNode=kNode(temp,k);
            if(kNode==null){
                if(prevTail!=null){
                    prevTail.next=temp;
                }
                break;
            }
            nextNode=kNode.next;
            kNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kNode;
            }
            else{
                prevTail.next=kNode;
            }
            prevTail=temp;
            temp=nextNode;
        }
        return head;
    }
    public void reverse(ListNode head){
        ListNode temp=head,prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
    }
    public ListNode kNode(ListNode head,int k){
        while(head!=null && k>1){
            head=head.next;
            k--;
        }
        return head;
    }
}