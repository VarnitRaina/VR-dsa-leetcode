class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        double min=Double.MAX_VALUE;
        Arrays.sort(nums);
        while(l<r){
            min=Math.min(min,(nums[l++]+nums[r--])/2.0);
        }
        return min;
    }
}