class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,n=nums.length;
        for(int j=0;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}