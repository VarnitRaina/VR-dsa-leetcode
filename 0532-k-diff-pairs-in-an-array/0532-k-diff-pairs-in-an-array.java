class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(k>0 && map.containsKey(key+k)){
                count++;
            }
            else if(k==0 && map.get(key)>1){
                count++;
            }
        }
        return count;
    }
}