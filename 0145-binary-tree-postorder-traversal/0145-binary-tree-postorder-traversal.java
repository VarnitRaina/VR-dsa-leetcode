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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)return result;
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            int size=stack1.size();
            while(size-->0){
                TreeNode curr=stack1.pop();
                stack2.push(curr);
                result.add(curr.val);
                if(curr.left!=null){
                    stack1.push(curr.left);
                }
                if(curr.right!=null){
                    stack1.push(curr.right);
                }
            }
        }
        Collections.reverse(result);
        return result;
    }
}