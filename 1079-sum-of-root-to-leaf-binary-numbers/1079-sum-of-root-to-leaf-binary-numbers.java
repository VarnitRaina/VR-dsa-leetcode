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
    public int sumRootToLeaf(TreeNode root) {
        return sumRoot(root,0);
    }
    public int sumRoot(TreeNode root,int val){
        if(root==null)return 0;
        val=2*val+root.val;
        return (root.left==root.right)?val:sumRoot(root.left,val)+sumRoot(root.right,val);
    }
}