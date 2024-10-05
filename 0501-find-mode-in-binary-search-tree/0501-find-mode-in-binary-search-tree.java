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
    Integer prev=null;
    int count=1;
    int max=0;
    public int[] findMode(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        traverse(root,l1);
        int[] arr=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }
    public void traverse(TreeNode root,List<Integer> list){
        if(root==null)return;
        traverse(root.left,list);
        if(prev!=null){
            if(root.val==prev){
                count++;
            }
            else{
                count=1;
            }
        }
        if(count>max){
            max=count;
            list.clear();
            list.add(root.val);
        }else if(count==max){
            list.add(root.val);
        }
        prev=root.val;
        traverse(root.right,list);
    }
}