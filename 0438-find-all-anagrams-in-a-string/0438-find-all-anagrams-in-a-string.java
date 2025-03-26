class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        if (s.length() < p.length()) return ans;
        for(char c:p.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(int i=0;i<p.length();i++){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }
        int l=0,r=p.length()-1,n=s.length();
        while(r<n){
            if(map1.equals(map2)){
                ans.add(l);
            }  
            char leftChar=s.charAt(l);
            map2.put(leftChar,map2.get(leftChar)-1);
            if(map2.get(leftChar)==0){
                map2.remove(leftChar);
            }
            l++;
            r++;
            if(r<n){
                char rightChar=s.charAt(r);
                map2.put(rightChar,map2.getOrDefault(rightChar,0)+1);
            }
        }
        return ans;
    }
}