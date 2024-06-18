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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l1=new ArrayList<>();
        while(head!=null){
            l1.add(head.val);
            head=head.next;
        }
        Stack <Integer> stack=new Stack<>();
        int[] answer=new int[l1.size()];

        for(int i=0;i<l1.size();i++){
            while(!stack.isEmpty() && l1.get(stack.peek())<l1.get(i)){
                answer[stack.pop()]=l1.get(i);
            }
            stack.add(i);
        }
        return answer;
    }
}