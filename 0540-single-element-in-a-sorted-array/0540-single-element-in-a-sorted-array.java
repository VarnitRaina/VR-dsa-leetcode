class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int ans=map.get(key);
            if(ans==1){
                return key;
            }
        }
        return -1;
    }
}