class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int prev=0,curr=0;
        int n=nums.length;
        while(curr<n){
            if(nums[curr]%2==0){
                swap(nums,prev,curr);
                prev++;
            }
            curr++;
        }
        return nums;
    }
    public void swap(int[] arr,int prev,int curr){
        int temp=arr[prev];
        arr[prev]=arr[curr];
        arr[curr]=temp;
    }
}