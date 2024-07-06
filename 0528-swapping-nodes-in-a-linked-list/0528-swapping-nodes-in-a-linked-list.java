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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList <Integer>l1=new ArrayList<>();
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            l1.add(temp.val);
            temp=temp.next;
        }
        int tempVal = l1.get(k - 1);
        l1.set(k - 1, l1.get(size - k));
        l1.set(size - k, tempVal);
        temp=head;
        for(int i=0;i<size;i++){
            temp.val=l1.get(i);
            temp=temp.next;
        }
        return head;
}
}