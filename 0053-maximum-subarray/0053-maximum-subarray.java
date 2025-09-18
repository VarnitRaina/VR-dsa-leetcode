class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,sum=0,max=Integer.MIN_VALUE;
        for(int num:nums){
            if(sum<0)sum=0;
            sum+=num;
            if(sum>max)max=sum;
        }
        return max;
    }
}