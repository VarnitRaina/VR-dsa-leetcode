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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        preOrder(root,l1);
        return l1;
    }
    private void preOrder(TreeNode root,List<Integer> result){
        if(root==null)return;
        result.add(root.val);
        preOrder(root.left,result);
        preOrder(root.right,result);
    }
}