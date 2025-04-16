class Solution {
    public int findMin(int[] nums) {
        int low=0,n=nums.length,high=n-1;
        if(nums[low]<=nums[high])return nums[low];
        while(low<=high){
            int mid=(low+high)/2;
            if(mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(mid<n-1 && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid]>nums[low]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}