class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length,max=0,l=0,r=1;
        Arrays.sort(nums);
        if(n<2){
            return 0;
        }
        while(r<n){
            int diff=nums[r]-nums[l];
            if(diff==1){
                max=Math.max(max,r-l+1);
                r++;
            }
            else if(diff>1){
                l++;
            }
            else{
                r++;
            }
        }
        return max;
    }
}