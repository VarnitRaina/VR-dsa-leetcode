class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer> entry:list){
            char c=entry.getKey();
            int freq=entry.getValue();
            for(int i=0;i<freq;i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}