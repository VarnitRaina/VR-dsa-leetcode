class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,n=nums.length;
        while(i<n){
            if(target>nums[i]){
                i++;
            }
            else{
                return i;
            }
        }
        return i;
    }
}