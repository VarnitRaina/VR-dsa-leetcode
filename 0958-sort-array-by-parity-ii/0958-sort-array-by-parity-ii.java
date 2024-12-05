class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int prev=0;
        int curr=1;
        int n=nums.length;
        while(prev<n && curr<n){
            if(nums[prev]%2!=0){
                if(nums[curr]%2==0){
                    swap(nums,prev,curr);
                }
                curr+=2;
            }
            else{
                prev+=2;
            }
        }
        return nums;
    }
    public void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}