class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            int missing=arr[m]-m-1;
            if(missing<k){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return l+k;
    }
}