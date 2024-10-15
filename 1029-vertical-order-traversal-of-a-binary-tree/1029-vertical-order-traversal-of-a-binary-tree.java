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
    class Pair{
        TreeNode node;
        int vd;
        int hd;
        Pair(TreeNode root,int vd, int hd){
            this.node=root;
            this.vd=vd;
            this.hd=hd;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Map<Integer,List<Pair>> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair pair=q.remove();
            int hd=pair.hd;
            int vd=pair.vd;
            TreeNode temp=pair.node;
            map.putIfAbsent(hd,new ArrayList<>());
            map.get(hd).add(new Pair(temp,vd,hd));
            if(temp.left!=null)q.add(new Pair(temp.left,vd+1,hd-1));
            if(temp.right!=null)q.add(new Pair(temp.right,vd+1,hd+1));
        }
        for(Map.Entry<Integer,List<Pair>> entry:map.entrySet()){
            List<Pair> list=entry.getValue();
            Collections.sort(list,(a,b)->{
                if(a.vd==b.vd){
                    return a.node.val-b.node.val;
                }
                return a.vd-b.vd;
            });
            List<Integer> column=new ArrayList<>();
            for(Pair p:list){
                column.add(p.node.val);
            }
            result.add(column);
        }
        return result;
    }
}