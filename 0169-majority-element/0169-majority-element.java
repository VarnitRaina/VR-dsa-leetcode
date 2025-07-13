class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0],count=1,n=nums.length;
        for(int i=1;i<n;i++){
            if(a==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                a=nums[i];
            }
        }
        return a;
    }
}