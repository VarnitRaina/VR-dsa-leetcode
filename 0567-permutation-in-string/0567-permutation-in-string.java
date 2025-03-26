class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        int n=s1.length();
        for(char c:s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            char c=s2.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int l=0,r=n-1,m=s2.length();
        while(r<m){
            if(map2.equals(map1)){
                return true;
            }
            char leftChar=s2.charAt(l);
            map2.put(leftChar,map2.get(leftChar)-1);
            if(map2.get(leftChar)==0){
                map2.remove(leftChar);
            }
            l++;
            r++;
            if(r<m){
                char rightChar=s2.charAt(r);
                map2.put(rightChar,map2.getOrDefault(rightChar,0)+1);
            }
        }
        return false;
    }
}