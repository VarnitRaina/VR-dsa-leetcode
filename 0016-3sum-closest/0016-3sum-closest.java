class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length,csum=0,min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                int diff=Math.abs(sum-target);
                if(diff<min){
                    min=diff;
                    csum=sum;
                }
                if(sum<target){
                    l++;
                }
                else if(sum>target){
                    r--;
                }
                else{
                    return sum;
                }
            }
        }
        return csum;
    }
}