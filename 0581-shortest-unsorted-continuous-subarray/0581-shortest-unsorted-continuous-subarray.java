class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums=nums.clone();
        Arrays.sort(snums);
        int n=nums.length;
        int start=n-1,end=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=snums[i]){
                start=Math.min(start,i);
                end=Math.max(end,i);
            }
        }
        return (end-start>0?end-start+1:0);
    }
}