class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
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