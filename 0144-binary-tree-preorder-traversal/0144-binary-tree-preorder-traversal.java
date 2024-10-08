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
        if(root==null)return l1;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            int size=stack.size();
            while(size-->0){
                TreeNode curr=stack.pop();
                l1.add(curr.val);
                if(curr.right!=null){
                    stack.push(curr.right);
                }
                if(curr.left!=null){
                    stack.push(curr.left);
                }
            }
        }
        return l1;
    }
}