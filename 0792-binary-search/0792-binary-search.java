class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length,low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>nums[mid]){
                low=mid+1;
            }
            else if(target==nums[mid]){
                return mid;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}