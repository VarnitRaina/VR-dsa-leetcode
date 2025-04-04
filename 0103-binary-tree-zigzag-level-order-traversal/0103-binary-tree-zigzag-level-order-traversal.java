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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        int count=1;
        stack1.push(root);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            List<Integer> l1=new ArrayList<>();
            if(count%2!=0){
                while(!stack1.isEmpty()){
                    TreeNode curr=stack1.pop();
                    l1.add(curr.val);
                    if(curr.left!=null)stack2.push(curr.left);
                    if(curr.right!=null)stack2.push(curr.right);
                }
            }
            else{
                while(!stack2.isEmpty()){
                    TreeNode curr=stack2.pop();
                    l1.add(curr.val);
                    if(curr.right!=null)stack1.push(curr.right);
                    if(curr.left!=null)stack1.push(curr.left);
                }
            }
            count++;
            result.add(l1);
        }
        return result;
    }
}