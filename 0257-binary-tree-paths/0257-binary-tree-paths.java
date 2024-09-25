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
        if(root!=null){
            binary(root,"",l1);
        }
        return l1;
    }
    public List<String> binary(TreeNode root,String path,List<String> list){
        if(root!=null){
            path+=root.val;
            if(root.left==null && root.right==null){
                list.add(path);
            }
            else{
                path+="->";
                binary(root.left,path,list);
                binary(root.right,path,list);
            }
        }
        
        return list;
    }
}