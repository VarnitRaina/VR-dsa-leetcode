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
        Stack<TreeNode> stack=new Stack<>();
        Set<TreeNode> visited=new HashSet<>(); 
        stack.push(root);
        while(!stack.isEmpty()){
            int size=stack.size();
            while(size-->0){
                TreeNode curr=stack.peek();
                if((curr.left==null && curr.right==null) || visited.contains(curr)){
                    result.add(curr.val);
                    stack.pop();
                }else{
                    if(curr.right!=null){
                        stack.push(curr.right);
                    }
                    if(curr.left!=null){
                        stack.push(curr.left);
                    }
                    visited.add(curr);
                }
            }
        }
        return result;
    }
}