class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            if(nums[i].charAt(i)=='1'){
                res.append('0');
            }
            else{
                res.append('1');
            }
        }
        return res.toString();
    }
}