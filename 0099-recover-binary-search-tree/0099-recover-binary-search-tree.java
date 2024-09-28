/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
            TreeNode prev=null,first=null,end=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp=first.val;
        first.val=end.val;
        end.val=temp;
    }
    public void inorder(TreeNode curr){
        if(curr==null)return;
        inorder(curr.left);
        if(prev!=null){
            if(curr.val<prev.val){
                if(first==null){
                    first=prev;
                }
                end=curr;
            }
        }
        prev=curr;
        inorder(curr.right);
    }
}