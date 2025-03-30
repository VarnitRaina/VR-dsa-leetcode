class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1,r=Integer.MIN_VALUE;
        for(int pile:piles){
            r=Math.max(r,pile);
        }
        while(l<r){
            int m=(l+r)/2;
            if(canEat(piles,m,h)){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
    public boolean canEat(int[] piles,int k,int h){
        int hours=0;
        for(int pile:piles){
            hours+=(int)Math.ceil((double)pile/k);
        }
        return hours<=h;
    }
}