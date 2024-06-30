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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr=new int[2];
        int minDistance=Integer.MAX_VALUE;
        int findex=-1;
        int pindex=-1;
        int index=1;
        ListNode prev=head;
        ListNode temp=head.next;

        while(temp.next!=null){
            if((temp.val<prev.val && temp.val<temp.next.val) || (temp.val>prev.val && temp.val>temp.next.val)){
                if(findex==-1){
                    findex=index;
                }
                if(pindex!=-1){
                    minDistance=Math.min(minDistance,index-pindex);
                }
                pindex=index;
                
            }
            prev=temp;
            temp=temp.next;
            ++index;
        }
        if(minDistance==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[] {minDistance,pindex-findex};
    }
}