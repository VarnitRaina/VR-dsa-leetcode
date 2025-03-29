class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length,l=0,r=0;
        for(int weight:weights){
            l=Math.max(l,weight);
            r+=weight;
        }
        while(l<r){
            int m=(l+r)/2;
            if(canShip(weights,days,m)){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
    public boolean canShip(int[]weights,int days,int capacity){
        int daysRequired=1,currentLoad=0;
        for(int weight:weights){
            if(currentLoad+weight>capacity){
                daysRequired++;
                currentLoad=0;
            }
            currentLoad+=weight;
        }
        return daysRequired<=days;
    }
}