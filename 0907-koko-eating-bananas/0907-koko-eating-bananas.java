class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length,low=1,high=Integer.MIN_VALUE,ans=0;
        for(int pile:piles){
            high=Math.max(pile,high);
        }
        while(low<high){
            int mid=(low+high)/2;
            if(canEat(piles,h,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean canEat(int piles[],int h,int k){
        int totalhrs=0;
        for(int pile:piles){
            totalhrs+=(int)Math.ceil((double)pile/k);
        }
        return totalhrs<=h;
    }
}