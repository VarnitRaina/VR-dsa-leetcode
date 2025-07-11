class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0,count=0;
        for(int num:nums){
            if(num==1){
                ones++;
            }
            else{   
                ones=0;
            }
            count=Math.max(count,ones);
        }
        return count;
    }
}