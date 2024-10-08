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
    int minDiff=Integer.MAX_VALUE;
    int prev=-1;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        if(prev!=-1){
            minDiff=Math.min(minDiff,Math.abs(root.val-prev));
        }
        prev=root.val;
        inorder(root.right);
    }
}