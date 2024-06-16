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
    private int length=0;
    private ListNode head;
    public Solution(ListNode head) {
        this.head=head;
        while(head!=null){
            length++;
            head=head.next;
        }
    }
    
    public int getRandom() {
        int randomIdx=(int) (Math.random()*length);
        ListNode h=head;
        int idx=0;
        while(idx!=randomIdx){
            h=h.next;
            idx++;
        }
        return h.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */