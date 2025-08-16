class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[]nums,int k){
        int l=0,n=nums.length,count=0,odd=0;
        for(int r=0;r<n;r++){
            odd+=nums[r]%2;
            while(odd>k && l<n){
                odd-=nums[l]%2;
                l++;
            }
           count+=r-l+1;
        }
        return count;
    }
}