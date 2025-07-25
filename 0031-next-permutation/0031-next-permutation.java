class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length,ind=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                ind=i-1;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,ind,i);
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
    public void swap(int[] nums,int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}