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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        return construct(nums,0,nums.length-1);
    }
    public TreeNode construct(int arr[],int left,int right){
        if(left>right)return null;
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=construct(arr,left,mid-1);
        root.right=construct(arr,mid+1,right);
        return root;
    }
}