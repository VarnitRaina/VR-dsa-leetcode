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
        traversal(root,l1,0);
        Collections.reverse(l1);
        return l1;
    }
    public void traversal(TreeNode root,List<List<Integer>> list,int count){
        if(root==null)return;
        if(list.size()==count){
            list.add(new ArrayList<>());
        }
        list.get(count).add(root.val);
        traversal(root.left,list,count+1);
        traversal(root.right,list,count+1);
    }
}