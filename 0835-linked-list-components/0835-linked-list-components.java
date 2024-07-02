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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i:nums){
            h1.add(i);
        }
        int ans=0;
        boolean inComponent=false;
        while(head!=null){
            if(h1.contains(head.val)){
                if(!inComponent){
                    ans++;
                    inComponent=true;
                }
            }
                else{
                    inComponent=false;
                }
            head=head.next;
            }
        return ans;
    }
}