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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        helper(root,l1,0);
        return l1;
    }
    public void helper(TreeNode root,List<Integer> list,int depth){
        if(root==null)return;
        if(depth==list.size())list.add(root.val);
        helper(root.right,list,depth+1);
        helper(root.left,list,depth+1);
    }
}