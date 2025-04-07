class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length,count=0,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count=0;
            }
            else{
                count++;
                max=Math.max(max,count);
            }
        }
        return max;
    }
}