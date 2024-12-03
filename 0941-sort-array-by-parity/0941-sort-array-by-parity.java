class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int prev=0;
        int curr=0;
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
    public void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}