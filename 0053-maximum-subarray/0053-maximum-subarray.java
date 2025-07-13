class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE,n=nums.length;
        for(int num:nums){
            if(sum<0)sum=0;
            sum+=num;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}