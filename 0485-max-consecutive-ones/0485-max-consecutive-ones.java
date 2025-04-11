class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length,count=0,max=0;
        for(int num:nums){
            if(num==1){
                count++;
                if(count>max)max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
}