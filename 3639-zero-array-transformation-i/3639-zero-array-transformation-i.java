class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length,current=0;
        int diff[]=new int[n+1];
        for(int query[]:queries){
            int l=query[0],r=query[1];
            diff[l]--;
            diff[r+1]++;
        }
        for(int i=0;i<n;i++){
            current+=diff[i];
            nums[i]+=current;
            if(nums[i]>0)return false;
        }
        return true;
    }
}