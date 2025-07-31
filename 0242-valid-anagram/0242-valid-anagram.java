class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            map1.put(sc,map1.getOrDefault(sc,0)+1);
            map2.put(tc,map2.getOrDefault(tc,0)+1);
        }
        return map1.equals(map2);
    }
}