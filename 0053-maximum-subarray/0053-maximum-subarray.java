class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,max=Integer.MIN_VALUE,sum=0;
        for(int num:nums){
            if(sum<0)sum=0;
            sum+=num;
            if(sum>max){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}