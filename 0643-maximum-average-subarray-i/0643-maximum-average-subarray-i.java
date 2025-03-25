class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length,max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            max=Math.max(sum,max);
        }
        return (double)max/k;
    }
}