class Solution {
    public long countBadPairs(int[] nums) {
        long badPairs=0;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int diff=i-nums[i];
            int goodPairs=map.getOrDefault(diff,0);
            badPairs+=i-goodPairs;
            map.put(diff,goodPairs+1);
        }
        return badPairs;
    }
}