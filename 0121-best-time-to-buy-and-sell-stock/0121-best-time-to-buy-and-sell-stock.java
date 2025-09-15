class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,minPrice=Integer.MAX_VALUE,maxProfit=0;
        for(int num:prices){
            if(num<minPrice)minPrice=num;
            if(num-minPrice>maxProfit)maxProfit=num-minPrice;
        }
        return maxProfit;
    }
}