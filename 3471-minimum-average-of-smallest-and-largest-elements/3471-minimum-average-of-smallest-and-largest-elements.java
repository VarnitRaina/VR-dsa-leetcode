class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double min=Double.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            min=Math.min(min,(nums[i]+nums[n-i-1])/2.0);
        }
        return min;
    }
}