/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode ans=new ListNode(0);
       ListNode result=ans;
       int carry=0;
       int sum=0;
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
        sum=sum%10;
        result.next=new ListNode(sum);
        result=result.next;
       }
       if(carry>0){
        result.next=new ListNode(carry);
       }
       return ans.next;
    }
}