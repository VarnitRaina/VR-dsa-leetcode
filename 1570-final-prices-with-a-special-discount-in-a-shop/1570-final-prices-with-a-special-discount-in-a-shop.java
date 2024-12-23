class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] ans=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    ans[i]=prices[i]-prices[j];
                    break;
                }
            }
            if(j>=n){
                ans[i]=prices[i];
            }
        }
        return ans;
    }
}