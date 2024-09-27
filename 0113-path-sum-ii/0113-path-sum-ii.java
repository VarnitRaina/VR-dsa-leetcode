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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> l1=new ArrayList<>();
        helper(root,targetSum,l1,new ArrayList<>());
        return l1;
    }
    public void helper(TreeNode root,int targetSum,List<List<Integer>> l1,List<Integer> l2){
        if(root==null)return;
        l2.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum){
            l1.add(new ArrayList<>(l2));
        }
        helper(root.left,targetSum-root.val,l1,l2);
        helper(root.right,targetSum-root.val,l1,l2);
        l2.remove(l2.size()-1);
    }
}