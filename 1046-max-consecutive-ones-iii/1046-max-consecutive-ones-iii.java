class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,n=nums.length,max=0,count=0;
        while(r<n){
            if(nums[r]==0){
                count++;
            }
            while(count>k){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}