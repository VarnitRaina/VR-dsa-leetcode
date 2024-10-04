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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }
    public int sum(TreeNode root){
        if(root==null)return 0;
        int sum=0;
        if(root.left!=null && root.left.right==null && root.left.left==null)
            sum+=root.left.val;
        sum+=sum(root.left);
        sum+=sum(root.right);
        return sum;
    }
}