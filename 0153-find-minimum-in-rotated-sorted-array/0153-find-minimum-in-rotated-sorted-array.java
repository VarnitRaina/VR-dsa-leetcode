class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,low=0,high=n-1,pivot=-1;
        if (nums[low] <= nums[high]) {
            return nums[low];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(mid>low && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(mid<high && nums[mid]>nums[mid+1]){
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