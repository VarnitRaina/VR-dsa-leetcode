/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        if(original!=null){
            if(original==target)return cloned;
            TreeNode tl=getTargetCopy(original.left,cloned.left,target);
            if(tl!=null)return tl;
            TreeNode tr=getTargetCopy(original.right,cloned.right,target);
            if(tr!=null)return tr;
        }
        return null;
    }
}