class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length(),m=t.length();
        if(n!=m)return false;
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        return map1.equals(map2);
    }
}