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
        List<Integer> result=new ArrayList<>();
        if(root==null)return result;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(true){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            else{
                if(stack.isEmpty())break;
                curr=stack.pop();
                result.add(curr.val);
                curr=curr.right;
            }
        }
        return result;
    }
}