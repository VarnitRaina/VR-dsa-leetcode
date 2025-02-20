class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                min=Math.min(min,nums[i+1]);
            }
        }
        for(int i=n-1;i>0;i--){
            if(nums[i-1]>nums[i]){
                max=Math.max(max,nums[i-1]);
            }
        }
        int l,r;
        for(l=0;l<n;l++){
            if(nums[l]>min){
                break;
            }
        }
        for(r=n-1;r>0;r--){
            if(nums[r]<max){
                break;
            }
        }
        return (r-l>0?r-l+1:0);
    }
}