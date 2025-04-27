class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length,low=1,high=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int totalhrs=totalhrs(piles,mid);
            if(totalhrs<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int totalhrs(int[] piles,int mid){
        int totalhrs=0,n=piles.length;
        for(int i=0;i<n;i++){
            totalhrs+=Math.ceil((double)piles[i]/(double)mid);
        }
        return totalhrs;
    }
}