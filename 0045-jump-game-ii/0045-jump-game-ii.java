class Solution {
    public int jump(int[] nums) {
        int destination=nums.length-1;
        int coverage=0;
        int lastjumpIndex=0;
        int totaljumps=0;
        if (nums.length==1){
            return 0;
        }
        for (int i=0;i<nums.length;i++){
            coverage=Math.max(coverage,i+nums[i]);
            if (i==lastjumpIndex){
                lastjumpIndex=coverage;
                totaljumps++;
            if (coverage>=destination){
                return totaljumps;
            }
        }
    }
    return totaljumps;
}
}