class Solution {
    public int maximumSum(int[] nums) {
        int max=-1;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            int sum=sum(num);
            if(map.containsKey(sum)){
                max=Math.max(max,map.get(sum)+num);
            }
            map.put(sum,Math.max(map.getOrDefault(sum,0),num));
        }
        return max;
    }
    public int sum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}