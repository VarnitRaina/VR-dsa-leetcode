class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int i=0;
        int j;
        for(j=0;j<n;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        for(j=i;j<n;j++){
            nums[j]=0;
        }
        return nums;
    }
}