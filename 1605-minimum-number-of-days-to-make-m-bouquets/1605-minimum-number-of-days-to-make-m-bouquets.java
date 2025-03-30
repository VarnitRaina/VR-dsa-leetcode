class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length,l=Integer.MAX_VALUE,r=Integer.MIN_VALUE;
        if((long)m*k>n)return -1;
        for(int bloom:bloomDay){
            l=Math.min(l,bloom);
            r=Math.max(r,bloom);
        }
        while(l<r){
            int mid=(l+r)/2;
            if(canMake(bloomDay,mid,m,k)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean canMake(int[] nums,int day,int m,int k){
        int bouquets=0,flowers=0;
        for(int num:nums){
            if(num<=day){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
            if(bouquets>=m)return true;
        }
        return false;
    }
}