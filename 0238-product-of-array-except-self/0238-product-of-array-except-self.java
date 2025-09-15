class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1,n=nums.length,zeroes=0;
        for(int num:nums){
            if(num==0){
                zeroes++;
                continue;
            }
            prod*=num;
        }
        for(int i=0;i<n;i++){
            if(zeroes>1){
                nums[i]=0;
            }
            else if(zeroes==1){
                if(nums[i]==0)nums[i]=prod;
                else nums[i]=0;
            }
            else{
                nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}