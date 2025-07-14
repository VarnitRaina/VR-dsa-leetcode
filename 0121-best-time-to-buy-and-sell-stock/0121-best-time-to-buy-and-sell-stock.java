class Solution {
    public int maxProfit(int[] nums) {
        int minPrice=Integer.MAX_VALUE,maxProfit=0;
        for(int num:nums){
            if(num<minPrice)minPrice=num;
            if(num-minPrice>maxProfit)maxProfit=num-minPrice;
        }
        return maxProfit;
    }
}