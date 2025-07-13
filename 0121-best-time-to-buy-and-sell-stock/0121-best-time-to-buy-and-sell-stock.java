class Solution {
    public int maxProfit(int[] nums) {
        int minPrice=Integer.MAX_VALUE,maxProfit=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<minPrice)minPrice=nums[i];
            else if(nums[i]-minPrice>maxProfit)maxProfit=nums[i]-minPrice;
        }
        return maxProfit;
    }
}