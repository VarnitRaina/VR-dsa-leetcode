class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                ans=nums[i];
            }
        }
        return ans;
    }
}