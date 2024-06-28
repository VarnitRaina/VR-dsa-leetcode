class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1=new ArrayList<>();
        backtrack(l1,new ArrayList<>(),nums,0);
        return l1;
    }
    public void backtrack(List<List<Integer>> l1,List<Integer>l2,int nums[],int start){
        l1.add(new ArrayList<>(l2));
        for(int i=start;i<nums.length;i++){
            l2.add(nums[i]);
            backtrack(l1,l2,nums,i+1);
            l2.remove(l2.size()-1);
        }
    }
}