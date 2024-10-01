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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>> l1=new ArrayList<>();
       int height=height(root);
       for(int i=height;i>0;i--){
            List<Integer> l2=new ArrayList<>();
            traverse(root,l2,i);
            l1.add(l2);
        }
        return l1;
    }
    public void traverse(TreeNode root,List<Integer> list,int count){
        if(root==null)return;
        if(count==1)list.add(root.val);
        else if(count>1){
            traverse(root.left,list,count-1);
            traverse(root.right,list,count-1);
        }

    }
    public int height(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}