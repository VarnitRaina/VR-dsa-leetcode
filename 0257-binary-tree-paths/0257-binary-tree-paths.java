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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l1=new ArrayList<>();
        if(root==null)return l1;
        String path=Integer.toString(root.val);
        if(root.left==null && root.right==null)l1.add(path);
        if(root.left!=null) dfs(root.left,path,l1);
        if(root.right!=null) dfs(root.right,path,l1);
        return l1;
    }
    public void dfs(TreeNode node,String path,List<String> list){
        path+="->"+node.val;
        if(node.left==null && node.right==null){
            list.add(path);
            return;
        }
        if(node.left!=null) dfs(node.left,path,list);
        if(node.right!=null) dfs(node.right,path,list);
    }
}