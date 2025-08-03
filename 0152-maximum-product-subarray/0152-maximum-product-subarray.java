class Solution {
    public int maxProduct(int[] nums) {
        int pre=1,suf=1,n=nums.length,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            pre*=nums[i];
            max=Math.max(max,pre);
            if(pre==0)pre=1;
            suf*=nums[n-i-1];
            max=Math.max(max,suf);
            if(suf==0)suf=1;
        }
        return max;
    }
}