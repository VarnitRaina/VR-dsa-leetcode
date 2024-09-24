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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return tree(preorder,map,0,0,inorder.length-1);
    }
    public TreeNode tree(int[] preorder,Map<Integer,Integer> map,int rootIndex,int left,int right){
        if(left>right)return null;
        TreeNode root=new TreeNode(preorder[rootIndex]);
        int mid=map.get(preorder[rootIndex]);
        if(mid>left){
            root.left=tree(preorder,map,rootIndex+1,left,mid-1);
        }
        if(mid<right){
            root.right=tree(preorder,map,rootIndex+mid-left+1,mid+1,right);
        }
        return root;
    }
}