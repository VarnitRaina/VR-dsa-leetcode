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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        return inorder(root,l1);
    }
    public List<Integer> inorder(TreeNode root,List<Integer> list){
        if(root==null)return list;
        if(root.left!=null)inorder(root.left,list);
        list.add(root.val);
        if(root.right!=null)inorder(root.right,list);
        return list;
    }
}