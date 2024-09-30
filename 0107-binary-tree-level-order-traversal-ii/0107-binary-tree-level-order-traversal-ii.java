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
        traversal(root,l1,l1.size());
        Collections.reverse(l1);
        return l1;
    }
    public void traversal(TreeNode root,List<List<Integer>> list1,int count){
        if(root==null)return;
        if(list1.size()==count){
            list1.add(new ArrayList<>());
        }
        list1.get(count).add(root.val);
        traversal(root.left,list1,count+1);
        traversal(root.right,list1,count+1);
    }
}