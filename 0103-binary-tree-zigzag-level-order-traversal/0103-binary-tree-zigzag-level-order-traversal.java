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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> l1=new ArrayList<>();
    zigzag(root,l1,0);
    return l1;
    }
    public void zigzag(TreeNode root,List<List<Integer>> list1,int count){
        if(root==null)return ;
        if(list1.size()==count){
            list1.add(new ArrayList<>());
        }
        if(count%2==0){
            list1.get(count).add(root.val);
        }
        else{
            list1.get(count).add(0,root.val);
        }
        zigzag(root.left,list1,count+1);
        zigzag(root.right,list1,count+1);
    }
}
