class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.pow(nums[l],2)>=Math.pow(nums[r],2)){
                res[i]=(int)Math.pow(nums[l++],2);
            }
            else{
                res[i]=(int)Math.pow(nums[r--],2);
            }

        }
        return res;
    }
}