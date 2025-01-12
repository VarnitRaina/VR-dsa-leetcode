class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int cSum=0;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(Math.abs(target-sum)<min){
                    min=Math.abs(target-sum);
                    cSum=sum;
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
        return cSum;
    }
}