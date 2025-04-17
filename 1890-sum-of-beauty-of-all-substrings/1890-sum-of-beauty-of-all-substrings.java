class Solution {
    public int beautySum(String s) {
        int n=s.length();
        if(n<3)return 0;
        int count=0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                if(map.size()>1){
                    int maxFreq = Integer.MIN_VALUE;
                    int minFreq = Integer.MAX_VALUE;
                    for (int freq : map.values()) {
                        maxFreq = Math.max(maxFreq, freq);
                        minFreq = Math.min(minFreq, freq);
                    }
                    count+=maxFreq-minFreq;
                }
            }
        }
        return count;
    }
}