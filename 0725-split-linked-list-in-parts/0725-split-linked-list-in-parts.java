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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int min_len=len/k;
        int extra=len%k;
        int i=0;
        ListNode curr_head=head;
        ListNode prev=null;
        while(curr_head!=null && i<k){
            ans[i]=curr_head;
            for(int j=0;j<min_len+(extra>0?1:0);j++){
                prev=curr_head;
                curr_head=curr_head.next;
            }
            prev.next=null;
            i++;
            extra--;
        }
        return ans;
    }
}