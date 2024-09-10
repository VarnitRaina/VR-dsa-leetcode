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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> l1=new ArrayList<>();
        inorder(root,l1);
        TreeNode dummy=new TreeNode(0);
        TreeNode curr=dummy;
        for(int i:l1){
            curr.right=new TreeNode(i);
            curr=curr.right;
        }
        return dummy.right;
    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}