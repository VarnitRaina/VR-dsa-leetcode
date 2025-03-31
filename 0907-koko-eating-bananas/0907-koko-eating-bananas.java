class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length,l=1,r=Integer.MIN_VALUE;
        for(int pile:piles){
            r=Math.max(r,pile);
        }
        while(l<r){
            int mid=(l+r)/2;
            if(canEat(piles,h,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean canEat(int piles[],int h,int k){
        int hours=0;
        for(int pile:piles){
            hours+=(int)Math.ceil((double)pile/k);
        }
        return hours<=h;
    }
}