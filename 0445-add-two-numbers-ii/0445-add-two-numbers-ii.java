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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode temp=result;
        l1=reverse(l1);
        l2=reverse(l2);
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null){
            sum=0;
            sum+=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum%=10;
            temp.next=new ListNode(sum);
            temp=temp.next;
        }
        if(carry>0){
            temp.next=new ListNode(carry);
        }
        ListNode ans=reverse(result.next);
        return ans;
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}