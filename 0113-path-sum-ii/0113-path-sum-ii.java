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
        path(root,targetSum,l1,new ArrayList());
        return l1;
    }
    public void path(TreeNode root,int sum,List<List<Integer>> l1,List<Integer> l2){
        if(root==null)return;
        l2.add(root.val);
        if(root.left==null && root.right==null && sum==root.val){
            l1.add(l2);
        }
        path(root.left,sum-root.val,l1,new ArrayList(l2));
        path(root.right,sum-root.val,l1,new ArrayList(l2));
    }
}