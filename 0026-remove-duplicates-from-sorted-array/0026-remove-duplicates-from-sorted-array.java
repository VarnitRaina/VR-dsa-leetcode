class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,n=nums.length;
        for(int j=i+1;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}